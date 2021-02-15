package punto5;

public class Alumno extends Persona {
	
	//ATRIBUTOS
	protected double calificacionFinal;
	
	//CONSTRUCTOR
	public Alumno() {
		
	}
	public Alumno(String nombre,int edad,char sexo,int asistencia,double calFinal) {
		super(nombre,edad,sexo,asistencia);
		this.calificacionFinal=calFinal;
		
		
	}
	
	public boolean estaDisponible() {
		if(asistencia>50) {
			return false;
		}
		return true;
	}
	public double getCalificacionFinal() {
		return calificacionFinal;
	}
	public void setCalificacionFinal(double calificacionFinal) {
		this.calificacionFinal = calificacionFinal;
	} 
	
	

}
