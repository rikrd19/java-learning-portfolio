#!/usr/bin/env bash
# One-time (or when needed): stop Oracle-installed MySQL on port 3306, then start Homebrew MySQL on 3306.
# Run from Terminal: bash scripts/stop_oracle_mysql_then_homebrew.sh

set -euo pipefail
PLIST="/Library/LaunchDaemons/com.oracle.oss.mysql.mysqld.plist"

if lsof -nP -iTCP:3306 -sTCP:LISTEN 2>/dev/null | grep -q mysqld; then
  echo "Something is listening on TCP 3306:"
  lsof -nP -iTCP:3306 -sTCP:LISTEN || true
fi

if [[ -f "$PLIST" ]]; then
  echo "Stopping Oracle MySQL service (you will be prompted for your Mac admin password)..."
  sudo launchctl bootout system "$PLIST" 2>/dev/null || sudo launchctl unload -w "$PLIST" 2>/dev/null || true
fi

if pgrep -f '/usr/local/mysql/bin/mysqld' >/dev/null 2>&1; then
  echo "Trying mysql.server stop (admin password may be required)..."
  sudo /usr/local/mysql/support-files/mysql.server stop 2>/dev/null || true
  sleep 2
fi

if pgrep -f '/usr/local/mysql/bin/mysqld' >/dev/null 2>&1; then
  echo "ERROR: Oracle mysqld is still running. Stop it from System Settings or MySQL preference pane, then run this script again."
  exit 1
fi

echo "Restarting Homebrew MySQL..."
brew services restart mysql

echo "Waiting for MySQL to accept TCP on 3306 (up to 45s)..."
ready=0
for i in $(seq 1 45); do
  if mysql -u root --password=curso123 -h 127.0.0.1 -P 3306 --protocol=TCP -e "SELECT 1" &>/dev/null; then
    echo "MySQL responded after ${i}s."
    ready=1
    break
  fi
  sleep 1
done
if [[ "$ready" -ne 1 ]]; then
  echo "ERROR: MySQL did not become ready on 127.0.0.1:3306. Check:"
  echo "  tail -40 /opt/homebrew/var/mysql/*.err"
  echo "  brew services list | grep mysql"
  exit 1
fi

echo "Listener on 3306:"
lsof -nP -iTCP:3306 -sTCP:LISTEN || true

mysql -u root --password=curso123 -h 127.0.0.1 -P 3306 --protocol=TCP -e "SELECT @@port AS port, @@socket AS socket, VERSION() AS version;" 2>&1

echo "Done. Workbench: 127.0.0.1, port 3306, user root, password curso123"
