package main;

import modelo.Cine;
import modelo.Espectador;

public class EjecutableApp {

	public static void main(String[] args) {
		
		Cine cine=new Cine(1);
	
		cine.llenarSalaAut();
		
		Espectador esp=new Espectador();
		cine.llenarSala(esp);
		
		cine.imprimirSala();
	}

}
