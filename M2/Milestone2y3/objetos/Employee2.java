package objetos;

public class Employee2 extends Empleados{
	/*Cobran el sueldo mensual aplicando una reduccion del 15%*/

		//Constructores
		public Employee2() {
			super();
			
		}
		
		public Employee2 (String nombreApels,int edad, double sueldoBrutoM) {
			super(nombreApels,edad,sueldoBrutoM);
			calcularSueldoNeto();
		}
		
		
		public void calcularSueldoNeto() {
			this.sNetMensual=this.getsBrutMensual()-(this.getsBrutMensual()*0.15);
			this.setsBrutAnual(this.getsBrutMensual()*12);
			this.setsNetAnual(this.getsNetMensual()*12);
		}
		
		public double bonus() {
			//Bonus del 10% del sueldo anual para cada empleado
			double bonus=(this.getsNetAnual()*0.1);
			return bonus;
		}
		
		
		public String toString() {
			return "EMPLEADO \nNombre y Apellidos: "+getNombreApels()+
					"\nSalario Bruto Mensual: "+this.sBrutMensual+
					"\nSalario Neto Mensual: "+this.sNetMensual+
					"\nSalario Bruto Anual: "+this.sBrutAnual+
					"\nSalario Neto Anual: "+this.sNetAnual+
					"\nBonus anual: "+bonus();
		}

}
