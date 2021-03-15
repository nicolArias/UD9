
package main;

import java.util.ArrayList;

import controlador.Controlador;
import objetos.Camion;
import objetos.Coche;
import objetos.Conductor;
import objetos.Moto;
import objetos.Titular;
import vista.VistaGeneral;


public class VehiculosApp {

	public static void main(String[] args) {

		Controlador controller = new Controlador();
		ArrayList lstPV = new ArrayList<>();
		Object ob1 = new Object();
		VistaGeneral vg=new VistaGeneral();
		
		try {
			int op2=0;
			do {
			
				/*Preguntara al usuario la opcion que desee, si quiere crear un vehiculo o un usuario*/
				int opcion = Integer.parseInt(vg.menuGeneral());

				if (opcion == 1) {// Opcion para crear usuario
					ob1=controller.menuUsuarios();
					lstPV.add(ob1);
				} else if (opcion == 2) {// Opcion para crear vehiculo
					ob1=controller.menuVehiculos();
					lstPV.add(ob1);
				}else if(opcion==3) {
					op2=3;
				}

			} while (op2!=3);
			
		} catch (NullPointerException | NumberFormatException e) {
			System.out.println("Objeto Vacio" +e);
		}

		// mostramos cantidad de personas y vehiculos que se crean
		for (Object o : lstPV) {
			if (o instanceof Coche) {
				System.out.println(o.toString());
			}
			if (o instanceof Camion) {
				System.out.println(o.toString());
			}
			if (o instanceof Moto) {
				System.out.println(o.toString());
			}
			if (o instanceof Titular) {
				System.out.println(o.toString());
			}
			if (o instanceof Conductor) {
				System.out.println(o.toString());
			}
		}
		

		/*System.out.println("Lista conductores \n"+controller.getLstConductor().toString());
		System.out.println("Lista titulares \n"+controller.getLstTitular().toString());*/
	
	}
}
