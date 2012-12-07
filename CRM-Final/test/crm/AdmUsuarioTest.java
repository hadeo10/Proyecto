/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package crm;
import java.util.Date;
import org.junit.Test;

import crm.control.AdmUsuario;
import crm.model.Usuario;

import crm.model.Utilitario.aleatorioRango;
import crm.model.Utilitario.fechaAleatoria;
import org.junit.Assert.*;
    
/**
 *
 * @author hector
 */
public class AdmUsuarioTest {
	
	String[] idUsuarios = new String[]{"user1", "user2", "user3", "user4", "user5", "user6", "user7", "user8", "user9", "user10"};
	String[] numDocumentos = new String[] { "43949920", "00245877", "02418006",
			"23407726", "41801109" };
	String[] nombres = new String[] { "Alex", "Luis", "CLAUDIO", "ALEJANDRO",
			"CESAR", "Marco", "Andres" };
	String[] apellidos = new String[] { "Sandoval", "Rengifo", "SANCHEZ",
			"QUIÑONES", "RAMOS", "Vicente", "Fernandez", "MAMANI", "MARROQUIN",
			"QUISPE" };
	String[] emails = new String[] { "alalal@lala.com", "ortro@sad.com",
			"asda@asfa.com", "sadad@dfs", "asdasf@free.com" };
	Date[] fecIngresos = new Date[]{fechaAleatoria(), fechaAleatoria(), fechaAleatoria(), fechaAleatoria(), fechaAleatoria(), fechaAleatoria()};
	String[] deCargos = new String[] {"Secretario", "Profesor", "Auxiliar", "Jefe"};
	String rol;
	String[] claves = new String[] {"12345", "55465", "77373", "345346", "453453453", "324342"};
	
	private AdmUsuario adm = new AdmUsuario();
	
	@Test
	public void autenticarUsuario() throws BusinessException{
			
		Usuario user = crearUsuario();
		
		String usuario = user.getIdUsuario();
		String clave = user.getClave();
		
		boolean esAutenticado = adm.autenticarUsuario(usuario, clave);
		
		assertNotNull(user);
		assertTrue(esAutenticado);
		
	}
	
	@Test
	public void registrarUsuario() throws BusinessException{
		Usuario user = crearUsuario();
		assertNotNull(user);
		
	}
	
	@Test
	public void buscarUsuario() throws BusinessException{
		Usuario user = crearUsuario();
		
		String userID = user.getIdUsuario();
		
		Usuario usertmp = adm.obtenerUsuario(userID);
		Usuario usertmp2 = adm.validarUsuarioDNI(user.getNumDNI());
		
		assertNotNull(user);
		assertEquals(user, usertmp);
		assertEquals(user, usertmp2);
		
	}
	
	public Usuario crearUsuario() throws BusinessException{
		String codigo = "123";
		String nombre = "Administrador";
		String descripcion = "sdasdas asd asasd";
		
		String idUsuario = idUsuarios[aleatorioRango(1,idUsuarios.length-1)];
		String numDNI = numDocumentos[aleatorioRango(1,numDocumentos.length-1)];
		String nombUsuario = nombres[aleatorioRango(1,nombres.length-1)];
		String apeMaterno = apellidos[aleatorioRango(1,apellidos.length-1)];
		String apePaterno = apellidos[aleatorioRango(1,apellidos.length-1)];
		String email = emails[aleatorioRango(1,emails.length-1)];
		Date fecIngreso = fecIngresos[aleatorioRango(1,fecIngresos.length-1)];
		String deCargo = deCargos[aleatorioRango(1,deCargos.length-1)];
		
		Rol rol = new Rol(codigo, nombre, descripcion);
		String clave = claves[aleatorioRango(1,claves.length-1)];
		
		adm.registrarUsuario(idUsuario, numDNI, nombUsuario, apePaterno,
				apeMaterno, email, fecIngreso, deCargo, rol, clave);
		
		return adm.obtenerUsuario(idUsuario);
	}


}
}
