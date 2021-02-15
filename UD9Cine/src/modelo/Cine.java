package modelo;

import java.util.ArrayList;
import java.util.Random;

public class Cine {
		private final int FILA=8;
		private final int COL=9;
	
		//ATRIBUTOS
		private Pelicula pelicula;
		private double precioEntrada;
		
		private Asiento sala[][]=new Asiento[FILA][COL];
		private ArrayList<Espectador> espArray=new ArrayList<Espectador>();
		private Espectador esp;
		
		
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
			
			int cont=0;
			while(cont<72) {
				for(int i=0;i<FILA;i++) {
					for(int j=0;j<COL;j++) {
						if(!obtenerIdSilla().equals(sala[i][j])) {
							esp=new Espectador();
							espArray.add(esp);
							sala[i][j].setOcupado(true);
						}
						
					}
					cont++;
					System.out.println(espArray.get(i).getNombre());
					
				}
			}
			
			
						
		}
		
	public String obtenerIdSilla() {
			Random r=new Random();
			int nF=r.nextInt(8);	
			int nC=r.nextInt(9);
			
			String id=sala[nF][nC].getId();
			return id;
		}
		
		
	public void llenarSala(Espectador espectador) {
			
			
			
		}
		
		
		
}
