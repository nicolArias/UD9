package main;

import java.util.Scanner;

import objetos.Boss;
import objetos.Employee;
import objetos.Manager;

public class milestone1App {

	public static void main(String[] args) {
		
		System.out.println("Indique a que empleado calcular el sueldo:"+
							"\n1. Manager"+"\n2. Boss"+"\n3. Employee"+"\n4. Volunteer");
		Scanner scanner=new Scanner(System.in);
		
		String entrada=scanner.nextLine();
		
		System.out.println("Ingrese el salario: ");
		double salario=scanner.nextDouble();
		String mensaje="";
		
		switch(entrada) {
		case("1"):
			Manager manager=new Manager(salario);
			mensaje="Salario del Manager: "+manager.getSalario();
			break;
		case("2"):
			Boss boss=new Boss(salario);
			mensaje="Salario del Boss: "+boss.getSalario();
			break;
			
		case("3"):
			Employee employee=new Employee(salario);
			mensaje="Salario del Employee: "+employee.getSalario();
			break;
		case("4"):
			System.out.println("Los voluntario no cobran");
			break;
		default:
			System.out.println("La opción ingresada es incorrecta");
			
		}
		
		System.out.println(mensaje);
	}
}
