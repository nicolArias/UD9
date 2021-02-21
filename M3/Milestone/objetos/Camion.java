package objetos;

import java.util.ArrayList;

public class Camion extends Vehiculo{
	
	public Camion() {
		super();
	}
	
	public Camion(String matricula,String marca, String color,String marcaD,String marcaT,double dD,double dT,Titular titular,ArrayList<Conductor> conductores){
		super(matricula, marca, color, marcaD, marcaT,dD,dT,titular,conductores);
	}
	
}
