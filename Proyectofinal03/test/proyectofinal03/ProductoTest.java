/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofinal03;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author BITS
 */
public class ProductoTest {
      public ProductoTest() {
    }
    
    @Test
    public void productoDebeCrearseConCodigoNombrePrecio(){
        // Arrange : Preparar los datos de prueba
        String codigo = "P0001";
        String nombre = "Laptop Leonovo:hd 320 gb, ram 4gb, corel i5";
        double precio = 3000.00;        
        // Act: Ejecutar las acciones a probar
        Producto producto = new Producto(codigo, nombre, precio);        
        // Assert: Comprobar los resultados
        assertNotNull(producto);
        assertEquals(codigo, producto.getCodigo());
        assertEquals(nombre, producto.getNombre());
        assertEquals(precio, producto.getPrecio(), 0.00);
        
        
    
    }


}

    

