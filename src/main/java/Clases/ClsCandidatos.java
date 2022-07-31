
package Clases;

import java.util.LinkedList;

public class ClsCandidatos extends ClsPersonas {
    
    private String partidoPolitico;
    private String ciudadOrigen;
    private String mensajeCampania;
    private String propuesta;

    public ClsCandidatos(String tipoDocumento, String numeroDocumento, 
                    String nombre, String telefono, 
                    String correo,String partidoPolitico, String ciudadOrigen, 
                     String mensajeCampania, String 
                    propuesta ) {
        super(tipoDocumento, numeroDocumento, nombre, telefono, correo);
        this.partidoPolitico = partidoPolitico;
        this.ciudadOrigen = ciudadOrigen;
        this.mensajeCampania = mensajeCampania;
        this.propuesta=propuesta;
    }

    public ClsCandidatos(String tipo_documento, String numeroDocumento, String nombre, String correo, String string, String ciudad, String mensaje, String propuestas) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

         
   
    public String getPartidoPolitico() {
        return partidoPolitico;
    }

    public void setPartidoPolitico(String partidoPolitico) {
        this.partidoPolitico = partidoPolitico;
    }

    public String getCiudadOrigen() {
        return ciudadOrigen;
    }

    public void setCiudadOrigen(String ciudadOrigen) {
        this.ciudadOrigen = ciudadOrigen;
    }

   
    public String getMensajecampania() {
        return mensajeCampania;
    }

    public void setMensajecampania(String mensajecampania) {
        this.mensajeCampania = mensajecampania;
    }

    public String getPropuesta() {
        return propuesta;
    }

    public void setPropuesta(String propuesta) {
        this.propuesta = propuesta;
    }

    public void add(ClsCandidatos candidatos) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }


}