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
public class Compra extends Transaccion {
    public Empresa empresa;
    private ArrayList<DetalleCompra> items;
    public Compra(String concepto, String numero, String fEmision, String fVencimiento, String fPago, String estado, String moneda, double subTotal, double igv, double total, String observaciones, String tipo) {
        super(concepto, numero, fEmision, fVencimiento, fPago, estado, moneda, subTotal, igv, total, observaciones, tipo);
        this.empresa = empresa;
        items = new ArrayList<DetalleCompra>();
    }

    public ArrayList<DetalleCompra> getItems() {
        return items;
    }

    public void setItems(ArrayList<DetalleCompra> items) {
        this.items = items;
    }
   
    public void AdicionarItems(int cantidad, Producto producto){
        DetalleCompra nuevodetalle = new DetalleCompra(cantidad, producto);
        
        items.add(nuevodetalle);
    }
    public int getNumeroItems(){
        return items.size();
    }
    public Empresa getEmpresa(){
        return empresa;
    }
    public void setEmpresa (Empresa empresa) {
        this.empresa = empresa;
        
    }
    
    
}
