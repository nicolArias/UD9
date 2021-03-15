package controlador;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

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
	protected VistaGeneral vg=new VistaGeneral();
	protected VistaPersonas vp=new VistaPersonas();
	protected VistaVehiculos vv=new VistaVehiculos();
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
	protected List<Conductor> lstConductor=new ArrayList<>();
	//protected List<Persona> lstPersona=new ArrayList<>();
	protected List<Titular> lstTitular=new ArrayList<>();
	protected List<Ruedas> lstRuedasM=new ArrayList<Ruedas>();
	protected List<Ruedas> lstRuedasD=new ArrayList<Ruedas>();
	protected List<Ruedas> lstRuedasT=new ArrayList<Ruedas>();
	
	
	public Object menuGeneral() {
		/*
		 * Preguntara al usuario la opcion que desee, si quiere crear un vehiculo o un
		 * usuario
		 */
		Object objeto=new Object();
		
			int opcion = Integer.parseInt(vg.menuGeneral());

			if (opcion == 1) {// Opcion para crear usuario
				objeto=menuUsuarios();
			} else if (opcion == 2) {// Opcion para crear vehiculo
				objeto=menuVehiculos();
			}else if(opcion==3){//Salir de la aplicacion
				objeto=null;
			}
			
		
		return objeto;
	}

	// Menú del usuario, donde tendra la opcion de esc
	public Object menuUsuarios() {
	
		
		String opcion = vp.menuPersona();
		Object objeto=new Object();

		if (opcion.equals("1")) {// Titular
			objeto=crearTitular();

		} else if (opcion.equals("2")) {// Conductor
			objeto=crearConductor();
		}
		

		// Preguntar si desea crear otro usuario o ir al menú de atras
		/*String addUsuario = vp.addUsuario();

		if (addUsuario.equals("1")) {
			menuUsuarios();
		} else if (addUsuario.equals("2")) {
			vg.menuGeneral();
		}*/

		return objeto;
	}
	
	public Titular crearTitular() {
		String opcion, nombre, apellidos, fechaNac;
		String[] cadena;
		String isSeguro, isGaraje;
		boolean seguro = false;
		boolean garaje = false;
		Object objeto;
		
	
		cadena = vp.datosUsuarios().split("/");
		nombre = cadena[0];
		apellidos = cadena[1];
		fechaNac = cadena[2];
		licencia=new Licencia();
		licencia = crearLicencia();
		
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
		lstTitular=new ArrayList<>();
		lstTitular.add(titular);

		String addVehiculo = JOptionPane.showInputDialog("Desea crear un vehiculo para el titular: (SI/NO)");
		if (addVehiculo.equalsIgnoreCase("SI")) {

			// En el objeto se guardara lo que nos retorne el menu de vehiculos
			objeto = menuVehiculos();
			String esConductor = JOptionPane.showInputDialog("Este titular será conductor?");

			// Validacion de que el usuario sera conductor, entonces se tendra en cuenta la
			// licencia
			if (esConductor.equalsIgnoreCase("Si")) {
				if (objeto instanceof Coche) {
					// Validar el tipo de licencia
					if (licencia.getTipoLicencia().equals("B")) {
						((Coche) objeto).setTitular(titular);
						conductor=new Conductor(nombre,apellidos,fechaNac,titular.getLicencia());
						lstConductor.add(conductor);
					} else {
						vg.mensajes("El tipo de licencia del titular no sirve.");
					}

				} else if (objeto instanceof Camion) {
					if (licencia.getTipoLicencia().equals("C")) {
						((Camion) objeto).setTitular(titular);
						conductor=new Conductor(nombre,apellidos,fechaNac,titular.getLicencia());
						lstConductor.add(conductor);
					} else {
						vg.mensajes("El tipo de licencia del titular no sirve.");
					}

				} else if (objeto instanceof Moto) {
					if (licencia.getTipoLicencia().equals("A")) {
						((Moto) objeto).setTitular(titular);
						conductor=new Conductor(nombre,apellidos,fechaNac,titular.getLicencia());
						lstConductor.add(conductor);
					} else {
						vg.mensajes("El tipo de licencia del titular no sirve.");
					}
				}
			}else {
				/*JOptionPane.showMessageDialog(null,"Debe crear un conductor");
				String nombreC=JOptionPane.showInputDialog("Nombre conductor:");
				String apellidosC=JOptionPane.showInputDialog("Apellidos conductor:");
				String fechaNacC=JOptionPane.showInputDialog("Fecha Nacimiento Conductor:");*/
				
				conductor = crearConductor();
				if (objeto instanceof Coche) {
					// Validar el tipo de licencia
					if (conductor.getLicencia().getTipoLicencia().equals("B")) {
						((Coche) objeto).setTitular(titular);
	
						lstConductor.add(conductor);
					} else {
						vg.mensajes("El tipo de licencia del titular no sirve.");
					}

				} else if (objeto instanceof Camion) {
					if (conductor.getLicencia().getTipoLicencia().equals("C")) {
						((Camion) objeto).setTitular(titular);
						
						lstConductor.add(conductor);
					} else {
						vg.mensajes("El tipo de licencia del titular no sirve.");
					}

				} else if (objeto instanceof Moto) {
					if (conductor.getLicencia().getTipoLicencia().equals("A")) {
						((Moto) objeto).setTitular(titular);
						lstConductor.add(conductor);
					} else {
						vg.mensajes("El tipo de licencia del titular no sirve.");
					}
				}
			
			}
		}
		
		return titular;
	}
	
	public Conductor crearConductor() {
		String  nombre, apellidos, fechaNac;
		String[] cadena;

		cadena = vp.datosUsuarios().split("/");
		nombre = cadena[0];
		apellidos = cadena[1];
		fechaNac = cadena[2];
		licencia = crearLicencia();
		
		conductor = new Conductor(nombre, apellidos, fechaNac, crearLicencia());
		// Se añade el conductor a la lista de conductores
		lstConductor.add(conductor);
		
		return conductor;
	}
	
	

	// Método que crea la licencia, retorna el objeto ya que lo usaremos para crear
	// ya se una titular o conductor
	public Licencia crearLicencia() {
		String[] cadena = vp.licencia().split("/");
		String id = cadena[0];
		String tipoLicencia = cadena[1];
		String nomComplet = cadena[2];
		String fechaCad = cadena[3];

		/*
		 * if(op.equals("coche") && cadena[1].equals("B")) { tipoLicencia=cadena[1];
		 * }else if(op.equals("camion") && cadena[1].equals("C")) {
		 * tipoLicencia=cadena[1]; }else if(op.equals("moto") && cadena[1].equals("A"))
		 * { tipoLicencia=cadena[1]; }
		 */
		licencia = new Licencia(id, tipoLicencia, nomComplet, fechaCad);

		return licencia;

	}

	public Object menuVehiculos() {
		String opcion;
		Object objeto = new Object();

		opcion = vv.menuVehiculos();

		if (opcion.equals("1")) {// Coche
			objeto = crearCoche();
		} else if (opcion.equals("2")) {// Moto
			objeto = crearMoto();
		} else if (opcion.equals("3")) {// Camion
			objeto = crearCamion();
		}

		return objeto;
	}
	//La matricula debe tener 4 y 2 o 3 letras
		public boolean comprobarPlaca(String placa) {
			char[] cadenaMatricula=placa.toCharArray();
			
			String num="";
			String letra="";
			int cont=0;
			boolean respuesta=false;
			
			for(int i=0;i<cadenaMatricula.length;i++) {
				if(Character.isDigit(cadenaMatricula[i])) {
					num+=cadenaMatricula[i];
					cont++;
				}else {
					letra+=cadenaMatricula[i];
				}
			}
			
			if(num.length()==4 && letra.length()==3 || letra.length()==2) {
				respuesta=true;
			}else {
				respuesta=false;
			}
			
			return respuesta;
		}
	public Coche crearCoche() {
		String placa = vv.placa();
		String color = vv.color();
		String marca = vv.marca();
		
		boolean resp=comprobarPlaca(placa);
		
		if(resp==true) {
			// Creamos un objeto coche
			Coche coche = new Coche(placa, color, marca);
			
			/*
			 * Llamamos al método que nos agregar las ruedas del vehiculo y le pasamos el
			 * parametro 1 que indica que es un coche
			 */
			addRuedas("1",coche);
		}
		

		return coche;
	}

	public Moto crearMoto() {
		String placa = vv.placa();
		String color = vv.color();
		String marca = vv.marca();


		// Instanciamos la clase de coche
		Moto moto = new Moto(placa, color, marca);
		
		/*
		 * Llamamos al método que nos agregar las ruedas del vehiculo y le pasamos el
		 * parametro 2 que indica que es una moto
		 */
		addRuedas("2",moto);

		return moto;
	}

	public Camion crearCamion() {
		String placa = vv.placa();
		String color = vv.color();
		String marca = vv.marca();

		// Instanciamos la clase de coche
		Camion camion = new Camion(placa, color, marca);
		
		/*
		 * Llamamos al método que nos agregar las ruedas del vehiculo y le pasamos el
		 * parametro 1 que indica que es un camion
		 */
		addRuedas("1",camion);

		return camion;
	}

	public void addRuedas(String opcion,Object ob) {
		String marcaD;
		String marcaT;
		Double diametroD;
		Double diametroT;
		String mensajeEx;
		ruedaDelantera=new Ruedas();
		ruedaTrasera=new Ruedas();
		//coche=new Coche();
		//moto=new Moto();
		
		try {
			marcaD = vv.marcaD();
			marcaT = vv.marcaT();
			diametroD = Double.parseDouble(vv.diametroD());
			diametroT = Double.parseDouble(vv.diametroT());
			
			boolean resp=comprobarDiametro(diametroD,diametroT);
			
			if(resp=true) {
				ruedaDelantera = new Ruedas(marcaD, diametroD);
				ruedaTrasera = new Ruedas(marcaT, diametroT);
				
				if (opcion.equals("1") || opcion.equals("3")) {// Coche o camion
				
					for (int i = 0; i < 2; i++) {
						lstRuedasD.add(ruedaDelantera);
						lstRuedasT.add(ruedaTrasera);
					
					}
					if (ob instanceof Coche) {
						((Coche) ob).addRuedas(lstRuedasD, lstRuedasT);
					}else if(ob instanceof Camion) {
						((Camion) ob).addRuedas(lstRuedasD, lstRuedasT);
					}
					
		
					
				} else if (opcion.equals("2")) {// Moto
					lstRuedasD.add(ruedaDelantera);
					lstRuedasT.add(ruedaTrasera);
					System.out.println("entro");
					((Moto) ob).addRuedas(lstRuedasD, lstRuedasT);
				}
			}
			
		} catch (NullPointerException ne) {
			mensajeEx = "No se puede dejar el valor en nulo " +ne;
			vg.mensajes(mensajeEx);
		} catch (NumberFormatException fe) {
			mensajeEx = "El formato del diametro no es valido " + fe;
			vg.mensajes(mensajeEx);
		}

	}
	
	//El diametro de las ruedas deben ser superio a 0.4 e inferior a 4
		public boolean comprobarDiametro(double diametroD,double diametroT) {
			boolean respuesta=false;
			
			if((diametroD>0.4 && diametroD<4) && (diametroT>0.4 && diametroT<4)) {
				respuesta=true;
				
			}
			return respuesta;
		}

	/**
	 * @return the lstConductor
	 */
	public List<Conductor> getLstConductor() {
		return lstConductor;
	}

	/**
	 * @return the lstTitular
	 */
	public List<Titular> getLstTitular() {
		return lstTitular;
	}



	
}
