package objetos;

public class Employee {
	/*Cobran el sueldo mensual aplicando una reduccion del 15%*/
	
	//Constantes
		private final double PORC=0.15;
		protected double salario;
		
		public Employee() {
			this.salario=0;
		}
		
		public Employee (double salario) {
			this.salario=salario-(salario*PORC);
		}
		
		public double getSalario() {
			return salario;
		}

		public void setSalario(double salario) {
			this.salario = salario;
		}
		

}
