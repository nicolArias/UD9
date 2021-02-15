package punto5;

public abstract class Persona {
	
	//ATRIBUTOS
	protected String nombre;
	protected int edad;
	protected char sexo;
	
	protected int asistencia;
	
	public Persona() {
		
	}
	
	public Persona(String nombre, int edad, char sexo,int asistencia) {
		this.nombre=nombre;
		this.edad=edad;
		this.sexo=sexo;
		this.asistencia=asistencia;
				
	}
	
	
	public abstract boolean estaDisponible();

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	public int getAsistencia() {
		return asistencia;
	}

	public void setAsistencia(int asistencia) {
		this.asistencia = asistencia;
	}
	
	
}
