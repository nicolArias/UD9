package objetos;

public class Persona {

	protected String nombre;
	protected String apellidos;
	protected String fechaNacimiento;
	protected Licencia licencia;
	
	
	public Persona() {
		this.nombre="";
		this.apellidos="";
		this.fechaNacimiento="";
		this.licencia=new Licencia();
	}
	
	public Persona(String nombre, String apellidos,String fechaNac,Licencia licencia){
		this.nombre=nombre;
		this.apellidos=apellidos;
		this.fechaNacimiento=fechaNac;
		this.licencia=licencia;
	}
	
}
