
package crm.model;
import java.util.Date;
/**
 *
 * @author hector
 */
public class Usuario {
	
	private String idUsuario;
	private String numDNI;
	private String nombUsuario;
	private String apeMaterno;
	private String apePaterno;
	private String email;
	private Date fecIngreso;
	private String deCargo;
	private String rol;
	private String clave;
	
	
	public Usuario(String idUsuario, String numDNI,
			String nombUsuario, String apePaterno, String apeMaterno,
			String email, Date fecIngreso, String deCargo, String rol, String clave) {
		this.idUsuario = idUsuario;
		this.numDNI = numDNI;
		this.nombUsuario = nombUsuario;
		this.apeMaterno = apeMaterno;
		this.apePaterno = apePaterno;
		this.email = email;
		this.fecIngreso = fecIngreso;
		this.deCargo = deCargo;
		this.rol = rol;
		this.clave = clave;
	}
	
	public String getIdUsuario() {
		return idUsuario;
	}
	public void setIdUsuario(String idUsuario) {
		this.idUsuario = idUsuario;
	}
	public String getNumDNI() {
		return numDNI;
	}
	public void setNumDNI(String numDNI) {
		this.numDNI = numDNI;
	}
	public String getNombUsuario() {
		return nombUsuario;
	}
	public void setNombUsuario(String nombUsuario) {
		this.nombUsuario = nombUsuario;
	}
	public String getApeMaterno() {
		return apeMaterno;
	}
	public void setApeMaterno(String apeMaterno) {
		this.apeMaterno = apeMaterno;
	}
	public String getApePaterno() {
		return apePaterno;
	}
	public void setApePaterno(String apePaterno) {
		this.apePaterno = apePaterno;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Date getFecIngreso() {
		return fecIngreso;
	}
	public void setFecIngreso(Date fecIngreso) {
		this.fecIngreso = fecIngreso;
	}
	public String getDeCargo() {
		return deCargo;
	}
	public void setDeCargo(String deCargo) {
		this.deCargo = deCargo;
	}
	public String getRol() {
		return rol;
	}
	public void setRol(String rol) {
		this.rol = rol;
	}
	public String getClave() {
		return clave;
	}
	public void setClave(String clave) {
		this.clave = clave;
	}

	
	public boolean validarUsuario(String clave, String clave2){
		
		if(!clave.isEmpty() && !clave2.isEmpty())		
			if(clave.trim().equalsIgnoreCase(clave2.trim()))
				return true;
		return false;
	}

}