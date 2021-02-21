package objetos;

import java.util.ArrayList;

public class Moto extends Vehiculo {

	
	public Moto() {
		super();
	}
	
	public Moto(String matricula, String marca, String color,String marcaD,String marcaT,double dD,double dT,Titular titular,ArrayList<Conductor> conductores) {
		super(matricula, marca, color,marcaD,marcaT,dD,dT,titular,conductores);
	}
}
