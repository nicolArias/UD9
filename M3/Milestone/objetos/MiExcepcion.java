package objetos;

public class MiExcepcion extends Exception{
	private int codigoExcepcion;

	public MiExcepcion(int codigo) {
		super();
		this.codigoExcepcion=codigo;
	}

	public String getMessage() {
		String mensaje="";
		if(codigoExcepcion==27) {
			mensaje="Mensaje mostrado por pantalla"+
					"\nExcepcion capturada con mensaje: Esto es un objeto Exception"+
					"\nPrograma terminado";
		}else {
			mensaje="El codigo no coincide";
		}
		
		return mensaje;
	}
}
