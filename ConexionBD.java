/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author Monzón
 */
public class ConexionBD {
    Connection con;
    String driver="com.mysql.cj.jdbc.Driver";
    String dbName="productos";
    String url= "jdbc:mysql://localhost:3306/"+dbName+"?useSSL=false&serverTimezone=UTC";
    String usuario="root";
    String clave="";
     public Connection ConectarBaseDatos() {
       try{
           Class.forName(driver);
           con = (Connection) DriverManager.getConnection(url,usuario, clave);
        }catch(ClassNotFoundException | SQLException e){
            System.out.println("Error en la conexion:" + e);
        }
        return con;
    }
}

