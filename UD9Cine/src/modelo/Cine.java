package modelo;

import java.util.ArrayList;
import java.util.Random;

import vista.Vista;

public class Cine {
	
		//Constantes
		private final int FILA=8;
		private final int COL=9;
	
		//ATRIBUTOS
		private Pelicula pelicula=new Pelicula();
		private double precioEntrada;
		
		private Asiento sala[][]=new Asiento[FILA][COL];
		private ArrayList<Espectador> espArray=new ArrayList<Espectador>();
		
		
		private Espectador esp=new Espectador();
		private Random r=new Random();
		private Vista vista=new Vista();
		
		
		//CONSTRUCTOR
		public Cine(double precio) {
			this.pelicula=new Pelicula();
			this.precioEntrada=precio;
			crearSala();
		}
		
		
		//Metodo get y set
		public Pelicula getPelicula() {
			return pelicula;
		}



		public void setPelicula(Pelicula pelicula) {
			this.pelicula = pelicula;
		}



		public double getPrecioEntrada() {
			return precioEntrada;
		}



		public void setPrecioEntrada(double precioEntrada) {
			this.precioEntrada = precioEntrada;
		}



		public Asiento[][] getSala() {
			return sala;
		}



		public void setSala(Asiento[][] sala) {
			this.sala = sala;
		}



	public void crearSala() {
		//en esta variable se almacena el 65 ya que en codigo ASCII es por donde empieza el alfabeto en mayuscula
		char letra=65;
		int fila=this.FILA;
			
		//CICLO PARA CREAR SALA
		for(int f=0;f<FILA;f++) {
			for(int c=0;c<this.COL;c++) {
				//En esta posicion vamos almacenar un objeto Asiento donde se envia comp parametro el id que este caso
				//seria el numero y la letra
				sala[f][c]=new Asiento((Integer.toString(fila))+letra);
				letra++;
					
			}
			
			letra=65;
			fila--;	
		}
			
	}
		
		
	public boolean validaciones() {
		//Valida la cantidad de dinero que lleva el espectador vs el precio de la entrada y la edad minima requerida con la
		//del espectador
		if(esp.getCantDinero()>=precioEntrada && esp.getEdad()>=pelicula.getEdadMinima()) {
			
			return true;
		}
		return false;
	}
			
	
	//Metodo que nos retorna una cadena con el id que es codigo de un asiento
	public String obtenerIdSilla() {
		
		int nF=r.nextInt(8);	
		int nC=r.nextInt(9);
				
		String id=sala[nF][nC].getId();
		
		return id;
	}
		
	
	public void llenarSalaAut() {
			//Variable 'cantEs' es para guardar el número aleatorio de los espectadores que vamos a sentar
			int cantEs=r.nextInt(72)+1;
			
			int cont=0;
			String idSilla;
			int contSentados=0;
			while(cont<=cantEs) {
				for(int i=0;i<FILA;i++) {
					for(int j=0;j<COL;j++) {
				
							idSilla=obtenerIdSilla();
							if(idSilla.equals(sala[i][j].getId())) {
								esp=new Espectador();
								
								if(validaciones()) {
									//Si se cumple la condicion le asigna al espectador un id de asiento y cambia el estado de asiento
									//de 'libre' a 'ocupado'
									esp.setPuesto(idSilla);
									espArray.add(esp);
									sala[i][j].setOcupado(true);
									contSentados++;
									
								}
								
							}
					}	
				}
				cont++;
			}
			
			
	}
	
		
	public void llenarSala(Espectador espectador) {
			
			int respuesta=0;
			String idSilla=obtenerIdSilla();

			for(int i=0;i<FILA;i++) {
				for(int j=0;j<COL;j++) {
					
					if(validaciones()) {
						if(idSilla.equals(sala[i][j].getId()) && (sala[i][j].isOcupado()!=true)) {
							esp=new Espectador();
							espArray.add(esp);
							sala[i][j].setOcupado(true);
							
						}
					}else {
						vista.noCumpleRequisitos();
						break;
					}
				}
				
			}

	}
	
	
	//Este metodo imprimi la sala e indica si determinado puesto esta ocupado o  no
	public String imprimirSala() {
		String mensajeSala="";
		
		
		for (int i=0; i<FILA; i++) {
			for (int j = 0; j <COL; j++) {
				
				if(getSala()[i][j].isOcupado()) {
					mensajeSala+="\nAsiento: "+getSala()[i][j].getId()+" -> Esta ocupado";
					//System.out.println("Asiento: "+getSala()[i][j].getId()+" Esta ocupado");
				}else {
					mensajeSala+="\nAsiento: "+getSala()[i][j].getId()+" -> Esta Libre";
					//System.out.println("Asiento: "+getSala()[i][j].getId()+" Esta libre");
				}
				
				
			}
		}
		
		return "Pelicula: "+getPelicula().getPelicula()+"  Precio: "+getPrecioEntrada()+
				"\n"+mensajeSala;
		
	}
	
	
	//Metodo que me devuelve un String para llamarlo desde la clase vista y poder mostrar los datos del espectador
	public String imprimirListaEsp() {
		
		String cadenaEsp="";
		for(int i=0;i<espArray.size();i++) {
			cadenaEsp+="\nNombre:  "+espArray.get(i).getNombre()+"  | Asiento:  "+espArray.get(i).getPuesto();
		}
		
		return cadenaEsp;
		
		
	}
		
		
		
}
