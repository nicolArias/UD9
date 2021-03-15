package vista;

import javax.swing.JOptionPane;

public class VistaPersonas {

	
	public String menuPersona() {
		
		String opcion=JOptionPane.showInputDialog("Elija tipo de usuario:"
													+ "\n1. Titular"
													+ "\n2. Conductor");
		
		return opcion;
	}
	
	//Metodo para preguntar al usuario si desea agregar otro usuario
	public String addUsuario() {
		String addUsuario=JOptionPane.showInputDialog("Elija opcion:"
														+ "\nAñadir usuario (1)"
														+ "\n Atrás (2)");
		
		return addUsuario;
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
		
		id=JOptionPane.showInputDialog("Datos Licencia\n Ingrese el ID:");
		tipoLicencia=JOptionPane.showInputDialog("Datos Licencia\n Tipo de licencia:");
		nomComplet=JOptionPane.showInputDialog("Datos Licencia\n Nombre completo:");
		fCaducidad=JOptionPane.showInputDialog("Datos Licencia\n Fecha caducidad (aaaa/mm/dd):");
		
		return id+"/"+tipoLicencia+"/"+nomComplet+"/"+fCaducidad;
	
	}
}
