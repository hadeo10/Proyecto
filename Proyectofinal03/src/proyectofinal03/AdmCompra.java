/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofinal03;

import java.util.ArrayList;

/**
 *
 * @author BITS
 */
public class AdmCompra {
    
    private ArrayList<Compra> compras;
    public ArrayList<Compra> list = new ArrayList<Compra>();
    
    public AdmCompra(){
        compras = new ArrayList<Compra>();
    }
    public ArrayList<Compra> getCompras(){
        return compras;
    }
    public void registrarCompras(String concepto, String numero, String fEmision, String fVencimiento, String fPago, String estado, String moneda, double subTotal, double igv, double total, String observaciones, String tipo);
    
        throws BusinessException {
            ValidarDatos(concepto,fEmision,fVencimiento,subTotal,igv,total,moneda);
            
            Compra com = new Compra(concepto, numero, fEmision, fVencimiento, fPago, estado, moneda, subTotal,  igv, total,  observaciones, tipo, empresa);
            
            compras.add(com);
            
            public Compra BuscarCompra(String codigo){
                for(Compra com: compras)
                    if (com.getNumero().equals(codigo))
                        return com;
                return null;
                
            }
            
            private void ValidarDatos(String concepto, String fEmision, String fVencimiento,  double subTotal, double igv, double total, String moneda)
                    
                    throws BusinessException {
                String mensaje = " ";
                
                if (concepto == null || concepto.isEmpty())
                    mensaje += "concepto no puede ser vacio o nulo";
                if (fEmision == null || fEmision.isEmpty())
                    mensaje += "la fecha de emision no puede ser vacio o nula";
                if (fVencimiento == null || fVencimiento.isEmpty())
                    mensaje += "la fecha de vencimiento no puede ser nulo o vacio";
                if (subTotal == 0)
                    mensaje += "el subtotal no puede ser cero";
                if (igv == 0)
                    mensaje += "el igv no puede ser cero";
                if (total == 0)
                    mensaje += "el total no puede ser cero";
                if (!mensaje.isEmpty())
                    throws new BusinessException(mensaje); 
            }
            
            public void EliminarCompra(String codigo){
                Compra com = BuscarCompra(codigo);
                if (com != null)
                    compras.remove(com);
            }
            
            public void BuscarCompra(String concepto, String numero, String fEmision, String codEmpresa, String fvencimiento, String fpago, String estado){
                
                ArrayList<Compra> lstcompra = getCompras();
                for (Compra ocompra : lstcompra)
                {
                    if(concepto.equals(ocompra.getConcepto()) || numero.equals(ocompra.getNumero()) || codEmpresa.equals(ocompra.getEmpresa()) || fvencimiento.equals(ocompra.getfVencimiento()) || fpago.equals(ocompra.getfPago()))
                            
                                list.add(ocompra);
                                
                }
            ImprimeTotal();
            }
            public void ImprimeTotal()
            {
                int intEncontrados = 0;
                System.out.println("");
                System.out.println("Resultado de la busqueda --------Buscar Cliente------");
                System.out.println("");
                
                for(Compra ocompra: list)
                {
                    intEncontrados++;
                    System.out.println("Concepto  : "+ocompra.getConcepto());
                    System.out.println("Numero  : "+ocompra.getNumero());
                    System.out.println("Fecha de emision  : "+ocompra.getfEmision());
                    System.out.println("Fecha de Pago  : "+ocompra.getfPago());
                    System.out.println("Estado  : "+ocompra.getConcepto());
                    System.out.println("Moneda  : "+ocompra.getConcepto());
                    System.out.println("Subtotal  : "+ocompra.getConcepto());
                    System.out.println("IGV  : "+ocompra.getConcepto());
                    System.out.println("Total  : "+ocompra.getConcepto());
                    System.out.println("Observaciones  : "+ocompra.getConcepto());
                    System.out.println("Tipo de registro  : "+ocompra.getConcepto());
                    System.out.println("----------------------------------------------------");
                }
            if (intEncontrados == 0)
                System.out.println("no se encontraron registros");
            
            System.out.println("Resultados encontrados :"+list.size()+" registros");
            System.out.println(" ");
            
            }
            
            
            }
   

