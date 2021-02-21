package objetos;

import java.util.ArrayList;

public class Vehiculo {
	
	//Atributos
	protected String matricula;
	protected String marca;
	protected String color;
	protected String marcaD;
	protected String marcaT;
	protected double diametroD;
	protected double diametroT;
	protected Titular titular;
	protected ArrayList<Conductor> lstConductores;
	
	public Vehiculo() {
		
	}
	
	public Vehiculo(String matricula,String marca,String color,String marcaD,String marcaT,double dD,double dT,Titular titular,ArrayList<Conductor> conductores) {
		this.matricula=matricula;
		this.marca=marca;
		this.color=color;
		this.marcaD=marcaD;
		this.marcaT=marcaT;
		this.diametroD=dD;
		this.titular=titular;
		this.lstConductores=conductores;
		this.diametroT=dT;
	}

	
	//METODOS GET Y SET


	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
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

	public String getMarcaD() {
		return marcaD;
	}

	public void setMarcaD(String marcaD) {
		this.marcaD = marcaD;
	}

	public String getMarcaT() {
		return marcaT;
	}

	public void setMarcaT(String marcaT) {
		this.marcaT = marcaT;
	}

	public double getDiametroD() {
		return diametroD;
	}

	public void setDiametroD(double diametroD) {
		this.diametroD = diametroD;
	}

	public double getDiametroT() {
		return diametroT;
	}

	public void setDiametroT(double diametroT) {
		this.diametroT = diametroT;
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
		char[] cadenaMatricula=getMatricula().toCharArray();
		
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
		
		if(getDiametroD()>0.4 && getDiametroD()<4 && getDiametroT()>0.4 && getDiametroT()<4) {
			respuesta=true;
		}
		return respuesta;
	}
	
	
}
