/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package crm;

import crm.model.Curso;
import crm.model.DetalleVenta;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Administrador
 */
public class DetalleVentaTest {
    
    public DetalleVentaTest() {
    }

  
    @Test
    public void detalleDebeCrearseConCantidadCurso(){
        // Arrange
         int cantidad = 1;
         Curso curso = new Curso("C0001", "MCTSC SQL 2008", 1000.00);        
        // Act
         DetalleVenta detalle = new DetalleVenta(cantidad, curso);
        // Assert
         assertNotNull(detalle);
         assertEquals(cantidad, detalle.getCantidad());
         assertEquals(curso, detalle.getCurso());                         
    }
    
    @Test
    public void detalleDebeCalcularSubTotal(){
        // Arrange
         int cantidad = 1;
         Curso curso = new Curso("C0001", "MCTSC SQL 2008", 1000.00);        
        // Act
         DetalleVenta detalle = new DetalleVenta(cantidad, curso);      
        // Act
         double subTotalCalculado = detalle.calcularSubTotal();        
        // Assert
         double subTotalEsperado = cantidad * curso.getPrecio();
         assertEquals(subTotalEsperado, subTotalCalculado, 0.0);
    }
}
