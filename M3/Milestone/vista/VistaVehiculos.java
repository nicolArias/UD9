package vista;

import javax.swing.JOptionPane;

public class VistaVehiculos {
	
	public VistaVehiculos() {
		
	}
	
	public String menu() {
		String menu=JOptionPane.showInputDialog("Elija que vehiculo desea crear:"+
												"\n1. Coche"+
												"\n2. Moto");
		
		return menu;
	}
	
	public String matricula() {
		String mat=JOptionPane.showInputDialog("Introduzca la matricula del  vehiculo");
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
		String marcaD=JOptionPane.showInputDialog("Introduzca la marca de las llantas delanteras");
		return marcaD;
	}
	
	public String marcaT() {
		String marcaT=JOptionPane.showInputDialog("Introduzca la marca de las llantas traseras");
		return marcaT;
	}
	
	public double diametroD() {
		double diametroD=Double.parseDouble("Introduzca el diametro de las llantas delanteras");
		return diametroD;
	}
	
	public double diametroT() {
		double diametroT=Double.parseDouble("Introduzca el diametro de las llantas traseras");
		return diametroT;
	}
	
}
