
package proyecto1;

/**
 *
 * @author hector
 */
public class Cliente {
    Long codigo;
    String nombre;
    String a_paterno;
    String a_materno;
    int dni;
    String email;
    int telefono;
    String fechadecontacto;
    
     void prospecto1 (){
        System.out.println("PROSPECTO_1 : ");
        System.out.println("Codigo : "+ codigo);
        System.out.println("Nombre : "+ nombre);
        System.out.println("Apellidos : "+ a_paterno +a_materno);
        System.out.println("DNI : "+ dni);
        System.out.println("Telefono:  "+ telefono);
     }
     void prospecto2 (){
        System.out.println("PROSPECTO_2 : ");
        System.out.println("Codigo : "+ codigo);
        System.out.println("Nombre : "+ nombre);
        System.out.println("Apellidos : "+ a_paterno +a_materno);
        System.out.println("DNI : "+ dni);
        System.out.println("Telefono:  "+ telefono);     }
     void prospecto3 (){
        System.out.println("PROSPECTO_3 : ");
        System.out.println("Codigo : "+ codigo);
        System.out.println("Nombre : "+ nombre);
        System.out.println("Apellidos : "+ a_paterno +a_materno);
        System.out.println("DNI : "+ dni);
        System.out.println("Telefono:  "+ telefono);     }
      void prospecto4 (){
        System.out.println("PROSPECTO_4 : "  );
        System.out.println("No se encontraron registros para los filtros ingresados " );
        System.out.println("Codigo : " );
        System.out.println("Nombre : " );
        System.out.println("Apellidos : "  );
        System.out.println("DNI : "  );
        System.out.println("Telefono:  " );     }

       
 }
