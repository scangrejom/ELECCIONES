
package Clases;
import java.util.LinkedList;
public class ClsElecciones {
    
    private LinkedList <String> listaCandidatos;
    private LinkedList<ClsVotantes> listaVotantes;
    private String fechaInicio;
    private String fechaFin;
    private String estado;
    private ClsCandidatos ganador;

    public ClsElecciones(LinkedList<String> listaCandidatos, LinkedList<ClsVotantes> listaVotantes, String fechaInicio, String fechaFin, String estado, ClsCandidatos ganador) {
        this.listaCandidatos = listaCandidatos;
        this.listaVotantes = listaVotantes;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.estado = estado;
        this.ganador = ganador;
    }

    public LinkedList <String> getListaCandidatos() {
        return listaCandidatos;
    }

    public void setListaCandidatos(LinkedList <String> listaCandidatos) {
        this.listaCandidatos = listaCandidatos;
    }

    public LinkedList<ClsVotantes> getListaVotantes() {
        return listaVotantes;
    }

    public void setListaVotantes(LinkedList<ClsVotantes> listaVotantes) {
        this.listaVotantes = listaVotantes;
    }

    public String getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(String fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public String getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(String fechaFin) {
        this.fechaFin = fechaFin;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public ClsCandidatos getGanador() {
        return ganador;
    }

    public void setGanador(ClsCandidatos ganador) {
        this.ganador = ganador;
    }
    
    

}       