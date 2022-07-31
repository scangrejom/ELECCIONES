/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelos;

import Clases.ClsCandidatos;
import Clases.ClsJdbc;
import Clases.ClsMensaje;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.LinkedList;


public class MdlCandidatos {
    
ClsJdbc jdbc= new ClsJdbc ();

public  MdlCandidatos () {
    
    
    jdbc.CrearConexion ();
}


    public ClsMensaje agregarCandidatos(ClsCandidatos candidatos) {
      
        ClsMensaje mensaje;
        
        
        try {
            
            
          String sql= "INSERT INTO tbl_Candidatos VALUES (?,?,?,?,?,?,?,?)";  
          PreparedStatement sentencia= this.jdbc.conexion.prepareStatement(sql);           
          sentencia.setString(1, candidatos.getTipoDocumento());
          sentencia.setString(2, candidatos.getNumeroDocumento());
          sentencia.setString(3, candidatos.getNombre());
          sentencia.setString(4, candidatos.getTelefono());
          sentencia.setString(5, candidatos.getCorreo());
          sentencia.setString(6, candidatos.getCiudadOrigen());
          sentencia.setString(7, candidatos.getPartidoPolitico());
          sentencia.setString(8, candidatos.getMensajecampania());
          sentencia.setString(9, candidatos.getPropuesta());
          
          int resultado =sentencia.executeUpdate();
          
          if (resultado>=1){
           mensaje= new ClsMensaje(ClsMensaje.OK,"EL CANDIDATO HA SIDO CREADO");
          }else {
           mensaje= new ClsMensaje(ClsMensaje.ERROR,"EL CANDIDATO NO HA SIDO CREADO");
          }
          
          return mensaje;    
          
                    
          
        }catch (Exception e){
            mensaje= new ClsMensaje(ClsMensaje.ERROR,"OCURRIO UN ERROR"+ e.getMessage());
            return mensaje;
        }
        
               
           
       }
    
    public LinkedList<ClsCandidatos> Obtenercandidatos (){
        
    try {
        LinkedList<ClsCandidatos> candidatos= new LinkedList<> ();
        String consulta= "SELEC  * FROM tbl_Candidatos";
        PreparedStatement sentencia= this.jdbc.conexion.prepareStatement(consulta);
        ResultSet resultados= sentencia.executeQuery();
        
        while (resultados.next()){
            
        String tipo_documento= resultados.getString("tipo_documento");
        String numeroDocumento= resultados.getString("id_candidato");
        String nombre= resultados.getString("nombre");
        String correo= resultados.getString("correo");
        String ciudad= resultados.getString("Ciudad_origen");
        String mensaje= resultados.getString("mensaje");
        String propuestas= resultados.getString("propuestas");
        
        
        //String tipoDocumento, String numeroDocumento, String nombre, String telefono, 
         // String correo,String partidoPolitico, String ciudadOrigen, 
       // String mensajeCampania, String propuesta//
        
        ClsCandidatos candidato= new ClsCandidatos(tipo_documento, numeroDocumento, nombre,correo,"", ciudad,mensaje,propuestas);
        
        candidatos.add(candidato);
        
        }
        
        return candidatos;
        
       
    }catch (Exception e){
        return null;
        
    }
        
    }
    }  
    
    

        
   
