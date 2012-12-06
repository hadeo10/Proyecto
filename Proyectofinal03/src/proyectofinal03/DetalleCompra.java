/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofinal03;

/**
 *
 * @author BITS
 */
public class DetalleCompra {
    
    private int cantidad;
    private Producto producto;

    public DetalleCompra() {
    }

    
    public DetalleCompra(int cantidad, Producto producto) {
        this.cantidad = cantidad;
        this.producto = producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }
    
    public double CalcularSubTotal(){
        return cantidad*producto.getPrecio();
    }
    
}
