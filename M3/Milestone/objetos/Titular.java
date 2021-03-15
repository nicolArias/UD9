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

	public Titular() {
		super();
	}
	
	@Override
	public String toString() {
		return "TITULAR\n[Nombre: "+this.nombre+
				"\nApellidos: "+this.apellidos+
				"\nFecha Nacimiento: "+this.fechaNacimiento+
				"\nAseguradora: "+this.aseguradora+
				"\nGaraje: "+this.garaje+
				"\n\nLicencia"+
				"\n Id: "+this.licencia.getID()+
				"\n Nombre Completo: "+this.licencia.getNombreCompleto()+
				"\n Tipo: "+this.licencia.getTipoLicencia()+
				"\n Fecha Vencimiento: "+this.licencia.getFechaCaducidad()+"]\n";
	}
	
	
	
}
