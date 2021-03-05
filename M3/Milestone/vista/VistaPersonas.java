package vista;

import javax.swing.JOptionPane;

public class VistaPersonas {

	
	public String menuPersona() {
		
		String opcion=JOptionPane.showInputDialog("Elija tipo de usuario:"
													+ "\n1. Titular"
													+ "\n2. Conductor");
		
		return opcion;
	}
	
	//Método para solicitar datos de persona (tambien para titular y conductor)
	public String datosUsuarios() {
		String nombre;
		String apellidos;
		String fechaNac;
		
		nombre=JOptionPane.showInputDialog("Ingrese nombre:");
		apellidos=JOptionPane.showInputDialog("Ingrese apellidos:");
		fechaNac=JOptionPane.showInputDialog("Ingrese fecha nacimiento:");
		
		return nombre+"/"+apellidos+"/"+fechaNac;
	}
	
	//Datos extra para el titular
	public String datosTitular() {
		String seguro=JOptionPane.showInputDialog("Tiene seguro?(Si/No)");
		String garaje=JOptionPane.showInputDialog("Tiene garaje?(Si/No)");
		return seguro+"/"+garaje;
	}
	
	//Datos de la licencia
	public String licencia() {
		String id;
		String tipoLicencia;
		String nomComplet;
		String fCaducidad;
		
		id=JOptionPane.showInputDialog("Ingrese el ID:");
		tipoLicencia=JOptionPane.showInputDialog("Tipo de licencia:");
		nomComplet=JOptionPane.showInputDialog("Nombre completo:");
		fCaducidad=JOptionPane.showInputDialog("Fecha caducidad (aaaa/mm/dd):");
		
		return id+"/"+tipoLicencia+"/"+nomComplet+"/"+fCaducidad;
	
	}
}
