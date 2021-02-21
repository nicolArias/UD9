package objetos;

public class Volunteer2 {
/*No cobran*/
	
	protected double ayuda;
	protected String nombre;
	
	
	public Volunteer2() {
		this.ayuda=300;
		this.nombre="";
	}
	
	public Volunteer2(String nombre) {
		this.ayuda=300;
		this.nombre=nombre;
	}
		
	public String toString() {
		return "Voluntario \n Nombre: "+this.nombre+
				"Ayuda: "+this.ayuda;
	}

}
