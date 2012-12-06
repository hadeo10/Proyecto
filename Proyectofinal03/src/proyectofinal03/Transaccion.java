/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofinal03;

/**
 *
 * @author BITS
 */


public abstract class Transaccion {
    private String concepto;
    private String  numero;
    private String  fEmision;
    private String  fVencimiento;   
    private String  fPago;
    private String  estado;
    private String  moneda;
    private double  subTotal;
    private double  igv;
    private double  total;
    private String observaciones;
    private String tipo;

    public Transaccion(String concepto, String numero, String fEmision, String fVencimiento, String fPago, String estado, String moneda, double subTotal, double igv, double total, String observaciones, String tipo) {
        this.concepto = concepto;
        this.numero = numero;
        this.fEmision = fEmision;
        this.fVencimiento = fVencimiento;
        this.fPago = fPago;
        this.estado = estado;
        this.moneda = moneda;
        this.subTotal = subTotal;
        this.igv = igv;
        this.total = total;
        this.observaciones = observaciones;
        this.tipo = tipo;
    }

    public String getConcepto() {
        return concepto;
    }

    public void setConcepto(String concepto) {
        this.concepto = concepto;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getfEmision() {
        return fEmision;
    }

    public void setfEmision(String fEmision) {
        this.fEmision = fEmision;
    }

    public String getfPago() {
        return fPago;
    }

    public void setfPago(String fPago) {
        this.fPago = fPago;
    }

    public String getfVencimiento() {
        return fVencimiento;
    }

    public void setfVencimiento(String fVencimiento) {
        this.fVencimiento = fVencimiento;
    }

    public double getIgv() {
        return igv;
    }

    public void setIgv(double igv) {
        this.igv = igv;
    }

    public String getMoneda() {
        return moneda;
    }

    public void setMoneda(String moneda) {
        this.moneda = moneda;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public double getSubTotal() {
        return subTotal;
    }

    public void setSubTotal(double subTotal) {
        this.subTotal = subTotal;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    
    
}
