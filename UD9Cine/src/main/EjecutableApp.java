package main;

import modelo.Cine;
import modelo.Espectador;
import vista.Vista;
/*Autor: Nicol Dayana Arias Lebro*/
public class EjecutableApp {

	public static void main(String[] args) {
		
		Cine cine=new Cine(1);
	
		cine.llenarSalaAut();
		
		Espectador esp=new Espectador();
		cine.llenarSala(esp);
		
		cine.imprimirSala();
		
		Vista view=new Vista();
		
		view.imprimirEspectadores(cine.imprimirListaEsp());
		
		view.imprimirSala(cine.imprimirSala());
	}

}
