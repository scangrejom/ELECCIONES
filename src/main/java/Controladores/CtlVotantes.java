
package Controladores;

import Clases.ClsCandidatos;
import Clases.ClsVotantes;
import Modelos.MdlVotantes;

/**
 *
 * @author SAMSUNG
 */
public class CtlVotantes {
    
    MdlVotantes modelo;
   
    public CtlVotantes(){
        this.modelo= new MdlVotantes ();
        
    }
         public boolean agregarVotantes (ClsVotantes votantes){
        
        return this.modelo.agregarVotantes(votantes);
   
         }

}
        
    

