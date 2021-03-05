package vista;

import javax.swing.JOptionPane;

public class VistaGeneral {

	
	public String menuGeneral() {
		String opcion=JOptionPane.showInputDialog("Indique con el número correspondiente su opcion:"
												+ "\n(1) Crear usuario"
												+ "\n(2) Crear vehiculo");
		String cantidad="";
		if(opcion.equals("1")) {
			cantidad=JOptionPane.showInputDialog("Cuantos usuarios desea crear?");
		}else if(opcion.equals("2")) {
			cantidad=JOptionPane.showInputDialog("Cuantos vehiculos desea crear?");
		}
		
		return opcion+"/"+cantidad;
	}
	
	public void mensajes(String m) {
		JOptionPane.showMessageDialog(null,m);
	}
}
