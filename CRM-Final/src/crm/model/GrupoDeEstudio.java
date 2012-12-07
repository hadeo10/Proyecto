
package crm.model;

import java.util.Comparator;

/**
 *
 * @author Administrador
 */
public class GrupoDeEstudio {
    private String nombre;
    private String academia;
    public Curso curso;
    private String fechaInicio;
    private String fechaFin;
    private String estado;
    private String descripcion;
    private String instructor;
    private String linkSillabus;
    private String local;
    private String aula;
    private String googleMaps;

    public GrupoDeEstudio(String nombre, String academia, Curso curso, String fechaInicio, String fechaFin, String estado, String descripcion, String instructor, String linkSillabus, String local, String aula, String googleMaps) {
        this.nombre = nombre;
        this.academia = academia;
        this.curso = curso;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.estado = estado;
        this.descripcion = descripcion;
        this.instructor = instructor;
        this.linkSillabus = linkSillabus;
        this.local = local;
        this.aula = aula;
        this.googleMaps = googleMaps;
    }

    public String getAcademia() {
        return academia;
    }

    public void setAcademia(String academia) {
        this.academia = academia;
    }

    public String getAula() {
        return aula;
    }

    public void setAula(String aula) {
        this.aula = aula;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(String fechaFin) {
        this.fechaFin = fechaFin;
    }

    public String getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(String fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public String getGoogleMaps() {
        return googleMaps;
    }

    public void setGoogleMaps(String googleMaps) {
        this.googleMaps = googleMaps;
    }

    public String getInstructor() {
        return instructor;
    }

    public void setInstructor(String instructor) {
        this.instructor = instructor;
    }

    public String getLinkSillabus() {
        return linkSillabus;
    }

    public void setLinkSillabus(String linkSillabus) {
        this.linkSillabus = linkSillabus;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
 class OrdenaPorFechaInicio implements Comparator<GrupoDeEstudio>
{
    public int compare(GrupoDeEstudio g1, GrupoDeEstudio g2){
        //ascendente
        // return Integer.parseInt(cl1.getFechaIngreso()) - Integer.parseInt(cl2.getFechaIngreso());
        
        //descendente
        return Integer.parseInt(g2.getFechaInicio()) - Integer.parseInt(g1.getFechaInicio());
    }
}

     public int compareToFechaInicio(GrupoDeEstudio grupo){
        Integer intComparador = Integer.parseInt(getFechaInicio());
        Integer intComparable = Integer.parseInt(grupo.getFechaInicio());
        return intComparador.compareTo(intComparable);
    }
 
    
}
