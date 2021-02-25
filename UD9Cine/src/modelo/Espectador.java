package modelo;

import java.util.Random;
/*Autor: Nicol Dayana Arias Lebro*/
public class Espectador {
	//ATRIBUTOS 
	//EDAD ALEATORIA
	private Random random=new Random();
	private final int EDAD_CONST=random.nextInt(50)+1;
	private final int DINERO_CONST=random.nextInt(100)+1;
	
	private String nombres[]= {"Jose","Nicol","Miroslav","Toni","Juan","Valentina","Orlando","Susana","Pedro","Noelia","Carlos","Paola","Lina","Ivan","Jhon"};
	private int edad;
	private String nombre;
	private int cantDinero;
	private String puesto;
	
	

		
	
	//CONSTRUCTOR POR DEFECTO
	public Espectador() {
		randomNom();
		this.edad=EDAD_CONST;
		this.cantDinero=DINERO_CONST;
		this.puesto="";
	}

	//M�TODO QUE GENERA UN NOMBRE RANDOM
	public void randomNom() {
		int r=random.nextInt(15)+0;
		this.nombre=nombres[r];
	}
		
	
	//CLASES GET Y SET
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

	public int getCantDinero() {
		return cantDinero;
	}

	public void setCantDinero(int cantDinero) {
		this.cantDinero = cantDinero;
	}

	public String getPuesto() {
		return puesto;
	}

	public void setPuesto(String puesto) {
		this.puesto = puesto;
	}


	
	
		
		
	
}
