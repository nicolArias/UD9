package objetos;

public class Licencia {
	
	
	protected String ID;
	protected String tipoLicencia;
	protected String nombreCompleto;
	protected String fechaCaducidad;
	
	public Licencia() {
		
	}
	
	public Licencia(String ID,String tipoLicencia, String nomCompleto,String fechaCaducidad) {
		this.ID=ID;
		this.tipoLicencia=tipoLicencia;
		this.nombreCompleto=nomCompleto;
		this.fechaCaducidad=fechaCaducidad;
	}
	
	//Get y set

	public String getID() {
		return ID;
	}

	public void setID(String iD) {
		ID = iD;
	}

	public String getTipoLicencia() {
		return tipoLicencia;
	}

	public void setTipoLicencia(String tipoLicencia) {
		this.tipoLicencia = tipoLicencia;
	}

	public String getNombreCompleto() {
		return nombreCompleto;
	}

	public void setNombreCompleto(String nombreCompleto) {
		this.nombreCompleto = nombreCompleto;
	}

	public String getFechaCaducidad() {
		return fechaCaducidad;
	}

	public void setFechaCaducidad(String fechaCaducidad) {
		this.fechaCaducidad = fechaCaducidad;
	}
	
	
	
}
