/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package crm;

import crm.model.Compra;
import crm.model.Empresa;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Administrador
 */
public class AdmCompraTest {
    
    public AdmCompraTest() {
    }

    @Test
    public void CompraDebeCrearseConConceptoNumeroFEmisionEmpresaSubTotalIgvTotalMonedaFVencimientoFPagoObserva(){
        // Arrange
         
        String concepto="Compra de equipos de computo";
        String  numero="101-002145";
        String  fEmision="20120701";
        String  fVencimiento="20121101";
        String  fPago="20120708";
        String  estado="nuevo";
        String  moneda="soles";
        double  subTotal=100;
        double  igv=18;
        double  total=118;
        String observaciones="confirmar entrega";
        String tipo="Factura";        
        Empresa emp = new Empresa("CL002", "129401228", "Extreme IT Solutions SAC", "Av. Primavera 2550");
        // Act
        Compra Com = new Compra(concepto,numero,fEmision,fVencimiento,fPago,estado,moneda,subTotal,igv,total,observaciones,tipo,emp);
        // Assert
        assertNotNull(Com);
        assertEquals(concepto, Com.getConcepto());
        assertEquals(numero, Com.getNumero());
        assertEquals(fEmision, Com.getfEmision());
        assertEquals(fVencimiento, Com.getfVencimiento());
        assertEquals(fPago, Com.getfPago());
        assertEquals(estado, Com.getEstado());
        assertEquals(moneda, Com.getMoneda());
        assertEquals(subTotal, Com.getSubTotal(),0.0);
        assertEquals(igv, Com.getIgv(),0.0);
        assertEquals(total, Com.getTotal(),0.0);
        assertEquals(observaciones, Com.getObservaciones());
        assertEquals(tipo, Com.getTipo());                  
        assertEquals(emp, Com.getEmpresa());         
    }   
}
