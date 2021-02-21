package vista;

import javax.swing.JOptionPane;

import objetos.Boss2;
import objetos.Empleados;
import objetos.Employee2;
import objetos.Junior;
import objetos.Manager2;
import objetos.Mid;
import objetos.Senior;
import objetos.Volunteer2;

public class Vista {

	public Vista() {
		
	}
	
	
	public String menu() {
		
		String opcion=JOptionPane.showInputDialog("Indique que empleado quiere gestionar:"+
													"\n1. Manager"+
													"\n2. Boss"+
													"\n3. Employee"+
													"\n4. Volunteer"+
													"\n5. Junior"+
													"\n6. Mid"+
													"\n7.Senior");
		
		return opcion;
	}
	
	public String pedirNombre() {
		String nomApels=JOptionPane.showInputDialog("Ingrese su nombre y apellidos");
		return nomApels;
	}
	
	public int pedirEdad() {
		int edad=Integer.parseInt(JOptionPane.showInputDialog("Ingrese su edad:"));
		return edad;
	}
	public double pedirSueldo() {
		
		double sueldoB=Double.parseDouble(JOptionPane.showInputDialog("Ingrese el sueldo bruto: "));
	
		return sueldoB;
	}
	
	public void mostrarDatos(int op,String nombre,int edad, double sueldo) {
	
		if(op==1) {
			Manager2 manager2=new Manager2(nombre,edad,sueldo);
			System.out.println(manager2.toString());
			
		}else if(op==2) {
			Boss2 boss2=new Boss2(nombre,edad,sueldo);
			System.out.println(boss2.toString());
			
		}else if(op==3) {
			Employee2 emp2=new Employee2(nombre, edad, sueldo);
			System.out.println(emp2.toString());
			
		}else if(op==4) {
			Volunteer2 volunteer=new Volunteer2(nombre);
			System.out.println(volunteer.toString());
			
		}else if(op==5) {
			Junior junior=new Junior(nombre, edad, sueldo);
			System.out.println(junior.toString());
			
		}else if(op==6) {
			Mid mid=new Mid(nombre, edad, sueldo);
			System.out.println(mid.toString());
		}else if(op==7) {
			Senior senior=new Senior(nombre, edad, sueldo);
			System.out.println(senior.toString());
		}else {
			System.out.println("No selecciono ninguna de las opciones previstas");
		}
		
	}
	
	public void mensajeS(String op) {
		
		if(op.equals("boss")) {
			JOptionPane.showMessageDialog(null, "El empleado debe ganar mas de 8000€");
		}else if(op.equals("manager")) {
			JOptionPane.showMessageDialog(null, "El empleado debe ganar mas de 3000€ pero menos de 5000€");
		}else if(op.equals("senior")) {
			JOptionPane.showMessageDialog(null, "El empleado debe ganar mas de 2700€ pero menos de 4000€");
		}else if(op.equals("mid")) {
			JOptionPane.showMessageDialog(null, "El empleado debe ganar mas de 1800€ pero menos de 2500€");
		}else if(op.equals("junior")) {
			JOptionPane.showMessageDialog(null, "El empleado debe ganar mas de 900€ pero menos de 1600€");
		}
		
	}
} 
