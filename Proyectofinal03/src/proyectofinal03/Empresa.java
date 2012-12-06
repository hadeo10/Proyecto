/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofinal03;

/**
 *
 * @author BITS
 */
public class Empresa {
    
    private String codigo;
    private String ruc;
    private String razonsocial;
    private String direccion;

    public Empresa(String codigo, String ruc, String razonsocial, String direccion) {
        this.codigo = codigo;
        this.ruc = ruc;
        this.razonsocial = razonsocial;
        this.direccion = direccion;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getRazonsocial() {
        return razonsocial;
    }

    public void setRazonsocial(String razonsocial) {
        this.razonsocial = razonsocial;
    }

    public String getRuc() {
        return ruc;
    }

    public void setRuc(String ruc) {
        this.ruc = ruc;
    }
    
    
    
}
