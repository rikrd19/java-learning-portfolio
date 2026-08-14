package zona_fit.datos;

import zona_fit.conexion.Conexion;
import zona_fit.dominio.Cliente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import static zona_fit.conexion.Conexion.getConexion;

public class ClienteDao implements IClienteDao {

    @Override
    public List<Cliente> listarClientes() {
        List<Cliente> clientes = new ArrayList<>();
        PreparedStatement ps;
        ResultSet rs;
        Connection con = getConexion();
        String sql = "SELECT * FROM cliente ORDER BY id";
        try {
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Cliente cliente = new Cliente();
                cliente.setId(rs.getInt("id"));
                cliente.setNombre(rs.getString("nombre"));
                cliente.setApellido(rs.getString("apellido"));
                cliente.setMembresia(rs.getInt("membresia"));
                clientes.add(cliente);
            }
        } catch (Exception e) {
            System.out.println("Error al listar clientes: " + e.getMessage());
        } finally {
            try {
                con.close();
            } catch (Exception e) {
                System.out.println("Error al cerrar la conexion: " + e.getMessage());
            }
        }
        return clientes;
    }

    @Override
    public boolean buscarClientePorId(Cliente cliente) {
        PreparedStatement ps;
        ResultSet rs;
        Connection con = getConexion();
        String sql = "SELECT * FROM cliente WHERE id = ?";
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, cliente.getId());
            rs = ps.executeQuery();
            if (rs.next()) {
                cliente.setNombre(rs.getString("nombre"));
                cliente.setApellido(rs.getString("apellido"));
                cliente.setMembresia(rs.getInt("membresia"));
                return true;
            }
        } catch (Exception e) {
            System.out.println("Error al recuperar cliente por id: " + e.getMessage());
        }finally {
            try {
                con.close();
            } catch (Exception e) {
                System.out.println("Error al cerrar conexion "+ e.getMessage());
            }
        }
        return false;
    }

    @Override
    public boolean agregarCliente(Cliente cliente) {
        PreparedStatement ps;
        Connection con = getConexion();
        String sql = "INSERT INTO cliente(nombre, apellido, membresia) "
                + " VALUES(?, ?, ?)";
        try {
            ps = con.prepareStatement(sql);

            ps.setString(1, cliente.getNombre());
            ps.setString(2, cliente.getApellido());
            ps.setInt(3, cliente.getMembresia());
            // Ejecutar la consulta
            ps.execute();
            return true;
        } catch (Exception e) {
            System.out.println("Error al agregar cliente: " + e.getMessage());
        } finally {
            try {
                con.close();
            } catch (Exception e) {
                System.out.println("Error al cerrar conexion: " + e.getMessage());
            }finally {
                try {
                    con.close();
                } catch (Exception e) {
                    System.out.println("Error al cerrar conexion: " + e.getMessage());
                }
            }
        }
        return false;
    }

    @Override
    public boolean modificarCliente(Cliente cliente) {
        PreparedStatement ps;
        Connection con = getConexion();
        String sql = "UPDATE cliente SET nombre=?, apellido=?, membresia=? WHERE id=?";
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, cliente.getNombre());
            ps.setString(2, cliente.getApellido());
            ps.setInt(3, cliente.getMembresia());
            ps.setInt(4, cliente.getId());
            // Ejecutar la consulta
            ps.execute();
            return true;
        } catch (Exception e) {
            System.out.println("Error al modificar cliente: "+e.getMessage());
        }finally {
            try {
                con.close();
            }catch (Exception e){
                System.out.println("Error al cerrar la conexion: "+ e.getMessage());
            }
        }
        return false;
    }

    @Override
    public boolean eliminarCliente(Cliente cliente) {
            PreparedStatement ps;
            Connection con = getConexion();
            String sql = "DELETE FROM cliente WHERE id=?";
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, cliente.getId());
            // Ejecutar la consulta
            ps.execute();
            return true;

        } catch (Exception e) {
            System.out.println("Error al eliminar cliente: "+ e.getMessage());
        }finally {
            try {
                con.close();
            }catch (Exception e){
                System.out.println("Error al cerrar la conexion: "+ e.getMessage());
            }
        }
        return false;
    }


    public static void main(String[] args) {
        IClienteDao clienteDao = new ClienteDao();

        // Listar clientes
      /*  System.out.println("*** Listar Clientes ****");
        IClienteDao clienteDao = new ClienteDao();

        List<Cliente> clientes = clienteDao.listarClientes();
        clientes.forEach(System.out::println);*/

        // Buscar cliente por id
        /*Cliente cliente1 = new Cliente(1);
        System.out.println("Cliente antes de la busqueda: "+ cliente1);
        boolean encontrado = clienteDao.buscarClientePorId(cliente1);
        if (encontrado) {
            System.out.println("Cliente encontrado : "+ cliente1);
        }else {
            System.out.println("No se encontro cliente: "+ cliente1.getId());
        }*/

            // Agregar cliente
     /*   Cliente nuevoCliente = new Cliente("Daniel", "Ortiz", 300);
        boolean agregado = clienteDao.agregarCliente(nuevoCliente);
        if (agregado) {
            System.out.println("Cliente agregado " + nuevoCliente);
        } else {
            System.out.println("No se agrego el cliente: "+ nuevoCliente);
        }
*/

        // Modificar cliente
        /*Cliente modificarCliente = new Cliente(5, "Carlos Daniel", "Ortiz", 300);
        boolean modificado = clienteDao.modificarCliente(modificarCliente);
        if (modificado) {
            System.out.println("Cliente modificado: " + modificarCliente);
        } else {
            System.out.println("No se modifico cliente: "+ modificarCliente);
        }*/

        // Eliminar cliente
        Cliente clienteEliminar = new Cliente(4);
        boolean elminado = clienteDao.eliminarCliente(clienteEliminar);
        if (elminado) {
            System.out.println("Clinte eliminado: " + clienteEliminar);
        }else {
            System.out.println("No se elimino el cliente: "+ clienteEliminar);
        }

        // Listar clientes  se copio el codigo de arriba para verificar que se agrego el cliente
        System.out.println("*** Listar Clientes ****");

        List<Cliente> clientes = clienteDao.listarClientes();
        clientes.forEach(System.out::println);
    }
}
