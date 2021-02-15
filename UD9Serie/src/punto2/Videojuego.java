package punto2;

public class Videojuego implements Entregable{
	/*Crearemos una clase Videojuego con las siguientes características:
		• Sus atributos son titulo, horas estimadas, entregado, genero y compañia.
		• Por defecto, las horas estimadas serán de 10 horas y entregado false. El resto de atributos serán valores por defecto según el tipo del atributo.

		Los constructores que se implementaran serán:
		-Un constructor por defecto.
		-Un constructor con el titulo y horas estimadas. El resto por defecto.
		-Un constructor con todos los atributos, excepto de entregado.
		
		Los métodos que se implementara serán:
		• Métodos get de todos los atributos, excepto de entregado.
		• Métodos set de todos los atributos, excepto de entregado.
		• Sobrescribe los métodos toString.
	 */
	
	protected String tituloVideo;
	protected int horasEstimadas;
	protected boolean entregado;
	protected String genero;
	protected String compañia;
	
	public Videojuego() {
		this.tituloVideo="";
		this.horasEstimadas=10;
		this.entregado=false;
		this.genero="";
		this.compañia="";
		
	}
	
	public Videojuego(String tituloVideo,int horasEstimadas) {
		
		this.tituloVideo=tituloVideo;
		this.horasEstimadas=horasEstimadas;
		this.entregado=false;
		this.genero="";
		this.compañia="";
	}
	
	public Videojuego(String tituloVideo,int horasEstimadas,String genero,String compañia) {
		this.tituloVideo=tituloVideo;
		this.horasEstimadas=horasEstimadas;
		this.genero=genero;
		this.compañia=compañia;
	}
	
	
	
	//METODOS GET Y SET
	public String getTituloVideo() {
		return tituloVideo;
	}

	public void setTituloVideo(String tituloVideo) {
		this.tituloVideo = tituloVideo;
	}

	public int getHorasEstimadas() {
		return horasEstimadas;
	}

	public void setHorasEstimadas(int horasEstimadas) {
		this.horasEstimadas = horasEstimadas;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getCompañia() {
		return compañia;
	}

	public void setCompañia(String compañia) {
		this.compañia = compañia;
	}

	
	public String toString() {
		return "\nINFORMACIÓN VIDEOJUEGO \n"
				+"\nTitulo Video: "+tituloVideo
				+"\nHoras estimadas: "+horasEstimadas
				+"\nEntregado: "+entregado
				+"\nGenero: "+genero
				+"\nCompañía: "+compañia;
		
	}
	

	
	public void entregar() {
		entregado=true;
	}
	
	public void devolver() {
		entregado=false;
	}
	public boolean isEntregado() {
		if(entregado) {
			return false;
		}
		return true;
	}
	
	
	public int compareTo(Object a){
		
		int resp=0;
		//Casting objetos
		if(a instanceof Videojuego) {
			//Parsear el objeto que llego al metodo
			Videojuego vj=(Videojuego) a;
			//Condiciones para determinar si un objeto es mayor a otro en relacion a la cantidad de horas
			if(horasEstimadas>vj.getHorasEstimadas()) {
				resp=1;
			}else if(horasEstimadas<vj.getHorasEstimadas()) {
				resp=2;
			}else {
				resp=0;
			}
		
		}
		return resp;
	}
	
}
