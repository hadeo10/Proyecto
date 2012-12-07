
package crm.control;

import crm.model.Empresa;
import java.util.ArrayList;

/**
 *
 * @author Administrador
 */
public class AdmEmpresa {
    private ArrayList<Empresa> empres;

    public AdmEmpresa() {
        empres = new ArrayList<Empresa>();
    }
            
    public void registrarEmpresa(String codigo, String ruc, String razonSocial, String direccion) 
            throws BusinessException {
        validarDatos(codigo, razonSocial);        
        // Crear un nuevo producto
        Empresa nuevoEmpresa = new Empresa(codigo, ruc, razonSocial,direccion);
        // Ponerlo como  parte de la coleccion
        empres.add(nuevoEmpresa);
    }

    public Empresa buscarEmpresa(String codigo) {
        for(Empresa empr : empres)
            if (empr.getCodigo().equals(codigo))
                return empr;
        return null;
    }

    private void validarDatos(String codigo, String nombre)
            throws BusinessException {
        validarMandatorios(codigo, nombre);
        
    }

    private void validarMandatorios(String codigo, String nombre)
            throws BusinessException {
        String mensaje = "";
        if (codigo == null || codigo.isEmpty())
            mensaje += "Codigo no puede ser vacio o nulo";
        if (nombre == null || nombre.isEmpty())
            mensaje += "\nNombre no puede ser vacio o nulo";
        if (! mensaje.isEmpty())
            throw new BusinessException(mensaje);        
    }
 

    public void eliminarEmpresa(String codigo) {
        Empresa emp = buscarEmpresa(codigo);
        if (emp != null)
            empres.remove(emp);
    }
    
}
