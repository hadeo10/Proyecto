
package crm.model;

/**
 *
 * @author Administrador
 */
public abstract class  Transaccion {
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

    /**
     * @return the concepto
     */
    public String getConcepto() {
        return concepto;
    }

    /**
     * @param concepto the concepto to set
     */
    public void setConcepto(String concepto) {
        this.concepto = concepto;
    }

    /**
     * @return the numero
     */
    public String getNumero() {
        return numero;
    }

    /**
     * @param numero the numero to set
     */
    public void setNumero(String numero) {
        this.numero = numero;
    }

    /**
     * @return the fEmision
     */
    public String getfEmision() {
        return fEmision;
    }

    /**
     * @param fEmision the fEmision to set
     */
    public void setfEmision(String fEmision) {
        this.fEmision = fEmision;
    }

    /**
     * @return the fVencimiento
     */
    public String getfVencimiento() {
        return fVencimiento;
    }

    /**
     * @param fVencimiento the fVencimiento to set
     */
    public void setfVencimiento(String fVencimiento) {
        this.fVencimiento = fVencimiento;
    }

    /**
     * @return the fPago
     */
    public String getfPago() {
        return fPago;
    }

    /**
     * @param fPago the fPago to set
     */
    public void setfPago(String fPago) {
        this.fPago = fPago;
    }

    /**
     * @return the estado
     */
    public String getEstado() {
        return estado;
    }

    /**
     * @param estado the estado to set
     */
    public void setEstado(String estado) {
        this.estado = estado;
    }

    /**
     * @return the moneda
     */
    public String getMoneda() {
        return moneda;
    }

    /**
     * @param moneda the moneda to set
     */
    public void setMoneda(String moneda) {
        this.moneda = moneda;
    }

    /**
     * @return the subTotal
     */
    public double getSubTotal() {
        return subTotal;
    }

    /**
     * @param subTotal the subTotal to set
     */
    public void setSubTotal(double subTotal) {
        this.subTotal = subTotal;
    }

    /**
     * @return the igv
     */
    public double getIgv() {
        return igv;
    }

    /**
     * @param igv the igv to set
     */
    public void setIgv(double igv) {
        this.igv = igv;
    }

    /**
     * @return the total
     */
    public double getTotal() {
        return total;
    }

    /**
     * @param total the total to set
     */
    public void setTotal(double total) {
        this.total = total;
    }

    /**
     * @return the observaciones
     */
    public String getObservaciones() {
        return observaciones;
    }

    /**
     * @param observaciones the observaciones to set
     */
    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    /**
     * @return the tipo
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * @param tipo the tipo to set
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
            
}
