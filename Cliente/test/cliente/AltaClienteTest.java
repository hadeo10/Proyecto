/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cliente;

import java.util.logging.Level;
import org.junit.AfterClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.BeforeClass;

/**
 *
 * @author BITS
 */
public class AltaClienteTest {
    
    @Test
    public void AdministradorDebeRegistrarCliente(){
        
        AltaCliente admin = new AltaCliente();
        int i;
        for (i=0; i<dnis.length; i++)
            try {
                admin.registrar(codigo[i],paterno[i],materno[],nombre[i],correo[i],dni[i],telefono[i],fechacontacto[i]);
            }
        catch (BusinessException ex) {
            Logger.getLogger(AltaClienteTest.class.getName().log(Level.SEVERE, null, ex));
            }
    }
    
    public AltaClienteTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Test
    public void testSomeMethod() {
    }
}
