/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package crm;

import crm.model.Venta;
import crm.model.Cliente;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Administrador
 */
public class AdmVentaTest {
    
    public AdmVentaTest() {
    }

      @Test
    public void VentaDebeCrearseConConceptoNumeroFEmisionEmpresaSubTotalIgvTotalMonedaFVencimientoFPagoObserva(){
        // Arrange
         
        String concepto="Venta de Cursos Microsoft";
        String  numero="001-001234";
        String  fEmision="20120801";
        String  fVencimiento="20121004";
        String  fPago="20120708";
        String  estado="nuevo";
        String  moneda="soles";
        double  subTotal=2000;
        double  igv=360;
        double  total=2360;
        String observaciones="venta al contado";
        String tipo="Boleta";        
        //Cursos cur = new Cursos("C0001", "MCTSC SQL 2008",1000);
         String nombres = "Jose Luis";
        String apellidoPaterno = "Reyes";
        String apellidoMaterno = "Luna";
        String email = "jose@yahoo.com";
        String dni = "1478756";
        String telefono = "555554";
        String fechaContacto = "20120105";
        String fechaPase = "20120314";
        String tipo2 ="0";
        // Act
        Cliente cliente = new Cliente(nombres, apellidoPaterno, apellidoMaterno, email, dni, telefono,fechaContacto, fechaPase,tipo2);        
      
        // Act
        Venta ven = new Venta(concepto,numero,fEmision,fVencimiento,fPago,estado,moneda,subTotal,igv,total,observaciones,tipo,cliente);
        // Assert
        assertNotNull(ven);
        assertEquals(concepto, ven.getConcepto());
        assertEquals(numero, ven.getNumero());
        assertEquals(fEmision, ven.getfEmision());
        assertEquals(fVencimiento, ven.getfVencimiento());
        assertEquals(fPago, ven.getfPago());
        assertEquals(estado, ven.getEstado());
        assertEquals(moneda, ven.getMoneda());
        assertEquals(subTotal, ven.getSubTotal(),0.0);
        assertEquals(igv, ven.getIgv(),0.0);
        assertEquals(total, ven.getTotal(),0.0);
        assertEquals(observaciones, ven.getObservaciones());
        assertEquals(tipo, ven.getTipo());                  
        assertEquals(cliente, ven.getCliente());         
    }    
}
