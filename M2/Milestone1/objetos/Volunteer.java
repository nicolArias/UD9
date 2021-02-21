package objetos;

public class Volunteer {
/*No cobran*/
	
	//Constantes
		private final double PORC=0.15;
		protected double salario;
		
		public Volunteer() {
			this.salario=0;
		}
		
		public double getSalario() {
			return salario;
		}

		public void setSalario(double salario) {
			this.salario = salario;
		}
		

}
