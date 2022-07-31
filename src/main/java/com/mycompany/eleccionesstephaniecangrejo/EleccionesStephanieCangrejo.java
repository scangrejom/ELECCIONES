

package com.mycompany.eleccionesstephaniecangrejo;

import Clases.ClsJdbc;
import Clases.ClsVotantes;
import Modelos.MdlCandidatos;


public class EleccionesStephanieCangrejo {
    

    public static void main(String[] args) {
        
        ClsJdbc jdbc= new ClsJdbc ();
        jdbc.CrearConexion();
        
        
        MdlCandidatos candidatos=new MdlCandidatos();
        candidatos.Obtenercandidatos();
        
        
      
    
        
        
   
       // ClsVotantes votantes = new ClsVotantes ( );
       
    }

    
}
