package punto2;

public class Serie implements Entregable{
	/*2. Crearemos una clase llamada Serie con las siguientes características:
		-Sus atributos son titulo, numero de temporadas, entregado, genero y creador.
		-Por defecto, el numero de temporadas es de 3 temporadas y entregado false.
		El resto de atributos serán valores por defecto según el tipo del atributo.
		
		Los constructores que se implementaran serán:
		-Un constructor por defecto.
		-Un constructor con el titulo y creador. El resto por defecto.
		-Un constructor con todos los atributos, excepto de entregado.

		Los métodos que se implementara serán:
		• Métodos get de todos los atributos, excepto de entregado.
		• Métodos set de todos los atributos, excepto de entregado.
		• Sobrescribe los métodos toString.
	*/
	
	//CONSTANTES
	protected final int TEMPORADA_CONST=3;
	protected final boolean ENTREGADO_CONST=false;
	
	//ATRIBUTOS
	protected String titulo;
	protected int numeroTemporada;
	protected boolean entregado;
	protected String genero;
	protected String creador;
	
	
	//CONSTRUCTORES
	public Serie() {
		this.titulo="";
		this.numeroTemporada=TEMPORADA_CONST;
		this.entregado=ENTREGADO_CONST;
		this.genero="";
		this.creador="";
	}
	
	public Serie(String titulo,String creador) {
		this.titulo=titulo;
		this.numeroTemporada=TEMPORADA_CONST;
		this.entregado=ENTREGADO_CONST;
		this.genero="";
		this.creador=creador;
	}

	public Serie(String titulo,int numeroTemporada,String genero,String creador) {
		this.titulo=titulo;
		this.numeroTemporada=numeroTemporada;
		this.entregado=false;
		this.genero=genero;
		this.creador=creador;
	}

	//Metodos get y set
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getNumeroTemporada() {
		return numeroTemporada;
	}

	public void setNumeroTemporada(int numeroTemporada) {
		this.numeroTemporada = numeroTemporada;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getCreador() {
		return creador;
	}

	public void setCreador(String creador) {
		this.creador = creador;
	}
	
	public String toString() {
		return "\nINFORMACIÓN SERIE \n"
				+"\nTitulo: "+titulo
				+"\nNúmero Temporada: "+numeroTemporada
				+"\nEntregado: "+entregado
				+"\nGenero: "+genero
				+"\nCreador: "+creador;
		
	}
	
	
	public void entregar() {
		entregado=true;
	}
	
	public void devolver() {
		entregado=false;
	}
	public boolean isEntregado() {
		if(entregado) {
			return true;
		}
		return false;
	}
	
	//compara el numero de temporadas
	public int compareTo(Object a){
		int resp=0;
		if(a instanceof Serie) {
			Serie s=(Serie) a;
			if(numeroTemporada>s.getNumeroTemporada()) {
				resp=1;
			}else if(numeroTemporada<s.getNumeroTemporada()) {
				resp=2;
			}else {
				resp=0;
			}
		
		}
		return resp;
	}
	
}
