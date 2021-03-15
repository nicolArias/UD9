package objetos;

public class Persona {

	protected String nombre;
	protected String apellidos;
	protected String fechaNacimiento;
	protected Licencia licencia;
	

	
	public Persona(String nombre, String apellidos,String fechaNac,Licencia licencia){
		this.nombre=nombre;
		this.apellidos=apellidos;
		this.fechaNacimiento=fechaNac;
		this.licencia=licencia;
	}

	public Persona() {

	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the apellidos
	 */
	public String getApellidos() {
		return apellidos;
	}

	/**
	 * @param apellidos the apellidos to set
	 */
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	/**
	 * @return the fechaNacimiento
	 */
	public String getFechaNacimiento() {
		return fechaNacimiento;
	}

	/**
	 * @param fechaNacimiento the fechaNacimiento to set
	 */
	public void setFechaNacimiento(String fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	/**
	 * @return the licencia
	 */
	public Licencia getLicencia() {
		return licencia;
	}

	/**
	 * @param licencia the licencia to set
	 */
	public void setLicencia(Licencia licencia) {
		this.licencia = licencia;
	}
	
	
	
}
