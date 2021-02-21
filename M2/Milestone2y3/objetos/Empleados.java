package objetos;

public class Empleados {
 
	//Atributos
	//Milestone1
	protected double porcentaje;
	
	protected String nombreApels;
	protected int edad;
	
	//Milestone3
	protected double sNetMensual;
	protected double sBrutMensual;
	protected double sNetAnual;
	protected double sBrutAnual;
	
	
	
	public Empleados() {
		this.porcentaje=0;
		this.nombreApels="";
		this.edad=0;
		
		this.sBrutMensual=0;
		
	}
	
	public Empleados(String nombreApels,int edad,double sBrutM) {
		
		this.nombreApels=nombreApels;
		this.edad=edad;
		this.sBrutMensual=sBrutM;
		
	}

	public double getPorcentaje() {
		return porcentaje;
	}

	public void setPorcentaje(double porcentaje) {
		this.porcentaje = porcentaje;
	}

	public String getNombreApels() {
		return nombreApels;
	}

	public void setNombreApels(String nombreApels) {
		this.nombreApels = nombreApels;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public double getsNetMensual() {
		return sNetMensual;
	}

	public void setsNetMensual(double sNetMensual) {
		this.sNetMensual = sNetMensual;
	}

	public double getsBrutMensual() {
		return sBrutMensual;
	}

	public void setsBrutMensual(double sBrutMensual) {
		this.sBrutMensual = sBrutMensual;
	}

	public double getsNetAnual() {
		return sNetAnual;
	}

	public void setsNetAnual(double sNetAnual) {
		this.sNetAnual = sNetAnual;
	}

	public double getsBrutAnual() {
		return sBrutAnual;
	}

	public void setsBrutAnual(double sBrutAnual) {
		this.sBrutAnual = sBrutAnual;
	}
	
	
	public String toString() {
		return "EMPLEADO \nNombre y Apellidos: "+getNombreApels()+
				"\nSalario Bruto Mensual: "+this.sBrutMensual+
				"\nSalario Neto Mensual: "+this.sNetMensual+
				"\nSalario Bruto Anual: "+this.sBrutAnual+
				"\nSalario Neto Anual: "+this.sNetAnual;
	}
	
	

	
}
