package objetos;

import java.util.List;

public class Moto extends Vehiculo {


	
	public Moto(String placa, String marca, String color) {
		super(placa, marca, color);
	}
	
	public void addRuedas(List<Ruedas> ruedaFrontal, List<Ruedas> ruedaTrasera) throws Exception {
		Ruedas rueda_F = ruedaFrontal.get(0);
		Ruedas rueda_T = ruedaTrasera.get(0);

	
		this.ruedas.add(rueda_F);
		this.ruedas.add(rueda_T);
		
	}
	
}
