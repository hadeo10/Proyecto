/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package crm.control;

import crm.model.Compra;
import crm.model.Empresa;
import java.util.ArrayList;

/**
 *
 * @author Administrador
 */
public class AdmCompra {
     private ArrayList<Compra> compras;
     public ArrayList<Compra> list = new ArrayList<Compra>();

    public AdmCompra() {
        compras = new ArrayList<Compra>();
    }
         
      public  ArrayList<Compra> getCompras() {
        return compras;
    }
    public void registrarCompras( String concepto, String numero, String fEmision, String fVencimiento, String fPago, String estado, String moneda, double subTotal, double igv, double total, String observaciones, String tipo,Empresa empresa) 
            throws BusinessException {
        validarDatos(concepto, fEmision,fVencimiento,subTotal,igv,total,moneda);        
        // Crear un nuevo producto
      Compra Com = new Compra(concepto,numero,fEmision,fVencimiento,fPago,estado,moneda,subTotal,igv,total,observaciones,tipo,empresa);
        // Ponerlo como  parte de la coleccion
        compras.add(Com);
    }

    public Compra buscarCompra(String codigo) {
        for(Compra com : compras)
            if (com.getNumero().equals(codigo))
                return com;
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
 

    public void eliminarCompra(String codigo) {
        Compra com = buscarCompra(codigo);
        if (com != null)
            compras.remove(com);
    }
    
    
    public void BuscarVenta(String concepto, String numero,String femision,String codEmpresa,String fvencimiento,String fpago,String estado)
   {
        ArrayList<Compra> lstcompra =  getCompras();
       for (Compra oCompra : lstcompra)  
        {
             if(concepto.equals(oCompra.getConcepto()) || numero.equals(oCompra.getNumero())
                     || codEmpresa.equals(oCompra.getEmpresa()) || fvencimiento.equals(oCompra.getfVencimiento())
                     || fpago.equals(oCompra.getfPago()) || estado.equals(oCompra.getEstado())  )
             
                list.add(oCompra);
              
        }   
        
        ImprimeTotal();
   }
     
     public void ImprimeTotal()
     { 
       int intEncontrados = 0;
       System.out.println("");
       System.out.println("RESULTADOS DE LA BUSQUEDA-------BuscarCliente");
       System.out.println("");
        
        for (Compra oCompra : list)  
        {
            /*
             *concepto, numero, fEmision, fVencimiento, fPago, estado, moneda, subTotal, igv, total, observaciones, tipo);
        this.cliente = cliente;
             * */
            
                intEncontrados++;
                System.out.println("Concepto          : " + oCompra.getConcepto());
                System.out.println("Numero : " + oCompra.getNumero());
                System.out.println("Fecha Emision  : " + oCompra.getfEmision());
                System.out.println("Fecha Vencimiento            : " + oCompra.getfVencimiento());
                System.out.println("Fecha Pago              : " + oCompra.getfPago());
                System.out.println("Estado         : " + oCompra.getEstado());
                System.out.println("Moneda         : " + oCompra.getMoneda());
                System.out.println("SubTotal  : " + oCompra.getSubTotal());
                System.out.println("Igv  : " + oCompra.getIgv());
                System.out.println("Total    : " + oCompra.getTotal());
                System.out.println("TObservaciones    : " + oCompra.getObservaciones());
                System.out.println("Tipo Registro 0 = Boleta, 1 = Factura    : " + oCompra.getTipo());
                System.out.println("---------------------------------------------------");
            
            
        }   
        
        if(intEncontrados==0)
            System.out.println(" -- > No se han encontrado registros.  < -- ");
        
           
        
        System.out.println("--> Resultados (" + intEncontrados + " de " + list.size() + ") registros");
        System.out.println("");
        System.out.println("");
         
     
     
     }
}
