package modelo;

public class Asiento {
	
	
	//ATRIBUTOS
	private String id;
	
	private boolean ocupado;
	//protected Asiento asientos[][]=new Asiento[8][9];
	
	//CONSTRUCTOR
	public Asiento(String identificador) {
		this.id=identificador;
		this.ocupado=false;
	}

	//MÉTODOS GET Y SET
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public boolean isOcupado() {
		return ocupado;
	}

	public void setOcupado(boolean ocupado) {
		this.ocupado = ocupado;
	}
	
	
}
