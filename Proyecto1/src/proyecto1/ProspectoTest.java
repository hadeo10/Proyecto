
package proyecto1;

public class ProspectoTest {
    
       public static void main (String [] args){    
           
          Prospecto one = new Prospecto();
          one.codigo = 231L  ;
          one.nombre = "  Hector ";
          one.a_paterno = "Delgado ";
          one.a_materno = "Ortiz     ";
          one.dni = 23078990  ;
          one.telefono =  5622556;
//          one.email = hdelgado@upc.pe;
          one.prospecto1();
       
          Prospecto two = new Prospecto();
          two.codigo = 232L   ;
          two.nombre = "  Francisco ";
          two.a_paterno = "Carreño ";
          two.a_materno = "Soto   ";
          two.dni = 27845789;
          two.telefono =  3287690;
//        two.email = fcarreño@upc.edu.pe;
          two.prospecto2();
          
          Prospecto three = new Prospecto();
          three.codigo = 233L   ;
          three.nombre = "  Fabrizio ";
          three.a_paterno = "Aguirre ";
          three.a_materno = "Bazalar   ";
          three.dni = 35578428;
          three.telefono =  4652711;
//        three.email = faguirre@upc.edu.pe;
          three.prospecto3();  
          
          Prospecto four = new Prospecto();
          four.codigo = null   ;
          four.nombre = null;
          four.a_paterno = null;
          four.a_materno = null;

//        three.email = faguirre@upc.edu.pe;
          four.prospecto4();  
      }
       
    

  }
    
    

