/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package crm.control;

import crm.model.Cliente;
import crm.model.Venta;
import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Administrador
 */
public class AdmVenta {
     private ArrayList<Venta> ventas;
        public ArrayList<Venta> list = new ArrayList<Venta>();

    public AdmVenta() {
       ventas = new ArrayList<Venta>();
    }
     public  ArrayList<Venta> getVentas() {
        return ventas;
    }
            
    public void registrarVentas( String concepto, String numero, String fEmision, String fVencimiento, String fPago, String estado, String moneda, double subTotal, double igv, double total, String observaciones, String tipo,Cliente cli) 
            throws BusinessException {
        validarDatos(concepto, fEmision,fVencimiento,subTotal,igv,total,moneda);        
        // Crear un nuevo producto
      Venta ven = new Venta(concepto,numero,fEmision,fVencimiento,fPago,estado,moneda,subTotal,igv,total,observaciones,tipo,cli);
        // Ponerlo como  parte de la coleccion
        ventas.add(ven);
    }

    public Venta buscarVenta(String codigo) {
        for(Venta ven : ventas)
            if (ven.getNumero().equals(codigo))
                return ven;
        return null;
    }

    

    private void validarDatos(String concepto,  String fEmision, String fVencimiento, double subTotal, double igv, double total, String moneda)
            throws BusinessException {
        String mensaje = "";
        if (concepto == null || concepto.isEmpty())
            mensaje += "concepto no puede ser vacio o nulo";
        if (fEmision == null || fEmision.isEmpty())
            mensaje += "\nfEmision no puede ser vacio o nulo";
        if (fVencimiento == null || fVencimiento.isEmpty())
            mensaje += "\nfVencimiento no puede ser vacio o nulo";
        if (subTotal == 0 )
            mensaje += "\nsubTotal no puede ser CERO";
        if (igv == 0 )
            mensaje += "\nigv no puede ser CERO";    
        if (total == 0 )
            mensaje += "\ntotal no puede ser CERO"; 
        if (! mensaje.isEmpty())
            throw new BusinessException(mensaje);        
    }
 

    public void eliminarCVenta(String codigo) {
        Venta ven = buscarVenta(codigo);
        if (ven != null)
            ventas.remove(ven);
    }
    
    
     
     public void BuscarVenta(String concepto, String numero,String femision,String codEmpresa,String fvencimiento,String fpago,String estado)
   {
        ArrayList<Venta> lstVenta =  getVentas();
       for (Venta oVenta : lstVenta)  
        {
             if(concepto.equals(oVenta.getConcepto()) || numero.equals(oVenta.getNumero())
                     || codEmpresa.equals(oVenta.getCliente()) || fvencimiento.equals(oVenta.getfVencimiento())
                     || fpago.equals(oVenta.getfPago()) || estado.equals(oVenta.getEstado())  )
             
                list.add(oVenta);
              
        }   
        
        ImprimeTotal();
   }
     
     public void ImprimeTotal()
     { 
       int intEncontrados = 0;
       System.out.println("");
       System.out.println("RESULTADOS DE LA BUSQUEDA-------BuscarCliente");
       System.out.println("");
        
        for (Venta oVenta : list)  
        {
            /*
             *concepto, numero, fEmision, fVencimiento, fPago, estado, moneda, subTotal, igv, total, observaciones, tipo);
        this.cliente = cliente;
             * */
            
                intEncontrados++;
                System.out.println("Concepto          : " + oVenta.getConcepto());
                System.out.println("Numero : " + oVenta.getNumero());
                System.out.println("Fecha Emision  : " + oVenta.getfEmision());
                System.out.println("Fecha Vencimiento            : " + oVenta.getfVencimiento());
                System.out.println("Fecha Pago              : " + oVenta.getfPago());
                System.out.println("Estado         : " + oVenta.getEstado());
                System.out.println("Moneda         : " + oVenta.getMoneda());
                System.out.println("SubTotal  : " + oVenta.getSubTotal());
                System.out.println("Igv  : " + oVenta.getIgv());
                System.out.println("Total    : " + oVenta.getTotal());
                System.out.println("TObservaciones    : " + oVenta.getObservaciones());
                System.out.println("Tipo Registro 0 = Boleta, 1 = Factura    : " + oVenta.getTipo());
                System.out.println("---------------------------------------------------");
            
            
        }   
        
        if(intEncontrados==0)
            System.out.println(" -- > No se han encontrado registros.  < -- ");
        
           
        
        System.out.println("--> Resultados (" + intEncontrados + " de " + list.size() + ") registros");
        System.out.println("");
        System.out.println("");
         
     
     
     }
    
}
