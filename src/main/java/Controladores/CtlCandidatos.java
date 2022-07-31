
package Controladores;

import Clases.ClsCandidatos;
import Clases.ClsMensaje;
import Modelos.MdlCandidatos;
import java.util.LinkedList;

/**
 *
 * @author SAMSUNG
 */
public class CtlCandidatos {
    
    MdlCandidatos modelo;
    
    public CtlCandidatos(){
    this.modelo= new MdlCandidatos();
    
    } 
    
    public ClsMensaje agregarCandidatos (ClsCandidatos candidatos){
        
        return this.modelo.agregarCandidatos(candidatos);
        
    }
       public LinkedList<ClsCandidatos> Obtenercandidatos (){
        
           return this.modelo.Obtenercandidatos();
       
       }
}
        


    

