package objetos;

public class Licencia {
	
	String tLicencia[]= {"A1","A2","A","B","C1","C2"};
	
	protected String ID;
	protected String tipoLicencia;
	protected String nombreCompleto;
	protected String fechaCaducidad;
	
	public Licencia() {
		
	}
	
	public Licencia(String ID,String tipoLicencia, String nomCompleto,String fechaCaducidad) {
		this.ID=ID;
		this.tipoLicencia=tipoLicencia;
		this.nombreCompleto=nomCompleto;
		this.fechaCaducidad=fechaCaducidad;
	}
	
	public boolean comprobarTipo() {
		boolean resp=false;
		for(int i=0;i<tLicencia.length;i++) {
			if(this.tipoLicencia.equalsIgnoreCase(tipoLicencia)) {
				return resp=true;
			}
		}
		
		return resp;
	}
}
