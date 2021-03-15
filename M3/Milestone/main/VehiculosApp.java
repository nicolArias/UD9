
package main;

import java.util.ArrayList;

import controlador.Controlador;
import objetos.Camion;
import objetos.Coche;
import objetos.Conductor;
import objetos.Moto;
import objetos.Titular;


public class VehiculosApp {

	public static void main(String[] args) {

		Controlador controller = new Controlador();
		ArrayList lstPV = new ArrayList<>();
		Object ob1 = new Object();

		try {
			do {
				ob1 = controller.menuGeneral();
				if(ob1!=null) {
					lstPV.add(ob1);
				}
				
			} while (ob1 != null);
			
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
