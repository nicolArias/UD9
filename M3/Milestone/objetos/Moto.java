package objetos;

import java.util.List;

public class Moto extends Vehiculo {

	
	public Moto() {
		super();
	}
	
	public Moto(String placa, String marca, String color) {
		super(placa, marca, color);
	}
	
	public void addRuedas(List<Ruedas> ruedaFrontal, List<Ruedas> ruedaTrasera){
		Ruedas rueda_F = ruedaFrontal.get(0);
		Ruedas rueda_T = ruedaTrasera.get(0);

	
		this.ruedas.add(rueda_F);
		this.ruedas.add(rueda_T);
		
	}
	
	@Override
	public String toString() {
		return "MOTO\n[Placa: "+this.placa+
				"\nMarca: "+this.marca+
				"\nColor: "+this.color+
				"\nRuedas"+
				"\nRuedas delanteras"+
				"\nMarca: "+this.ruedas+"]\n";
	}
	
}
