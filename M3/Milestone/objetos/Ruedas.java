package objetos;

public class Ruedas {
	
	private String marca;
	private double diametro;

	public Ruedas() {}
	public Ruedas(String marca, double diametro) {
		this.marca = marca;
		this.diametro = diametro;
	}
	@Override
	public String toString() {
		return "\nMarca: "+marca+"\nDiametro: "+diametro;
	}
	
}
