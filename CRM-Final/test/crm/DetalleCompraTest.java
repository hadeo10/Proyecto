/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package crm;

import crm.model.Producto;
import crm.model.DetalleCompra;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Administrador
 */
public class DetalleCompraTest {
    
    public DetalleCompraTest() {
    }

    @Test
    public void detalleDebeCrearseConCantidadProducto(){
        // Arrange
         int cantidad = 5;
         Producto producto = new Producto("P001", "Laptop Leonovo:hd 320 gb, ram 4gb, corel i5", 3000.00);        
        // Act
         DetalleCompra detalle = new DetalleCompra(cantidad, producto);
        // Assert
         assertNotNull(detalle);
         assertEquals(cantidad, detalle.getCantidad());
         assertEquals(producto, detalle.getProducto());                         
    }
    
    @Test
    public void detalleDebeCalcularSubTotal(){
        // Arrange
         int cantidad = 5;
         Producto producto = new Producto("P001", "Laptop Leonovo:hd 320 gb, ram 4gb, corel i5", 3000.00);
         DetalleCompra detalle = new DetalleCompra(cantidad, producto);        
        // Act
         double subTotalCalculado = detalle.calcularSubTotal();        
        // Assert
         double subTotalEsperado = cantidad * producto.getPrecio();
         assertEquals(subTotalEsperado, subTotalCalculado, 0.0);
    }
}
