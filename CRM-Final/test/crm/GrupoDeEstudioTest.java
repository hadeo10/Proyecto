/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package crm;

import crm.model.Curso;
import crm.model.GrupoDeEstudio;
import org.junit.AfterClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.BeforeClass;

/**
 *
 * @author Administrador
 */
public class GrupoDeEstudioTest {
    
    public GrupoDeEstudioTest() {
    }

    @Test
    public void GrupoDeEstudioDebeCrearse(){
        // Arrange
    String nombre = "GrupoA";
    String academia = "New Horizons";
    String fechaInicio = "20120514";
    String fechaFin = "20120810";
    String estado = "En Curso";
    String descripcion = "Primer Grupo";
    String instructor = "Carlos Perez";
    String linkSillabus = "www.syllabus.com";
    String local = "San Isidro";
    String aula = "C12";
    String googleMaps = "L45-A30";
    Curso cur = new Curso("C0001", "MCTSC SQL 2008", 1000);
        // Act
    GrupoDeEstudio grupoest = new GrupoDeEstudio(nombre, academia, cur, fechaInicio, fechaFin, estado, descripcion, instructor, linkSillabus, local, aula, googleMaps);        
        // Assert
        // Comprobar que el el objeto fue creado
    assertNotNull(grupoest);
        // Comprobar que los atributos fueron correctamente asignados
       assertEquals(nombre, grupoest.getNombre());
       assertEquals(academia, grupoest.getAcademia());
       assertEquals(fechaInicio, grupoest.getFechaInicio());
       assertEquals(fechaFin, grupoest.getFechaFin());
       assertEquals(estado, grupoest.getEstado());
       assertEquals(descripcion, grupoest.getDescripcion());
       assertEquals(instructor, grupoest.getInstructor());
       assertEquals(linkSillabus, grupoest.getLinkSillabus());
       assertEquals(local, grupoest.getLocal());
       assertEquals(aula, grupoest.getAula());
       assertEquals(googleMaps, grupoest.getGoogleMaps());
       assertEquals(cur, grupoest.getCurso());
       
       }
}
