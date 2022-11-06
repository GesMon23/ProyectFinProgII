
package controlador;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Connection;
import modelo.Inventario;
import modelo.Producto;

public class ControladorInventario {
   ConexionBD conexion = new ConexionBD();
   Connection con;
   PreparedStatement ps;   
   
    
    public void guardar(Inventario inventario){
        Producto producto = new Producto();
        String sql = "INSERT INTO producto (Id, fecha_inicial, Codigo, fecha_fin) VALUES (?, ?, ?, ?);";
        try {
            con = conexion.ConectarBaseDatos();
            
            ps = con.prepareStatement(sql);
            ps.setInt(1, inventario.getId());
            ps.setString(2, inventario.getFech_in());
            ps.setInt(3, producto.getCodigo());
            ps.setString(4, inventario.getFech_fin());
            ps.executeUpdate();
                        
        } catch (SQLException e) {
            System.out.println("ERROR EN GUARDAR: "+e);
        }
        
        
    }  
}
