package controlador;

import java.util.ArrayList;



import objetos.Camion;
import objetos.Coche;
import objetos.Conductor;
import objetos.Licencia;
import objetos.Moto;
import objetos.Persona;
import objetos.Ruedas;
import objetos.Titular;
import objetos.Vehiculo;
import vista.VistaGeneral;
import vista.VistaPersonas;
import vista.VistaVehiculos;

public class Controlador {
	protected VistaGeneral vg;
	protected VistaPersonas vp;
	protected VistaVehiculos vv;
	protected Persona persona;
	protected Titular titular;
	protected Conductor conductor;
	protected Vehiculo vehiculo;
	protected Coche coche;
	protected Moto moto;
	protected Camion camion;
	protected Ruedas ruedaTrasera;
	protected Ruedas ruedaDelantera;
	protected Licencia licencia;
	protected ArrayList<Conductor> lstConductor;
	protected ArrayList<Titular> lstTitular;
	protected ArrayList<Ruedas> lstRuedasM;
	protected ArrayList<Ruedas> lstRuedasD;
	protected ArrayList<Ruedas> lstRuedasT;

	public void menuGeneral() {
		String[] opciones = vg.menuGeneral().split("/");

		try {
			int opcion = Integer.parseInt(opciones[0]);
			int cantidad = Integer.parseInt(opciones[1]);

			if (opcion == 1) {
				menuUsuarios(cantidad);
			} else if (opcion == 2) {
				menuVehiculos(cantidad);
			}
		} catch (NullPointerException ne) {
			String mensaje = "No ingreso un valor correcto " + ne;
			vg.mensajes(mensaje);
		}
	}

	public void menuUsuarios(int cantidad) {
		String opcion, nombre, apellidos, fechaNac;
		String[] cadena;
		String isSeguro, isGaraje;
		boolean seguro = false;
		boolean garaje = false;

		for (int i = 0; i < cantidad; i++) {
			opcion = vp.menuPersona();
			cadena = vp.datosUsuarios().split("/");
			nombre = cadena[0];
			apellidos = cadena[1];
			fechaNac = cadena[2];
			licencia = crearLicencia();

			if (opcion.equals("1")) {// Titular
				cadena = vp.datosTitular().split("/");
				isSeguro = cadena[0];
				isGaraje = cadena[1];
				if (isSeguro.equalsIgnoreCase("Si")) {
					seguro = true;
				}
				if (isGaraje.equalsIgnoreCase("Si")) {
					garaje = true;
				}
				// Aqui se crea un titular
				titular = new Titular(nombre, apellidos, fechaNac, licencia, seguro, garaje);
				// Se añade el titular a la lista de objetos titular
				lstTitular.add(titular);

			} else if (opcion.equals("2")) {// Conductor
				conductor = new Conductor(nombre, apellidos, fechaNac, licencia);
				// Se añade el conductor a la lista de conductores
				lstConductor.add(conductor);
			}
		}
	}

	// Método que crea la licencia, retorna el objeto ya que lo usaremos para crear
	// ya se una titular o conductor
	public Licencia crearLicencia() {
		String[] cadena = vp.licencia().split("/");
		String id = cadena[0];
		String tipoLicencia = cadena[1];
		String nomComplet = cadena[2];
		String fechaCad = cadena[3];

		licencia = new Licencia(id, tipoLicencia, nomComplet, fechaCad);

		return licencia;

	}

	public void menuVehiculos(int cantidad) {
		String opcion;
		String[] cadena;
		
		for (int i = 0; i < cantidad; i++) {
			opcion=vv.menuVehiculos();
			
			
			
			if(opcion.equals("1")) {//Coche
				
			}else if(opcion.equals("2")) {//Moto
				
			}else if(opcion.equals("3")) {//Camion
				
			}
			
		}
	}
	
	public void addRuedas(String opcion) {
		String marcaD;
		String marcaT;
		Double diametroD;
		Double diametroT;
		String mensajeEx;
		
		try {
			marcaD=vv.marcaD();
			marcaT=vv.marcaT();
			diametroD=Double.parseDouble(vv.diametroD());
			diametroT=Double.parseDouble(vv.diametroT());
			ruedaDelantera=new Ruedas(marcaD,diametroD);
			ruedaTrasera=new Ruedas(marcaT,diametroT);
			
			if(opcion.equals("1") || opcion.equals("3")) {//Coche o camion
				lstRuedasD=new ArrayList<>();
				lstRuedasT=new ArrayList<>();
				for(int i=0;i<2;i++) {
					lstRuedasD.add(ruedaDelantera);
					lstRuedasT.add(ruedaTrasera);
				}
				
				coche.addRuedas(lstRuedasD,lstRuedasT);
			}else if(opcion.equals("2")) {//Moto
				lstRueda
			}
		}catch(NullPointerException ne) {
			mensajeEx="No se puede dejar el valor en nulo "+ne;
			vg.mensajes(mensajeEx);
		}catch(NumberFormatException fe) {
			mensajeEx="El formato del diametro no es valido "+fe;
			vg.mensajes(mensajeEx);
		}
		
		
	}
}
