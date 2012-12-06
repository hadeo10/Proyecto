/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofinal03;

/**
 *
 * @author BITS
 */
public class Producto {
    
    private String Codigo;
    private String Nombre;
    private double precio;

    public Producto(String Codigo, String Nombre, double precio) {
        this.Codigo = Codigo;
        this.Nombre = Nombre;
        this.precio = precio;
    }

    public String getCodigo() {
        return Codigo;
    }

    public void setCodigo(String Codigo) {
        this.Codigo = Codigo;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    
    
}
