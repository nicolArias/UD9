package punto3;

public class mainApp {

	public static void main(String[] args) {
		Libro libro1=new Libro("91021-01910-0129-1","Harry Potter","J.K. ROWLING",300);
		Libro libro2=new Libro();
		
		
		//Asignar valores al objeto libro2 por medio del método set.
		libro2.setISBN("9123-3232-1-212-1");
		libro2.setTitulo("El perfume");
		libro2.setAutor("Patrick Suskind");
		libro2.setNumPaginas(255);
		
		//MOSTRAR LOS VALORES EN CONSOLA
		System.out.println(libro1.toString());
		System.out.println(libro2.toString());
		
		//LIBRO DE MAS PAGINAS
		if(libro2.getNumPaginas()>libro1.getNumPaginas()) {
			System.out.println("El libro con más páginas es: "+libro2.getTitulo());
		}else {
			System.out.println("El libro con más páginas es: "+libro1.getTitulo());
		}
		

	}

}
