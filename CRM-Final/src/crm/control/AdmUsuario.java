
package crm.control;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import crm.control.BusinessException;
import crm.model.Usuario;
/**
 *
 * @author hector
 */
public class AdmUsuario {

	
	private List<Usuario> lstUsuario;
	
	public AdmUsuario() {
		lstUsuario = new ArrayList<Usuario>();
	}
	
	public boolean autenticarUsuario(String user, String password){
		Usuario usuario = obtenerUsuario(user);
		if(usuario.getClave().trim().equalsIgnoreCase(password.trim()))
			return true;
		return false;
	}
	
	public Usuario obtenerUsuario(String idUser){
		for (Usuario usua : lstUsuario) {
			if(idUser.equalsIgnoreCase(usua.getIdUsuario()))
				return usua;
		}
		return null;
	}
	
	public void registrarUsuario(String idUsuario, String numDNI,
			String nombUsuario, String apePaterno, String apeMaterno,
			String email, Date fecIngreso, String deCargo, String rol, String clave) throws BusinessException{
		
		vadarDatosObligatorios(idUsuario, numDNI, nombUsuario, apePaterno, apeMaterno, email, fecIngreso, deCargo, rol, clave);
		
		String msg = "";
		if(lstUsuario.size()== 0)
			lstUsuario.add(new Usuario(idUsuario, numDNI, nombUsuario,
					apePaterno, apeMaterno, email, fecIngreso, deCargo, rol,
					clave));
		else{
			if(null == obtenerUsuario(idUsuario))
				msg = "Usuario "+ idUsuario + " ya existe.";
			if(null == validarUsuarioDNI(numDNI))
				msg += "\nUsuario con dni "+ numDNI + " ya existe.";
			
			if(!msg.isEmpty())
				throw new BusinessException(msg);
			else
				lstUsuario.add(new Usuario(idUsuario, numDNI, nombUsuario,
						apePaterno, apeMaterno, email, fecIngreso, deCargo, rol,
						clave));
		}
	}
	
	public Usuario validarUsuarioDNI(String numeroDNI){
		for (Usuario usua : lstUsuario) {
			if(usua.getNumDNI().equals(numeroDNI.trim()))
				return usua;
		}
		return null;
	}
	
	@SuppressWarnings("null")
	public void vadarDatosObligatorios(String idUsuario, String numDNI,
			String nombUsuario, String apePaterno, String apeMaterno,
			String email, Date fecIngreso, String deCargo, String rol, String clave) 
					throws BusinessException{
		String msg = "";
		
		if(null == idUsuario && idUsuario.isEmpty())
			msg += "Usuario es obligatorio";
		if(null == numDNI && numDNI.isEmpty())
			msg += "\nNumero DNI es obligatorio";
		if(null == nombUsuario && nombUsuario.isEmpty())
			msg += "\nNombre es obligatorio";
		if(null == apePaterno && apePaterno.isEmpty())
			msg += "\nApellido Paterno es obligatorio";
		if(null == apeMaterno && apeMaterno.isEmpty())
			msg += "\nApellido Materno es obligatorio";
		if(null == email && email.isEmpty())
			msg += "\nMail es obligatorio";
		if(null == deCargo && deCargo.isEmpty())
			msg += "\nCargo es obligatorio";
		if(null == clave && clave.isEmpty())
			msg += "\nClave es obligatorio";
		if(null == fecIngreso)
			msg += "\nFecha de ingreso obligatorio";
		if(null == rol)
			msg += "\nRol es obligatorio";
		
		if(!msg.isEmpty())
			throw new BusinessException(msg);
	}
	
	public void eliminarUsuario(String idUser){
		lstUsuario.remove(obtenerUsuario(idUser));
	}


}