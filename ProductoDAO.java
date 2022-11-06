package modelo;

import controlador.ConexionBD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class ProductoDAO {
    ConexionBD conexion= new ConexionBD();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    
    public List listar(){
        String sql ="select * from productos";
        List<Producto> lista=new ArrayList<>();
        try{
            con = conexion.ConectarBaseDatos();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()){
                Producto producto= new Producto();
                producto.setCodigo(rs.getInt(1));
                producto.setNombre(rs.getString(2));
                producto.setStckInicial(rs.getInt(3));
                producto.setEntradas(rs.getInt(4));
                producto.setSalidas(rs.getInt(5));
                producto.setTotal(rs.getInt(6));
                lista.add(producto);
            }  
        }catch (Exception e){
        System.out.println("");
        }
        return lista;
    }
    public void agregar(Producto producto){
        String sql = "insert into productos(nombre, precio, StckInicial, Entradas, Salidas, Total) values(?, ?, ?, ?, ?, ?)";
        try {
            con=conexion.ConectarBaseDatos();
            ps = con.prepareCall(sql);
            ps.setString(1, producto.getNombre());
            ps.setInt(2, producto.getStckInicial());
            ps.setInt(3, producto.getEntradas());
            ps.setInt(4, producto.getSalidas());
            ps.setInt(5, producto.getTotal());
            ps.executeQuery();
        } catch (SQLException e) {
            System.out.println("Error en Agregar: "+e);
        }
    }
}