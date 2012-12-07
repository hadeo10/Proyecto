
package crm.control;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import crm.model.Cliente;
 
/**
 *
 * @author Administrador
 */
public class AdmCliente {
    
    private ArrayList<Cliente> clientes;
    public ArrayList<Cliente> list = new ArrayList<Cliente>();
    public  ArrayList<Cliente> getCliente() {
        return clientes;
    }
    public AdmCliente() {
        // Crear la coleccion de prospectos
        clientes = new ArrayList<Cliente>();
    }
    
    //1.- No poder dar de alta a prospecto si no ha ingresado nombres, appPaterno, appMaterno, email
    private void ValidarDatosCliente(String nombres, String apellidoPaterno, String email) {
        String mensaje = "";
        
        if (nombres==null || nombres.isEmpty())
            mensaje += "\nNombres no puede ser nulo o vacio";
        if (apellidoPaterno==null || apellidoPaterno.isEmpty())
            mensaje += "\napellidoPaterno no puede ser nulo o vacio";
        if (email==null || email.isEmpty())
            mensaje += "\nemail no puede ser nulo o vacio";
        
    }
    
    //2.- Dar de alta un prospecto ingresando nombres, appPaterno, appMaterno, email, dni, telefono, fecha pase
    // tipo y fecha contacto...
    // tipo es un flag 0 cuando es la informacion es PROSPECTO y 1 cuando se vuelve CLIENTE
    
    
    public void RegistrarClienteProspecto(String nombres, String apellidoPaterno, String apellidoMaterno, String email, String dni, String telefono, String fechaPase, String tipo,String fechaContacto) {
        ValidarDatosCliente(nombres, apellidoPaterno, email);        
        Cliente cliente = new Cliente(nombres, apellidoPaterno, apellidoMaterno, email, dni, telefono, fechaPase,tipo,fechaContacto);
        clientes.add(cliente);
        
    }
    
    //3.- Busqueda de prospecto por dni. Si lo encuentra, retorna el prospecto, sino retorna null
    public Cliente BuscarCliente(String dni) {
        for(Cliente cliente : clientes)
            if (cliente.getDni().equals(dni))
               return cliente;
        return null;
    }
    
     public Cliente BuscarPropectoyConvierteCliente(String dni, String fecha) {
        for(Cliente cliente : clientes)
            if (cliente.getDni().equals(dni)){
                cliente.setTipo("1");
                cliente.setFechaPase(fecha);
               return cliente;
            }
        return null;
    }
  
    //4.- Eliminar prospectos por dni
    public void EliminarCliente(String codigo) {
        Cliente clien = BuscarCliente(codigo);
        if (clien != null)
            clientes.remove(clien);
    }
    
    
    //5.- Ordenar prospectos por fecha de contacto
    public class OrdenarClientePorFechaDePase implements Comparator<Cliente> {
        public int compare(Cliente c1, Cliente c2){
        //ascendente
        // return Integer.parseInt(cl1.getFechaContacto()) - Integer.parseInt(cl2.getFechaContacto());
        
        //descendente
        return Integer.parseInt(c2.getFechaPase()) - Integer.parseInt(c1.getFechaPase());
        }
    }
    
    
     public void BuscarCliente(String nombre,String paterno, String materno,String email,String dni,String tele,String pase)
   {
        ArrayList<Cliente> lstCliente =  getCliente();
       for (Cliente oCliente : lstCliente)  
        {
             if(dni.equals(oCliente.getDni()) || nombre.equals(oCliente.getNombres())
                     || nombre.equals(oCliente.getNombres()) || paterno.equals(oCliente.getApellidoPaterno())
                     || materno.equals(oCliente.getApellidoMaterno()) || email.equals(oCliente.getEmail())
                     || tele.equals(oCliente.getTelefono()) || pase.equals(oCliente.getFechaPase())  )
             
                list.add(oCliente);
              
        }   
        
        ImprimeTotal();
   }
     
     public void ImprimeTotal()
     { 
       int intEncontrados = 0;
       System.out.println("");
       System.out.println("RESULTADOS DE LA BUSQUEDA-------BuscarCliente");
       System.out.println("");
        System.out.println("-- ORDENANDO ---");
          //Collections.sort(lstCliente, new OrdenaPorFecha);
        Collections.sort(list, new OrdenaPorFecha() );
        for (Cliente oCliente : list)  
        {
            
                intEncontrados++;
                System.out.println("Nombres          : " + oCliente.getNombres());
                System.out.println("Apellido Paterno : " + oCliente.getApellidoPaterno());
                System.out.println("Apellido Materno : " + oCliente.getApellidoMaterno());
                System.out.println("Email            : " + oCliente.getEmail());
                System.out.println("DNI              : " + oCliente.getDni());
                System.out.println("Teléfono         : " + oCliente.getTelefono());
                System.out.println("Fecha Contacto         : " + oCliente.getFechaContacto());
                System.out.println("Fecha Pase  : " + oCliente.getFechaPase());
                System.out.println("Tipo Registro 0 = prospecto, 1 = cliente    : " + oCliente.getTipo());
                System.out.println("---------------------------------------------------");
            
            
        }   
        
        if(intEncontrados==0)
            System.out.println(" -- > No se han encontrado registros.  < -- ");
        
           
        
        System.out.println("--> Resultados (" + intEncontrados + " de " + list.size() + ") registros");
        System.out.println("");
        System.out.println("");
         
     
     
     }
  
    
 }
class OrdenaPorFecha implements Comparator<Cliente>
{  
    @Override
    public int compare(Cliente o1, Cliente o2) {
          return Integer.parseInt(o2.getFechaPase()) - Integer.parseInt(o1.getFechaPase());
    }
    
      
}