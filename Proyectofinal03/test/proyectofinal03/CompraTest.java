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
public class CompraTest {

    public CompraTest() {
    }
    
    @Test
    public void CompraDebeCrearseConConceptoNumeroFemisionEmpresaSubtotalIGVTotalMonedaFVencimientoFPagoObservaciones(){
        
        String concepto = "Compra de equipo de computo";
        String numero = "101-002145";
        String fEmision = "20120701";
        String fVencimiento = "20120708";
        String fPago = "20121101";
        String  estado="nuevo";
        String  moneda="soles";
        double  subTotal=100;
        double  igv=18;
        double  total=118;
        String observaciones="confirmar entrega";
        String tipo="Factura";        
        
        Compra Com = new Compra(concepto,numero,fEmision,fVencimiento,fPago,estado,moneda,subTotal,igv,total,observaciones,tipo);

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
    }
    @Test
    public void CompraDebeAdicionarDetalles(){
        String concepto = "Compra de equipo de computo";
        String numero = "101-002145";
        String fEmision = "20120701";
        String fVencimiento = "20120708";
        String fPago = "20121101";
        String  estado="nuevo";
        String  moneda="soles";
        double  subTotal=100;
        double  igv=18;
        double  total=118;
        String observaciones="confirmar entrega";
        String tipo="Factura";        
        
        Compra Com = new Compra(concepto,numero,fEmision,fVencimiento,fPago,estado,moneda,subTotal,igv,total,observaciones,tipo);
            
       
        Producto producto = new Producto("P001", "Laptop Leonovo:hd 320 gb, ram 4gb, corel i5", 3000.00);
        int cantidad = 10;
        // Act
        Com.adicionarItem(cantidad, producto);        
        // Assert
        int itemsEsperados = 1;
        int itemsRetornados = Com.getNumeroItems();
        assertEquals(itemsEsperados, itemsRetornados);        
        
    }
}