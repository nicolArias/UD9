package objetos;

import java.util.List;

public class Coche extends Vehiculo {


	public Coche(String placa,String marca, String color){
		super(placa, marca, color);
	}
	
	public void addRuedas(List<Ruedas> ruedasFrontales, List<Ruedas> ruedasTraseras) throws Exception {
		add_DosRuedas(ruedasFrontales);
		add_DosRuedas(ruedasTraseras);
	}

	public void add_DosRuedas(List<Ruedas> ruedas) throws Exception {
		if (ruedas.size() != 2)
			throw new Exception();

		Ruedas ruedaDerecha = ruedas.get(0);
		Ruedas ruedaIzquierda = ruedas.get(1);

		if (!ruedaDerecha.equals(ruedaIzquierda))
			throw new Exception();

		this.ruedas.add(ruedaDerecha);
		this.ruedas.add(ruedaIzquierda);
	}
	
	
}
