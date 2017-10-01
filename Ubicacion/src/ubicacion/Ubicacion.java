
package ubicacion;


public class Ubicacion {

   
    public static void main(String[] args) {
       Conexion miConexion=new Conexion();
       miConexion.conectar();
       
       Ventana miVentana =new Ventana();
       miVentana.setVisible(true);
    }
    
}
