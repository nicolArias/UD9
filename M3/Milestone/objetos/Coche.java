package objetos;

import java.util.List;

public class Coche extends Vehiculo {


	public Coche() {
		super();
	}
	
	public Coche(String placa,String marca, String color){
		super(placa, marca, color);
	}
	
	public void addRuedas(List<Ruedas> ruedasFrontales, List<Ruedas> ruedasTraseras){
		Ruedas ruedaDerecha = ruedasFrontales.get(0);
		Ruedas ruedaIzquierda = ruedasTraseras.get(0);
	
		this.ruedas.add(ruedaDerecha);
		this.ruedas.add(ruedaIzquierda);
		
	}
	
	
	@Override
	public String toString() {
		return "COCHE\n[Placa: "+this.placa+
				"\nMarca: "+this.marca+
				"\nColor: "+this.color+
				"\nRuedas"+this.ruedas.toString()+"]\n";
	}
	
}
