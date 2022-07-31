
package Clases;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;



/**
 *
 * @author SAMSUNG
 */
public class ClsJdbc {
    
    String driver= "com.mysql.cj.jdbc.Driver";   
    String usuario = "root";
    String contraseña= "";
    String bd= "elecciones_stephaniecangrejo";
    String puerto= "3306";
   String url= "jdbc:mysql://localhost:" + puerto + "/" + bd;
   public Connection conexion;
    
    
    public void CrearConexion (){
        
        try {
            
            Class.forName (driver);
            this.conexion =DriverManager.getConnection(url,usuario,contraseña);
            if (conexion !=null){
                System.out.println("Conexión exitosa");
            }
                      
  
        } catch (Exception e ){
            System.out.println("No fue posible la conexión"+ e.getMessage());
                
        }
        
        
        }

    public PreparedStatement prepareStatemente(String consulta) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
        }
        
    
    
    

