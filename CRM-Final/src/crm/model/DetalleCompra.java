
package crm.model;


public class DetalleCompra {
    private int cantidad;
    private Producto producto;

    public DetalleCompra(int cantidad, Producto producto) {
        this.cantidad = cantidad;
        this.producto = producto;
    }

    /**
     * @return the cantidad
     */
    public int getCantidad() {
        return cantidad;
    }

    /**
     * @param cantidad the cantidad to set
     */
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    /**
     * @return the producto
     */
    public Producto getProducto() {
        return producto;
    }

    /**
     * @param producto the producto to set
     */
    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public double calcularSubTotal() {
        return cantidad * producto.getPrecio();
    }
    
    
    
}
