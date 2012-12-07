
package crm;

import crm.model.Cliente;
import crm.control.AdmCliente;
import org.junit.*;
import static org.junit.Assert.*;

/**
 *
 * @author Administrador
 */
public class ClienteTest {
    
    public ClienteTest() {
    }
    
    @Test
    public void ClienteDebeCrearsePropecto(){
        // Arrange
        String nombres = "Jose Luis";
        String apellidoPaterno = "Reyes";
        String apellidoMaterno = "Luna";
        String email = "jose@yahoo.com";
        String dni = "1478756";
        String telefono = "555554";
        String fechaPase = "20120112";
        String tipo ="0";
        String fechaContacto = "20120213";
        // Act
        Cliente cliente = new Cliente(nombres, apellidoPaterno, apellidoMaterno, email, dni, telefono, fechaContacto, fechaPase,tipo);        
        // Assert
        // Comprobar que el el objeto fue creado
        assertNotNull(cliente);
        // Comprobar que los atributos fueron correctamente asignados
       assertEquals(nombres, cliente.getNombres());
       assertEquals(apellidoPaterno, cliente.getApellidoPaterno());
       assertEquals(apellidoMaterno, cliente.getApellidoMaterno());
       assertEquals(email, cliente.getEmail());
       assertEquals(dni, cliente.getDni());
       assertEquals(telefono, cliente.getTelefono()); 
       assertEquals(fechaPase, cliente.getFechaPase()); 
       assertEquals(fechaContacto, cliente.getFechaContacto()); 
    }
    
     @Test
     public void ClienteDebeCrearse(){
       String nombres = "Jose Luis";
        String apellidoPaterno = "Reyes";
        String apellidoMaterno = "Luna";
        String email = "jose@yahoo.com";
        String dni = "1478756";
        String telefono = "555554";
        String fechaPase = "20120301";
        String tipo ="0";
        String fechaContacto = "20120102";
               
        AdmCliente admin = new AdmCliente();
         
       admin.RegistrarClienteProspecto(nombres, apellidoPaterno, apellidoMaterno, email, dni, telefono, fechaContacto, fechaPase,tipo);        
     
        //confirmo si ha sido ingreso el clienteProspecto buscandolo por DNI
        fechaPase = "20120301";
        Cliente cliente = admin.BuscarPropectoyConvierteCliente(dni,fechaPase);
        
        assertNotNull(cliente);
        assertEquals(nombres, cliente.getNombres());
        assertEquals(apellidoPaterno, cliente.getApellidoPaterno());
        assertEquals(apellidoMaterno, cliente.getApellidoMaterno());
        assertEquals(email, cliente.getEmail());
        assertEquals(dni, cliente.getDni());
        assertEquals(telefono, cliente.getTelefono()); 
        assertEquals(fechaContacto, cliente.getFechaContacto()); 
        assertEquals(fechaPase, cliente.getFechaPase()); 
        tipo ="1"; 
        assertEquals(tipo, cliente.getTipo());  
    }
}
