
package crm.model;

import java.util.ArrayList;

/**
 *
 * @author Administrador
 */
public class Compra extends Transaccion {
    public Empresa empresa;
 private ArrayList<DetalleCompra> items;

    public Compra(  String concepto, String numero, String fEmision, String fVencimiento, String fPago, String estado, String moneda, double subTotal, double igv, double total, String observaciones, String tipo,Empresa empresa) {
        super(concepto, numero, fEmision, fVencimiento, fPago, estado, moneda, subTotal, igv, total, observaciones, tipo);
        this.empresa = empresa;
        // Crear la coleccion de detalles de factura
        items = new ArrayList<DetalleCompra>();
    }
     
     

    /**
     * @return the items
     */
    public ArrayList<DetalleCompra> getItems() {
        return items;
    }

    /**
     * @param items the items to set
     */
    public void setItems(ArrayList<DetalleCompra> items) {
        this.items = items;
    }
    
    
     public void adicionarItem(int cantidad, Producto producto) {
        //  Crear el nuevo detalle
        DetalleCompra nuevoDetalle = new DetalleCompra(cantidad, producto);
        // Guardar el detalle en la coleccion de detalles
        items.add(nuevoDetalle);
    }

    public int getNumeroItems() {
        return items.size();
    }

    /**
     * @return the empresa
     */
    public Empresa getEmpresa() {
        return empresa;
    }

    /**
     * @param empresa the empresa to set
     */
    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }
}
