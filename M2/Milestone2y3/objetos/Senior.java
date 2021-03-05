package objetos;

import vista.Vista;

public class Senior extends Empleados {

		Vista v=new Vista();
		
		public Senior() {
			
		}
		
		//Metodos GET Y SET
		public Senior(String nombreApels,int edad, double sueldoBrutoM) {
			super(nombreApels,edad,sueldoBrutoM);
			calcularSueldoNeto();
		}
		

		public void calcularSueldoNeto() {
			double sueldo=getsBrutMensual();
			
			double snetoM;
			double snetoA;

			if(sueldo>2700 && sueldo<4000) {
				//Setear en la variable donde almacena el sueldo  bruto anual el calculo de sueldo bruto mensual *12
				this.setsBrutAnual(getsBrutMensual()*12);
				
				//Se calcula teniendo en cuenta que hay que reducir el 5%
				snetoM=this.getsBrutMensual()+(this.getsBrutMensual()*0.5);
				
				//Reducir el 24% del sueldo neto
				snetoA=snetoM-(snetoM*0.76);
				this.sNetMensual=snetoA/12;
				this.sNetAnual=snetoA;
				
			}else {
		
				v.mensajeS("boss");
			}

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
