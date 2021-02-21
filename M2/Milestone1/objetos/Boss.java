package objetos;

public class Boss {
/*Cobran 50% mas del salario mensual*/
	
	//Constantes
		private final double PORC=0.5;
		protected double salario;
		
		public Boss() {
			this.salario=0;
		}
		
		public Boss(double salario) {
			this.salario=salario+(salario*PORC);
		}

		public double getSalario() {
			return salario;
		}

		public void setSalario(double salario) {
			this.salario = salario;
		}
		
		

}
