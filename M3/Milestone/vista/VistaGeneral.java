package vista;

import javax.swing.JOptionPane;

public class VistaGeneral {

	
	public String menuGeneral() {
		String opcion=JOptionPane.showInputDialog("Indique con el número correspondiente su opcion:"
												+ "\n(1) Crear usuario"
												+ "\n(2) Crear vehiculo"
												+ "\n(3) Salir");

		
		return opcion;
	}
	
	public void mensajes(String m) {
		JOptionPane.showMessageDialog(null,m);
	}
}
