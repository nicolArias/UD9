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

	public ArrayList<Conductor> getLstConductores() {
		return lstConductores;
	}

	public void setLstConductores(ArrayList<Conductor> lstConductores) {
		this.lstConductores = lstConductores;
	}

	//La matricula debe tener 4 y 2 o 3 letras
	public boolean comprobarMatricula() {
		char[] cadenaMatricula=getPlaca().toCharArray();
		
		String num="";
		String letra="";
		int cont=0;
		boolean respuesta=false;
		
		for(int i=0;i<cadenaMatricula.length;i++) {
			if(Character.isDigit(cadenaMatricula[i])) {
				num+=cadenaMatricula[i];
				cont++;
			}else {
				letra+=cadenaMatricula[i];
			}
		}
		
		if(num.length()==4 && letra.length()==3 || letra.length()==2) {
			respuesta=true;
		}else {
			respuesta=false;
		}
		
		return respuesta;
	}
	
	
	//El diametro de las ruedas deben ser superio a 0.4 e inferior a 4
	public boolean comprobarDiametro() {
		boolean respuesta=false;
		
		/*if(getDiametroD()>0.4 && getDiametroD()<4 && getDiametroT()>0.4 && getDiametroT()<4) {
			respuesta=true;
		}*/
		return respuesta;
	}
	
	
}
