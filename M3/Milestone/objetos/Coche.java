package objetos;

import java.util.ArrayList;

public class Coche extends Vehiculo {

	
	public Coche() {
		super();
	}
	
	public Coche(String matricula,String marca, String color,String marcaD,String marcaT,double dD,double dT,Titular titular,ArrayList<Conductor> conductores){
		super(matricula, marca, color, marcaD, marcaT,dD,dT,titular,conductores);
	}
	
}
