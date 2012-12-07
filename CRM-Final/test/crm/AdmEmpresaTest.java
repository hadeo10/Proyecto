/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package crm;

import crm.model.Empresa;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Administrador
 */
public class AdmEmpresaTest {
    
    public AdmEmpresaTest() {
    }
     @Test
    public void empresaDebeCrearseConCodigoRucRazonsocialDireccion(){
        // Arrange
        String codigo = "EM002";
        String ruc = "129401228";
        String razonSocial = "Extreme IT Solutions SAC";
        String direccion = "Av. Primavera 2550";
        
        // Act
        Empresa empresa = new Empresa(codigo, ruc, razonSocial, direccion);
        
        //Assert
        assertNotNull(empresa);
        assertEquals(codigo, empresa.getCodigo());
        assertEquals(ruc, empresa.getRuc());
        assertEquals(razonSocial, empresa.getRazonSocial());
        assertEquals(direccion, empresa.getDireccion());
    
    }
}
