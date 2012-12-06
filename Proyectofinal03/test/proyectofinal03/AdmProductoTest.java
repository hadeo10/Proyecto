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
public class AdmProductoTest {
     public AdmProductoTest() {
    }
    
    @Test
    public void admProductoDebeRegistrarProductos() throws BusinessException{
        // Arrange
        String codigo1 = "P001";
        String nombre1 = "iPhone 5";
        double precio1 = 1500.00;
        
        String codigo2 = "P002";
        String nombre2 = "iPad 3o generaciÃ³n";
        double precio2 = 2500.00;
        
        AdmProducto adm = new AdmProducto();                        
        // Act
        adm.registrarProducto(codigo1, nombre1, precio1);
        adm.registrarProducto(codigo2, nombre2, precio2);        
        // Assert
        
        // Hacemos la comprobaciÃ³n buscando los productos registrados
        Producto producto1 = adm.buscarProducto(codigo1);
        Producto producto2 = adm.buscarProducto(codigo2);
        
        assertNotNull(producto1);
        assertEquals(codigo1, producto1.getCodigo());
       
        assertNotNull(producto2);
        assertEquals(codigo2, producto2.getCodigo());
        
    }
    
    @Test(expected=BusinessException.class)
    public void admProductoDebeValidarDuplicidadDeCodigo() throws BusinessException{
        // Arrange
        String codigo1 = "P001";
        String nombre1 = "iPhone 5";
        double precio1 = 1500.00;
        
        String codigo2 = "P002";
        String nombre2 = "iPad 3o generaciÃ³n";
        double precio2 = 2500.00;
        
        AdmProducto adm = new AdmProducto();                        
        // Act
        adm.registrarProducto(codigo1, nombre1, precio1);
        // Esta linea deberia fallar
        adm.registrarProducto(codigo1, nombre2, precio2);        
        // Assert       
        // No hay comprobaciÃ³n explicita, por que el TEST
        // espera un error del tipo BusinessException
    }
     
    @Test(expected=BusinessException.class)
    public void admProductoDebeValidarDatosMandatorios() throws BusinessException{
        // Arrange
        String codigo = "";
        String nombre = "";
        double precio = 0.00;                
        AdmProducto adm = new AdmProducto();                        
        // Act
        // Espero que suceda un error
        adm.registrarProducto(codigo, nombre, precio);        
    }
    
    @Test
    public void admProductoDebeEliminarProductoXCodigo() throws BusinessException{
        // Arrange
        String codigo = "P001";
        String nombre = "iPhone 5";
        double precio = 1200.00;                
        AdmProducto adm = new AdmProducto();                        
        adm.registrarProducto(codigo, nombre, precio);
        // Act
        adm.eliminarProducto(codigo);
        // Assert
        Producto producto = adm.buscarProducto(codigo);
        assertNull(producto);                        
    }
    
    @Test
    public void admProductoDebeValidarEliminacionDeProductoInexistente(){
        
    }
    

    


}

    

