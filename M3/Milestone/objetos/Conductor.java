package objetos;

public class Conductor extends Persona {
		
	
	public Conductor() {
		super();
	}
	
	public Conductor(String nombre, String apellidos,String fechaNac,Licencia licencia) {
		super(nombre,apellidos,fechaNac,licencia);
	}
	
	
	@Override
	public String toString() {
		return "CONDUCTOR\n[Nombre: "+this.nombre+
				"\nApellidos: "+this.apellidos+
				"\nFecha Nacimiento: "+this.fechaNacimiento+
				"\n\nLicencia"+
				"\n Id: "+this.licencia.getID()+
				"\n Nombre Completo: "+this.licencia.getNombreCompleto()+
				"\n Tipo: "+this.licencia.getTipoLicencia()+
				"\n Fecha Vencimiento: "+this.licencia.getFechaCaducidad()+"]\n";
	}
	
	
}
