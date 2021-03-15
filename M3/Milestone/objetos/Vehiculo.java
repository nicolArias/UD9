package objetos;

import java.util.ArrayList;
import java.util.List;

public class Vehiculo {
	
	//Atributos
	protected String placa;
	protected String marca;
	protected String color;
	protected List<Ruedas> ruedas=new ArrayList<Ruedas>();
	protected Titular titular;
	protected ArrayList<Conductor> lstConductores;

	public Vehiculo() {

	}
	
	public Vehiculo(String placa,String marca,String color) {
		this.placa=placa;
		this.marca=marca;
		this.color=color; 
	}

	
	//METODOS GET Y SET
	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	
	

	public Titular getTitular() {
		return titular;
	}

	public void setTitular(Titular titular) {
		this.titular = titular;
	}

	public List<Conductor> getLstConductores() {
		return lstConductores;
	}

	public void setLstConductores(ArrayList<Conductor> lstConductores) {
		this.lstConductores = lstConductores;
	}

	

	public List<Ruedas> getRuedas() {
		return ruedas;
	}

	public void setRuedas(List<Ruedas> ruedas) {
		this.ruedas = ruedas;
	}

}
