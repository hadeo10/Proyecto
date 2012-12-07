
package crm.control;

import crm.model.Curso;
import java.util.ArrayList;

/**
 *
 * @author Administrador
 */
public class AdmCurso {
    private ArrayList<Curso> cursos;

    public AdmCurso() {
        cursos = new ArrayList<Curso>();
    }
            
    public void registrarCurso(String codigo, String nombre, double precio) 
            throws BusinessException {
        validarDatos(codigo, nombre);        
        // Crear un nuevo producto
        Curso nuevoCurso = new Curso(codigo, nombre,precio);
        // Ponerlo como  parte de la coleccion
        cursos.add(nuevoCurso);
    }

    public Curso buscarCursos(String codigo) {
        for(Curso curso : cursos)
            if (curso.getCodigo().equals(codigo))
                return curso;
        return null;
    }

    private void validarDatos(String codigo, String nombre)
            throws BusinessException {
        validarMandatorios(codigo, nombre);
        validarDuplicidad(codigo);
    }

    private void validarMandatorios(String codigo, String nombre)
            throws BusinessException {
        String mensaje = "";
        if (codigo == null || codigo.isEmpty())
            mensaje += "Codigo no puede ser vacio o nulo";
        if (nombre == null || nombre.isEmpty())
            mensaje += "\nNombre no puede ser vacio o nulo";
        if (! mensaje.isEmpty())
            throw new BusinessException(mensaje);        
    }

    private void validarDuplicidad(String codigo) 
            throws BusinessException {
        if (buscarCursos(codigo) != null){
            String mensaje = "Error : " + codigo + " ya existe";
            // Crear la excepcion y lanzarla
            throw new BusinessException(mensaje);
        }
        
    }

    public void eliminarCurso(String codigo) {
        Curso cur = buscarCursos(codigo);
        if (cur != null)
            cursos.remove(cur);
    }
    
}
