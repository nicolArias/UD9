package punto2;

public class Videojuego implements Entregable{
	/*Crearemos una clase Videojuego con las siguientes caracter�sticas:
		� Sus atributos son titulo, horas estimadas, entregado, genero y compa�ia.
		� Por defecto, las horas estimadas ser�n de 10 horas y entregado false. El resto de atributos ser�n valores por defecto seg�n el tipo del atributo.

		Los constructores que se implementaran ser�n:
		-Un constructor por defecto.
		-Un constructor con el titulo y horas estimadas. El resto por defecto.
		-Un constructor con todos los atributos, excepto de entregado.
		
		Los m�todos que se implementara ser�n:
		� M�todos get de todos los atributos, excepto de entregado.
		� M�todos set de todos los atributos, excepto de entregado.
		� Sobrescribe los m�todos toString.
	 */
	
	protected String tituloVideo;
	protected int horasEstimadas;
	protected boolean entregado;
	protected String genero;
	protected String compa�ia;
	
	public Videojuego() {
		this.tituloVideo="";
		this.horasEstimadas=10;
		this.entregado=false;
		this.genero="";
		this.compa�ia="";
		
	}
	
	public Videojuego(String tituloVideo,int horasEstimadas) {
		
		this.tituloVideo=tituloVideo;
		this.horasEstimadas=horasEstimadas;
		this.entregado=false;
		this.genero="";
		this.compa�ia="";
	}
	
	public Videojuego(String tituloVideo,int horasEstimadas,String genero,String compa�ia) {
		this.tituloVideo=tituloVideo;
		this.horasEstimadas=horasEstimadas;
		this.genero=genero;
		this.compa�ia=compa�ia;
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

	public String getCompa�ia() {
		return compa�ia;
	}

	public void setCompa�ia(String compa�ia) {
		this.compa�ia = compa�ia;
	}

	
	public String toString() {
		return "\nINFORMACI�N VIDEOJUEGO \n"
				+"\nTitulo Video: "+tituloVideo
				+"\nHoras estimadas: "+horasEstimadas
				+"\nEntregado: "+entregado
				+"\nGenero: "+genero
				+"\nCompa��a: "+compa�ia;
		
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
