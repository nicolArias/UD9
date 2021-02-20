package modelo;

import java.util.ArrayList;
import java.util.Random;

import vista.Vista;

public class Cine {
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
			char letra=65;
			int fila=this.FILA;
			
			//CICLO PARA CREAR SALA
			for(int f=0;f<FILA;f++) {
				for(int c=0;c<this.COL;c++) {
					sala[f][c]=new Asiento((Integer.toString(fila))+letra);
					letra++;
					
				}
				letra=65;
				fila--;	
			}
			
			//imprimir();
		}
		
		/*public void imprimir() {
			for(int i=0;i<FILA;i++) {
				for(int j=0;j<COL;j++) {
					System.out.println(sala[i][j].getId());
				}
			}
		}*/
		
	public void llenarSalaAut() {
			//Variable 'cantEs' es para guardar el número aleatorio de los espectadores que vamos a sentar
			int cantEs=r.nextInt(72)+1;
			int cont=0;
			
			while(cont<cantEs) {
				for(int i=0;i<FILA;i++) {
					for(int j=0;j<COL;j++) {
						if(validaciones()) {
							if(!obtenerIdSilla().equals(sala[i][j])) {
								esp=new Espectador();
								esp.setPuesto(obtenerIdSilla());
								espArray.add(esp);
								sala[i][j].setOcupado(true);
								cont++;
							}else {
								vista.noPuestos();
							}
						}else {
							cont=cont;
							vista.noCumpleRequisitos();
						}
					}	
				}
			}
			
			
						
		}
	
	public boolean validaciones() {
		
		if(esp.getCantDinero()>=precioEntrada && esp.getEdad()>=pelicula.getEdadMinima()) {
			return true;
		}
		return false;
	}
		
	public String obtenerIdSilla() {
			//Random r=new Random();
			int nF=r.nextInt(8);	
			int nC=r.nextInt(9);
			
			String id=sala[nF][nC].getId();
			return id;
		}
		
		
	public void llenarSala(Espectador espectador) {
			
		
			for(int i=0;i<FILA;i++) {
				for(int j=0;j<COL;j++) {
					
					if(validaciones()) {
						if(!obtenerIdSilla().equals(sala[i][j])) {
							esp=new Espectador();
							espArray.add(esp);
							sala[i][j].setOcupado(true);
							
						}else {
							vista.noPuestos();
						}
					}else {
						vista.noCumpleRequisitos();
					}
				}
				
			}
	}
	
	public void imprimirSala() {
		System.out.println("Pelicula: "+getPelicula().getPelicula());
		System.out.println("Precio: "+getPrecioEntrada());
		
		for (int i=0; i<FILA; i++) {
			for (int j = 0; j <COL; j++) {
				if(getSala()[i][j].isOcupado()) {
					System.out.println("Asiento: "+getSala()[i][j].getId()+" Esta ocupado");
				}
			}
		}
	}
		
		
		
}
