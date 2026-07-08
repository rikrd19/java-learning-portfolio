package com.avilawebservices.datos;

import static com.avilawebservices.datos.Conexion.*;
import static com.avilawebservices.datos.Conexion.getConnection;
import com.avilawebservices.domain.Usuario;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UsuarioDAO {

    private static final String SQL_SELECT = "SELECT id_usuario, username, password FROM usuario";
    private static final String SQL_INSERT = "INSERT INTO usuario(username, password) VALUE (?, ?)";
    private static final String SQL_UPDATE = "UPDATE usuario SET username=?, password=? WHERE id_usuario=?";
    private static final String SQL_DELETE = "DELETE FROM usuario WHERE id_usuario = ?";

    public List<Usuario> seleccionar() {
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        Usuario usuario = null;
        List<Usuario> listaUsuarios = new ArrayList<>();

        try {
            conn = getConnection();
            ps = conn.prepareStatement(SQL_SELECT);
            rs = ps.executeQuery();

            while (rs.next()) {
                int id_usuario = rs.getInt("id_usuario");
                String username = rs.getString("username");
                String password = rs.getString("password");

                usuario = new Usuario(id_usuario, username, password);

                listaUsuarios.add(usuario);
            }
        } catch (SQLException e) {
            e.printStackTrace(System.out);
        } finally {
            try {
                close(rs);
                close(ps);
                close(conn);
            } catch (SQLException e) {
                e.printStackTrace(System.out);
            }

        }
        return listaUsuarios;
    }

    public int insertar(Usuario usuario) {
        Connection conn = null;
        PreparedStatement ps = null;
        int registros = 0;
        try {
            conn = getConnection();
            ps = conn.prepareStatement(SQL_INSERT);
            ps.setString(1, usuario.getUsername());
            ps.setString(2, usuario.getPassword());
            registros = ps.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace(System.out);
        } finally {
            try {
                close(ps);
                close(conn);
            } catch (SQLException e) {
                e.printStackTrace(System.out);
            }
        }
        return registros;
    }

    public int actualizar(Usuario usuario) {
        Connection conn = null;
        PreparedStatement ps = null;
        int registros = 0;

        try {
            conn = getConnection();
            ps = conn.prepareStatement(SQL_UPDATE);
            ps.setString(1, usuario.getUsername());
            ps.setString(2, usuario.getPassword());
            ps.setInt(3, usuario.getId_usuario());
            registros = ps.executeUpdate();
            System.out.println("Registros actualizados: " + registros);
        } catch (SQLException e) {
            e.printStackTrace(System.out);
        } finally {
            try {
                close(ps);
                close(conn);
            } catch (SQLException e) {
                e.printStackTrace(System.out);
            }
        }
        return registros;
    }

    public int eliminar(Usuario usuario) {
        Connection conn = null;
        PreparedStatement stmt = null;
        int registros = 0;
        try {
            conn = getConnection();
            stmt = conn.prepareStatement(SQL_DELETE);
            stmt.setInt(1, usuario.getId_usuario());
            registros = stmt.executeUpdate();
            System.out.println("Registros eliminados: " + registros);
        } catch (SQLException e) {
            e.printStackTrace(System.out);
        } finally {
            try {
                close(stmt);
                close(conn);
            } catch (SQLException e) {
                e.printStackTrace(System.out);
            }
        }
        return registros;
    }
}
