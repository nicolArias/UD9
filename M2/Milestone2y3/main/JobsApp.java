package main;

import objetos.Boss2;
import objetos.Employee2;
import objetos.Junior;
import objetos.Manager2;
import objetos.Mid;
import objetos.Senior;
import objetos.Volunteer2;
import vista.Vista;

public class JobsApp {

	public static void main(String[] args) {
		Vista v=new Vista();
		String respM=v.menu();
		String nombre=v.pedirNombre();
		
		
		if(!respM.equals("4")) {
			int edad=v.pedirEdad();
			double sueldo=v.pedirSueldo();
			
			if(respM.equals("1")) {
				Manager2 manager2=new Manager2(nombre,edad,sueldo);
				v.mostrarDatos(1, nombre, edad, sueldo);
				
			}else if(respM.equals("2")){
				Boss2 boss2=new Boss2(nombre,edad,sueldo);
				v.mostrarDatos(2, nombre, edad, sueldo);
				
			}else if(respM.equals("3")){
				Employee2 emp2=new Employee2(nombre, edad, sueldo);
				v.mostrarDatos(3,nombre,edad,sueldo);
			
			}else if(respM.equals("5")){
				Junior junior=new Junior(nombre, edad, sueldo);
				v.mostrarDatos(5, nombre, edad, sueldo);
				
			}else if(respM.equals("6")){
				Mid mid=new Mid(nombre, edad, sueldo);
				v.mostrarDatos(6, nombre, edad, sueldo);
				
			}else if(respM.equals("7")){
				Senior senior=new Senior(nombre, edad, sueldo);
				v.mostrarDatos(7, nombre, edad, sueldo);
			}
			
			
		}else if(respM.equals("4")){
			Volunteer2 volunteer=new Volunteer2();
			v.mostrarDatos(4, nombre, 0, 0);
		}
		
			
		

	}

}


