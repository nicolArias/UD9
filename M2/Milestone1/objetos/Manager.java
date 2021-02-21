package objetos;

public class Manager {
	//Constantes
	private final double PORC=0.1;
	protected double salario;
	
	public Manager() {
		this.salario=0;
	}
	
	public Manager(double salario) {
		this.salario=salario+(salario*PORC);
	}
	
	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	

}
