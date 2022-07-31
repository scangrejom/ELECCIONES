
package Clases;


public class ClsVotantes extends ClsPersonas {
    
   private String paisResidencia;
    private String ciudadResidencia;

    public ClsVotantes( String tipoDocumento, String numeroDocumento, 
            String nombre, String telefono, String correo, String paisResidencia,
            String ciudadResidencia) {
        super(tipoDocumento, numeroDocumento, nombre, telefono, correo);
        this.paisResidencia = paisResidencia;
        this.ciudadResidencia = ciudadResidencia;
        
    
    }

    
      public String getPaisResidencia() {
        return paisResidencia;
    }

    public void setPaisResidencia(String paisResidencia) {
        this.paisResidencia = paisResidencia;
    }

    public String getCiudadResidencia() {
        return ciudadResidencia;
    }

    public void setCiudadResidencia(String ciudadResidencia) {
        this.ciudadResidencia = ciudadResidencia;
    }
    
  
    
    
    
 
    
}
