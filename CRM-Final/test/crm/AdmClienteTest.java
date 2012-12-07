
package crm;

import crm.model.Cliente;
import crm.control.AdmCliente;
import java.util.ArrayList;
import org.junit.*;
import static org.junit.Assert.*;

/**
 *
 * @author Administrador
 */
public class AdmClienteTest {
    
    public AdmClienteTest() {
    }

    @Test
    public void administradorDebeRegistrarProspectoss(){
        
        String nombres = "Jose Luis";
        String apellidoPaterno = "Reyes";
        String apellidoMaterno = "Luna";
        String email = "jose@yahoo.com";
        String dni = "1478756";
        String telefono = "555554";
        String fechaPase = "";
        String tipo ="0"; 
        String fechaContacto = "20120101";       
        AdmCliente admin = new AdmCliente();
        admin.RegistrarClienteProspecto(nombres, apellidoPaterno, apellidoMaterno, email, dni, telefono, fechaContacto,fechaPase,tipo);
        //confirmo si ha sido ingreso el clienteProspecto buscandolo por DNI
        Cliente cliente = admin.BuscarCliente(dni);
        
        assertNotNull(cliente);
        assertEquals(nombres, cliente.getNombres());
        assertEquals(apellidoPaterno, cliente.getApellidoPaterno());
        assertEquals(apellidoMaterno, cliente.getApellidoMaterno());
        assertEquals(email, cliente.getEmail());
        assertEquals(dni, cliente.getDni());
        assertEquals(telefono, cliente.getTelefono()); 
        assertEquals(fechaPase, cliente.getFechaPase());  
        assertEquals(tipo, cliente.getTipo());  
    }
    
   
    @Test
    public void administradorDebeRegistrarClientesProspectosValidandoDatosIncompletos() {
       
        String nombres = "Jose Luis";
        String apellidoPaterno = "Reyes";
        String apellidoMaterno = "Luna";
        String email = "jose@yahoo.com";
        String dni = "1478756";
        String telefono = "555554";
        String fechaPase = "";
        String tipo ="0"; 
        String fechaContacto = "20120101";       
        AdmCliente admin = new AdmCliente();
       // admin.RegistrarClienteProspecto(nombres, apellidoPaterno, apellidoMaterno, email, dni, telefono, fechaContacto,tipo,fechaPase);
        admin.RegistrarClienteProspecto(nombres, apellidoPaterno, apellidoMaterno, email, dni, telefono, fechaContacto,fechaPase,tipo);
       
            }
    
    @Test
    public void administradorDebeEliminarClienteProspectoPorDni() {
        
        String nombres = "Jose Luis";
        String apellidoPaterno = "Reyes";
        String apellidoMaterno = "Luna";
        String email = "jose@yahoo.com";
        String dni = "1478756";
        String telefono = "555554";
        String fechaPase = "";
        String tipo ="0"; 
            String fechaContacto = "20120101";       
        AdmCliente admin = new AdmCliente();
      //  admin.RegistrarClienteProspecto(nombres, apellidoPaterno, apellidoMaterno, email, dni, telefono, fechaContacto,tipo,fechaPase);
        admin.RegistrarClienteProspecto(nombres, apellidoPaterno, apellidoMaterno, email, dni, telefono, fechaContacto,fechaPase,tipo);
       
        admin.EliminarCliente(dni);        
        Cliente cliente = admin.BuscarCliente(dni);
        assertNull(cliente);
    }
    @Test
    public void administradorActualizaProspectoaCliente() {
         String nombres = "Jose Luis";
        String apellidoPaterno = "Reyes";
        String apellidoMaterno = "Luna";
        String email = "jose@yahoo.com";
        String dni = "1478756";
        String telefono = "555554";
        String fechaPase = "";
        String tipo ="0"; 
            String fechaContacto = "20120101";       
        AdmCliente admin = new AdmCliente();
        //admin.RegistrarClienteProspecto(nombres, apellidoPaterno, apellidoMaterno, email, dni, telefono, fechaContacto,tipo,fechaPase);
         admin.RegistrarClienteProspecto(nombres, apellidoPaterno, apellidoMaterno, email, dni, telefono, fechaContacto,fechaPase,tipo);
       
        //confirmo si ha sido ingreso el clienteProspecto buscandolo por DNI
        Cliente cliente = admin.BuscarPropectoyConvierteCliente(dni,fechaPase);
        
        assertNotNull(cliente);
        assertEquals(nombres, cliente.getNombres());
        assertEquals(apellidoPaterno, cliente.getApellidoPaterno());
        assertEquals(apellidoMaterno, cliente.getApellidoMaterno());
        assertEquals(email, cliente.getEmail());
        assertEquals(dni, cliente.getDni());
        assertEquals(telefono, cliente.getTelefono()); 
        assertEquals(fechaPase, cliente.getFechaPase()); 
        tipo ="1"; 
        assertEquals(tipo, cliente.getTipo());  
    }
    //validaciones de busqueda
    
    @Test
    public void DeboTenerUnArregloDeCliente(){
        
        //Assert.assertNotNull(Cliente.getCliente());
         AdmCliente admin = new AdmCliente();
         
         admin.RegistrarClienteProspecto("cristhian","castro", "caceres", "clcc@hotmail.com", "41593943", "980708089", "20121010", "19000101","0");
         admin.RegistrarClienteProspecto("Jean","castro", "alvarez", "jean@hotmail.com", "40363256", "7950158", "20121011", "19000101","0");
         admin.RegistrarClienteProspecto("victor","polo", "alvarez", "vpolo@hotmail.com", "41593943", "123456789", "20120905", "19000101","0");
         admin.RegistrarClienteProspecto("antu","arias", "hola", "232323@hotmail.com", "2222222", "66566565", "20120110", "19000101","0");
                         
        admin.BuscarCliente("jean","castro", "alvarez", "jean@hotmail.com", "40363256", "7950158", "20121212");      
        // admin.BuscarCliente("Jean","", "", "", "", "", "");      
      //  ImprimeOrdenamiento();
                        
        //CRCliente.ImprimeLista();     
    }         
}
