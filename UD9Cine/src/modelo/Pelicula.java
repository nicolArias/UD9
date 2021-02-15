package modelo;

import java.util.Random;

public class Pelicula {
	private Random random=new Random();
	private String peliculas[]= {"Abominable","Apollo 11","El hoyo","Frozen II","La hija de una radron"};
	private String directores[]= {"Carlos Kleiber", "Nikolaus Harnoncourt ", "Wilhelm Furtwängler", "Arturo Toscanini", "Simon Rattle"};
	
	//Random
	private int duracionRandom=random.nextInt(180)+30;
	private int edadMinimaRandom[]={0,7,12,16,18};
	
	//ATRIBUTOS
	private String pelicula;
	private int duracion; //minutos
	private int edadMinima;
	private String director;
	
	
	//CONSTRUCTORES
	public Pelicula() {
		random();
		this.duracion=duracionRandom;
	}
	
	public void random() {
		int r=random.nextInt(5);
		this.edadMinima=edadMinimaRandom[r];
		this.pelicula=peliculas[r];
		this.director=directores[r];
	}

	//METODOS GET Y SET
	public String getPelicula() {
		return pelicula;
	}

	public void setPelicula(String pelicula) {
		this.pelicula = pelicula;
	}

	public int getDuracion() {
		return duracion;
	}

	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}

	public int getEdadMinima() {
		return edadMinima;
	}

	public void setEdadMinima(int edadMinima) {
		this.edadMinima = edadMinima;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}
	
	
}
