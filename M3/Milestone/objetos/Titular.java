package objetos;

public class Titular extends Persona {

	protected boolean aseguradora;
	protected boolean garaje;

	public Titular(String nombre, String apellidos,String fechaNac,Licencia licencia,
					boolean aseguradora,boolean garaje) {
		super(nombre,apellidos,fechaNac,licencia);
		
		this.aseguradora=aseguradora;
		this.garaje=garaje;
	}
	
	
}
