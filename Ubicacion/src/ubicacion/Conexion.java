
package ubicacion;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Conexion {
    Connection conexion;
    String url="jdbc:mysql://localhost:3306/coordenadas";
    String usuario="root";
    String clave="mysql2017";
    
    float lat,lon;
    
    public void conectar(){
        try {
            conexion= (Connection) DriverManager.getConnection(url,usuario,clave);
            System.out.println("Me conecto");
            String cadena="INSERT INTO ubicacion (latitud,longitud) VALUES("+lat+","+lon+")";
            Statement sentencia;
            sentencia=conexion.createStatement();
            sentencia.execute(cadena);
            
        } catch (SQLException ex) {
           System.out.println(ex.getMessage());
        }
    }
    
}
