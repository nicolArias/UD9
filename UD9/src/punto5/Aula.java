package punto5;

public class Aula {
	
	//CONSTANTES
	//protected final String[] materiaArray= {"matematicas","filosofia","fisica"};
	
	//ATRIBUTOS
	protected int identificador;
	protected int numMax_estudiantes;
	protected String materiaAula;
	protected Alumno alumnos[]=new Alumno[5];
	protected Profesor profesor;
	
	
	//CONSTRUCTOR
	public Aula() {
		
	}
	public Aula(int identificador,int numMax,String materiaAula,Alumno[] alumnos,Profesor profesor) {
		this.identificador=identificador;
		this.numMax_estudiantes=numMax;
		this.materiaAula=materiaAula;
		this.alumnos=alumnos;
		this.profesor=profesor;
	}
	
	
	
	public int getIdentificador() {
		return identificador;
	}
	public void setIdentificador(int identificador) {
		this.identificador = identificador;
	}
	public int getNumMax_estudiantes() {
		return numMax_estudiantes;
	}
	public void setNumMax_estudiantes(int numMax_estudiantes) {
		this.numMax_estudiantes = numMax_estudiantes;
	}
	public String getMateriaAula() {
		return materiaAula;
	}
	public void setMateriaAula(String materiaAula) {
		this.materiaAula = materiaAula;
	}
	public Alumno[] getAlumnos() {
		return alumnos;
	}
	public void setAlumnos(Alumno[] alumnos) {
		this.alumnos = alumnos;
	}
	public Profesor getProfesor() {
		return profesor;
	}
	public void setProfesor(Profesor profesor) {
		this.profesor = profesor;
	}
	
	
	//Asignar alumnos al aula
	public int alumnosxAula() {
		int contador=0;
		for(int i=0;i<alumnos.length;i++) {
			if(alumnos[i].estaDisponible()) {
				contador++;
			}
		}
		
		return contador;
	}
	
	//Asignar profesor al aula
	public boolean profesorxAula() {
		
		boolean resp=false;
		
			if(profesor.comprobarMateria() && profesor.getMateria().equals(materiaAula) && profesor.estaDisponible()){
				resp=true;
			}
		
		return resp;
		
	}
	
	public String aprobados() {
		int cantAprobadosF=0;
		int cantAprobadosM=0;
		String aprobados="";
		for(int a=0;a<alumnos.length;a++) {
			if(alumnos[a].getCalificacionFinal()>=5) {
			if(alumnos[a].getSexo()=='F'){
				cantAprobadosF++;
			}else {
				cantAprobadosM++;
			}
			}
		}
		return aprobados="Mujeres: "+cantAprobadosF+"\nHombres: "+cantAprobadosM;
	}
	
	
	public String darClase() {
		int porAsistenciaAlumnos=Math.round(alumnosxAula()%50);
		int porMaxAlumnos=Math.round(5%50);

		String mensaje="";
		if(porAsistenciaAlumnos>=porMaxAlumnos && profesor.getAsistencia()>=20 && profesorxAula()) {
			if(profesorxAula()){
				System.out.println("Se puede dar la clase");
				mensaje="SE PUEDE DAR LA CLASE"+toString();
			}
			
		}else {
			mensaje="La clase no se puede realizar";
		}
		
		return mensaje;
		
	}
	
	public String toString() {
		return "\nAula: "+identificador
				+"\nClase de: "+materiaAula
				+"\nNúmero máximos alumnos: "+numMax_estudiantes
				+"\nProfesor asignado: "+profesor.getNombre()
				+"\nCantidad Alumnos aprobados: \n"+aprobados();
	}
	
	

	

	
}
