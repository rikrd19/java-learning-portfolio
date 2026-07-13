#!/bin/bash
# Runs the remote EJB client with GlassFish 8 ACC classloader.
# Usage: ./run-client.sh [fully.qualified.MainClass]

set -euo pipefail

SCRIPT_DIR="$(cd "$(dirname "$0")" && pwd)"
GF_HOME="/Users/ricardoavila/Proyectos-Aprendizaje-JAVA-con-IntelliJ-IDEA/Curso-Java-Udemy-Cero-a-Experto/curso-Java-con-IDE-Netbeans/Instalacion-de-Glassfish-8-en-Netbeans24-y-JDK21/GlassFish_Server"
GF_CLIENT="$GF_HOME/glassfish/lib/gf-client.jar"
GF_BOOTSTRAP="$GF_HOME/glassfish/lib/bootstrap"
CLASSES="$SCRIPT_DIR/target/classes"

MAIN_CLASS="${1:-avilawebservice.test.TestHolaMundoEJB}"

# Prefer NetBeans JDK if JAVA_HOME is not set
if [[ -z "${JAVA_HOME:-}" && -x "/Applications/Apache NetBeans.app/Contents/Home/bin/java" ]]; then
  JAVA_HOME="/Applications/Apache NetBeans.app/Contents/Home"
fi
JAVA_BIN="${JAVA_HOME:-}/bin/java"
if [[ ! -x "$JAVA_BIN" ]]; then
  JAVA_BIN="$(command -v java)"
fi

if [[ ! -f "$GF_CLIENT" ]]; then
  echo "GlassFish gf-client.jar not found: $GF_CLIENT" >&2
  exit 1
fi

mkdir -p "$CLASSES"
# Ensure classes are compiled
if [[ ! -f "$CLASSES/${MAIN_CLASS//.//}.class" ]]; then
  (cd "$SCRIPT_DIR" && mvn -q -DskipTests process-classes)
fi

exec "$JAVA_BIN" \
  --module-path "$GF_BOOTSTRAP" \
  --add-modules ALL-MODULE-PATH \
  --add-opens=java.base/java.lang=ALL-UNNAMED \
  -Xshare:off \
  -Djava.system.class.loader=org.glassfish.appclient.client.acc.agent.ACCAgentClassLoader \
  -classpath "$GF_CLIENT:$CLASSES" \
  "$MAIN_CLASS"
