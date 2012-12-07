/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package crm.control;

import crm.model.Producto;
import java.util.ArrayList;



/**
 *
 * @author Administrador
 */
public class AdmProducto {
    private ArrayList<Producto> productos;

    public AdmProducto() {
        productos = new ArrayList<Producto>();
    }
            
    public void registrarProducto(String codigo, String nombre, double precio) 
            throws BusinessException {
        validarDatos(codigo, nombre, precio);        
        // Crear un nuevo producto
        Producto nuevoProducto = new Producto(codigo, nombre, precio);
        // Ponerlo como  parte de la coleccion
        productos.add(nuevoProducto);
    }

    public Producto buscarProducto(String codigo) {
        for(Producto producto : productos)
            if (producto.getCodigo().equals(codigo))
                return producto;
        return null;
    }

    private void validarDatos(String codigo, String nombre, double precio)
            throws BusinessException {
        validarMandatorios(codigo, nombre, precio);
        validarDuplicidad(codigo);
    }

    private void validarMandatorios(String codigo, String nombre, double precio)
            throws BusinessException {
        String mensaje = "";
        if (codigo == null || codigo.isEmpty())
            mensaje += "Codigo no puede ser vacio o nulo";
        if (nombre == null || nombre.isEmpty())
            mensaje += "\nNombre no puede ser vacio o nulo";
        if (precio<=0.00)
            mensaje += "\nPrecio no puede ser negativo o cero";
        if (! mensaje.isEmpty())
            throw new BusinessException(mensaje);        
    }

    private void validarDuplicidad(String codigo) 
            throws BusinessException {
        if (buscarProducto(codigo) != null){
            String mensaje = "Error : " + codigo + " ya existe";
            // Crear la excepcion y lanzarla
            throw new BusinessException(mensaje);
        }
        
    }

    public void eliminarProducto(String codigo) {
        Producto producto = buscarProducto(codigo);
        if (producto != null)
            productos.remove(producto);
    }
    
}
