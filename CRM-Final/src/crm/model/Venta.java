
package crm.model;

import java.util.ArrayList;

/**
 *
 * @author Administrador
 */
public class Venta extends Transaccion {
    public Cliente cliente ;
 public ArrayList<DetalleVenta> items;
    public Venta( String concepto, String numero, String fEmision, String fVencimiento, String fPago, String estado, String moneda, double subTotal, double igv, double total, String observaciones, String tipo, Cliente cliente) {
        super(concepto, numero, fEmision, fVencimiento, fPago, estado, moneda, subTotal, igv, total, observaciones, tipo);
        this.cliente = cliente;
         items = new ArrayList<DetalleVenta>();
    }
    /**
     * @return the cliente
     */
    public Cliente getCliente() {
        return cliente;
    }

    /**
     * @param cliente the cliente to set
     */
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    /**
     * @return the items
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
