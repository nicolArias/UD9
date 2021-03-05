package vista;

import javax.swing.JOptionPane;

public class VistaVehiculos {
	
	public VistaVehiculos() {
		
	}
	
	public String menuVehiculos() {
		String menu=JOptionPane.showInputDialog("Elija que vehiculo desea crear:"+
												"\n1. Coche"+
												"\n2. Moto"+
												"\n3. Camion");
		
		return menu;
	}
	
	public String placa() {
		String mat=JOptionPane.showInputDialog("Introduzca la placa del  vehiculo");
		return mat;
	}
	
	public String color() {
		String color=JOptionPane.showInputDialog("Introduzca el color del vehiculo");
		return color;
	}
	
	public String marca() {
		String marca=JOptionPane.showInputDialog("Introduzca la marca del vehiculo");
		return marca;
	}
	
	public String marcaD() {
		String marcaD=JOptionPane.showInputDialog("Introduzca la marca de la llanta delantera");
		return marcaD;
	}
	
	public String marcaT() {
		String marcaT=JOptionPane.showInputDialog("Introduzca la marca de la llanta trasera");
		return marcaT;
	}
	
	public String diametroD() {
		String diametroD=JOptionPane.showInputDialog("Introduzca el diametro de la llanta delantera");
		return diametroD;
	}
	
	public String diametroT() {
		String diametroT=JOptionPane.showInputDialog("Introduzca el diametro de la llantas trasera");
		return diametroT;
	}
	
}
