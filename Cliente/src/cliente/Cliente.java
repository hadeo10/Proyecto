/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cliente;

import java.util.Date;

/**
 *
 * @author BITS
 */
public class Cliente {
    private String codigo;
    private String paterno;
    private String materno;
    private String nombre;
    private String correo;
    private String dni;
    private String telefono;
    private Date fechaContacto;
    private Date fechaPaseCliente;

    public Cliente() {
    }

    public Cliente(String codigo, String paterno, String materno, String nombre, String correo, String dni, String telefono, Date fechaContacto, Date fechaPaseCliente) {
        this.codigo = codigo;
        this.paterno = paterno;
        this.materno = materno;
        this.nombre = nombre;
        this.correo = correo;
        this.dni = dni;
        this.telefono = telefono;
        this.fechaContacto = fechaContacto;
        this.fechaPaseCliente = fechaPaseCliente;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public Date getFechaContacto() {
        return fechaContacto;
    }

    public void setFechaContacto(Date fechaContacto) {
        this.fechaContacto = fechaContacto;
    }

    public Date getFechaPaseCliente() {
        return fechaPaseCliente;
    }

    public void setFechaPaseCliente(Date fechaPaseCliente) {
        this.fechaPaseCliente = fechaPaseCliente;
    }

    public String getMaterno() {
        return materno;
    }

    public void setMaterno(String materno) {
        this.materno = materno;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPaterno() {
        return paterno;
    }

    public void setPaterno(String paterno) {
        this.paterno = paterno;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
    
    
    
    
    
    
}
