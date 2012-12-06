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
public class Venta extends Transaccion{
    
   
 public ArrayList<DetalleVenta> items;
    public Venta( String concepto, String numero, String fEmision, String fVencimiento, String fPago, String estado, String moneda, double subTotal, double igv, double total, String observaciones, String tipo) {
        super(concepto, numero, fEmision, fVencimiento, fPago, estado, moneda, subTotal, igv, total, observaciones, tipo);
        
         items = new ArrayList<DetalleVenta>();
    }
    
    /* * @return the items
     */
    public ArrayList<DetalleVenta> getItems() {
        return items;
    }

    /**
     * @param items the items to set
     */
    public void setItems(ArrayList<DetalleVenta> items) {
        this.items = items;
    }
     public void adicionarItem(int cantidad, Curso curso) {
        //  Crear el nuevo detalle
        DetalleVenta nuevoDetalle = new DetalleVenta(cantidad, curso);
        // Guardar el detalle en la coleccion de detalles
        items.add(nuevoDetalle);
    }

    public int getNumeroItems() {
        return items.size();
    }
}

    
}
