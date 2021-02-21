package objetos;

import vista.Vista;

public class Junior extends Empleados {
	Vista v=new Vista();
	
	public Junior() {
		
	}
	
	//Metodos GET Y SET
	public Junior(String nombreApels,int edad, double sueldoBrutoM) {
		super(nombreApels,edad,sueldoBrutoM);
		calcularSueldoNeto();
	}
	

	public void calcularSueldoNeto() {
		double sueldo=getsBrutMensual();
		
		double snetoM;
		double snetoA;

		if(sueldo>900 && sueldo<1600) {
			//Setear en la variable donde almacena el sueldo  bruto anual el calculo de sueldo bruto mensual *12
			this.setsBrutAnual(getsBrutMensual()*12);
			snetoM=this.getsBrutMensual()+(this.getsBrutMensual()*0.15 );
			
			snetoA=snetoM-(snetoM*0.2);
			this.sNetMensual=snetoA/12;
			this.sNetAnual=snetoA;
			
		}else {
	
			v.mensajeS("junior");
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
