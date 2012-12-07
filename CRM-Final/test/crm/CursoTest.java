/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package crm;

import crm.model.Curso;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Administrador
 */
public class CursoTest {
    
    public CursoTest() {
    }

   @Test
    public void cursoDebeCrearseConCodigoNombre(){
        // Arrange : Preparar los datos de prueba
        String codigo = "C0001";
        String nombre = "MCTSC SQL 2008"; 
        double precio = 1000;
        // Act: Ejecutar las acciones a probar
        Curso curs = new Curso(codigo, nombre, precio);        
        // Assert: Comprobar los resultados
        assertNotNull(curs);
        assertEquals(codigo, curs.getCodigo());
        assertEquals(nombre, curs.getNombre()); 
         assertEquals(precio, curs.getPrecio(), 0.0); 
        
    
    }
}
