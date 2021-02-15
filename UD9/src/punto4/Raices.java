package punto4;

public class Raices {
	
	
	//ATRIBUTOS
	protected double a;
	protected double b;
	protected double c;
	
	
	//CONSTRUCTOR
	public Raices(double a,double b,double c) {
		this.a=a;
		this.b=b;
		this.c=c;
	}
	
	//Imprime las 2 posibles soluciones
	public void obtenerRaices() {
		double solucion1=(b)-(Math.sqrt(getDiscriminante()));
		double solucion2=(b)+(Math.sqrt(getDiscriminante()));
		
		System.out.println("La ecuación tiene 2 posibles soluciones:\n"
				+"Solución 1: "+solucion1+"\n"
				+"Solución 2: "+solucion2);
		
	}
	
	//Imprime única raíz, que será cuando solo tenga una solución posible.
	public void obtenerRaiz() {
		double solucion=b/(2*a);
		
		System.out.println("La ecuación solo tiene una solución:\n"
				+ "Solución: "+solucion);
	}
	
	//devuelve el valor del discriminante (double), el discriminante tiene la siguiente formula, (b^2)-4*a*c
	public  double getDiscriminante() {
		double discriminante=Math.pow(b, 2)-(4*a*c);
		return discriminante;
	}
	
	//Devuelve un booleano indicando si tiene dos soluciones, para que esto ocurra, el discriminante debe ser mayor o igual que 0.
	public boolean tieneRaices() {
		
		if(getDiscriminante()>0) {
			return true;
		}
		
		return false;
	}
	
	//Devuelve un booleano indicando si tiene una única solución, para que esto ocurra, el discriminante debe ser igual que 0.
	public boolean tieneRaiz() {
		
		if(getDiscriminante()==0) {
			return true;
		}
		return false;
	}
	
	// Mostrara por consola las posibles soluciones que tiene nuestra ecuación, en caso de no existir solución, mostrarlo también.
	public  void calcular() {
		
		if(tieneRaices()) {
			obtenerRaices();
		}else if(tieneRaiz()) {
			obtenerRaiz();
		}else {
			System.out.println("La ecuación no tiene solución");
		}
	}
}
