/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package crm.control;

import crm.model.Curso;
import crm.model.GrupoDeEstudio;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

/**
 *
 * @author Administrador
 */
public class AdmGrupoDeEstudio {
    private ArrayList<GrupoDeEstudio> grupos;
    
    public AdmGrupoDeEstudio() {
        grupos = new ArrayList<GrupoDeEstudio>();
    }
    
        private void ValidarDatosGrupoDeEstudio(String nombre, String fInicio, String fFin) throws BusinessException {
        String mensaje = "";
        
        if (nombre==null || nombre.isEmpty())
            mensaje += "\nNombre de Grupo no puede ser nulo o vacio";
        if (fInicio==null || fInicio.isEmpty())
            mensaje += "\nFecha Inicio no puede ser nulo o vacio";
        if (fFin==null || fFin.isEmpty())
            mensaje += "\nFecha Fin no puede ser nulo o vacio";
        throw new BusinessException(mensaje);  
    }

    void registrarGrupoDeEstudio(String nombre, String academia, Curso curso, String fechaInicio, String fechaFin, String estado, String descripcion, String instructor, String linkSillabus, String local, String aula, String googleMaps) throws BusinessException {
        ValidarDatosGrupoDeEstudio(nombre, fechaInicio, aula);        
        GrupoDeEstudio grupo = new GrupoDeEstudio(nombre, academia, curso, fechaInicio, fechaFin, estado, descripcion, instructor, linkSillabus, local, aula, googleMaps);
        grupos.add(grupo);
        
        
    }
    
   public GrupoDeEstudio buscarGrupoDeEstudio(String nombre,String academia, String fInicio,String fFin,String estado) {
   
       for (GrupoDeEstudio grupo : grupos)  
        
             if(nombre.equals(grupo.getNombre()) || nombre.equals(grupo.getNombre())
                     || nombre.equals(grupo.getNombre()) || academia.equals(grupo.getAcademia())
                     || fInicio.equals(grupo.getFechaInicio())
                     || fFin.equals(grupo.getFechaFin()) || estado.equals(grupo.getEstado())  )
             
                return grupo;
             return null;
             
   }


}
   

    
         
   



   

