package punto5;

public class Profesor extends Persona {
	//CONSTANTE
	protected final String[] materias= {"matematicas","filosofia","fisica"};
	//ATRIBUTOS
	protected String materia;
	
	
	public Profesor() {
		
	}
	public Profesor(String nombre,int edad,char sexo,int asistencia,String materia) {
		super(nombre,edad,sexo,asistencia);
		this.materia=materia;
	}
	 
	
	//MÉTODO GET
	public String getMateria() {
		return materia;
	}
	
	//MÉTODO PARA COMPROBAR QUE LA MATERIA QUE INGRESO EL USUARIO PERTENEZCA A LA LISTA
	public boolean comprobarMateria() {
		
		for(int i=0;i<materias.length;i++) {
			if(getMateria().equals(materias[i])) {
				return true;
			}
		}
		
		return false;
	}
	
	public boolean estaDisponible() {
		if(asistencia>20) {
			return false;
		}
		return true; 
		

	}




}
