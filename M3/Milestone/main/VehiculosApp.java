package main;

import vista.VistaVehiculos;

public class VehiculosApp {

	public static void main(String[] args) {
	
		VistaVehiculos v=new VistaVehiculos();
		String opcion=v.menu();
		String matricula=v.matricula();
		String marca=v.marca();
		String color=v.color();
		
		switch(opcion) {
		case("1"):
			
			break;
		case("2"):
			
			break;
		}
	}

}
