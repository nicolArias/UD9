
package punto2;

import javax.swing.JOptionPane;

public class EjecutableApp {

	public static void main(String[] args) {
		/*• Crea dos arrays, uno de Series y otro de Videojuegos, de 5 posiciones cada
			uno.
		• Crea un objeto en cada posición del array, con los valores que desees, puedes
			usar distintos constructores.
		• Entrega algunos Videojuegos y Series con el método entregar().
		• Cuenta cuantos Series y Videojuegos hay entregados. Al contarlos,
			devuélvelos.
		• Por último, indica el Videojuego tiene más horas estimadas y la serie con mas
			temporadas. Muestralos en pantalla con toda su información (usa el método
			toString()).
		 */

		Serie[] serieArray=new Serie[3];
		Videojuego[] videojuegoArray=new Videojuego[3];
		Serie serie=new Serie();
		Videojuego videojuego=new Videojuego();
		
		//CREAR SERIE
		for(int i=0;i<serieArray.length;i++) {
			serieArray[i]=crearSerie();
			System.out.println(serieArray[i]);
		}
		
		//CREAR VIDEOJUEGO
		for(int j=0;j<videojuegoArray.length;j++) {
			videojuegoArray[j]=crearVideojuego();
			System.out.println(videojuegoArray[j]);
		}
		
		
		//PREGUNTAR SI QUIERE ENTREGAR LA SERIE
		int contadors=0;
		for(int x=0;x<serieArray.length;x++) {
			String pregunta=JOptionPane.showInputDialog("Desea entregar la serie(Si/No) "+serieArray[x].getTitulo()+"?");
			if(pregunta.equalsIgnoreCase("Si")) {
				serieArray[x].entregar();
				contadors+=1;
			}else {
				serieArray[x].devolver();
			}
			
			serie.compareTo(serieArray[x]);
		}
		
		//PREGUNTAR SI QUIERE ENTREGAR EL VIDEOJUEGO
		int contadorv=0;
		for(int v=0;v<videojuegoArray.length;v++) {
			String pregunta=JOptionPane.showInputDialog("Desea entregar el videojuego(Si/No)"+videojuegoArray[v].getTituloVideo()+"?");
			if(pregunta.equalsIgnoreCase("Si")) {
				videojuegoArray[v].entregar();
				contadorv+=1;
			}else {
				videojuegoArray[v].devolver();
			}
			
			
		}
		
		
		System.out.println("\nLa cantidad de series devueltas son: "+contadors
				+"\nLa cantidad de videojuegos devueltos es: "+contadorv);
		
		JOptionPane.showMessageDialog(null,tempSeries(serie,serieArray)+"\n"+horasVideo(videojuego,videojuegoArray));
		

	}
	
	
	public static Serie crearSerie() {
		
		Serie serie=new Serie();
		String titulo=JOptionPane.showInputDialog("Titulo de la serie: ");
		String numeroTemporada_txt=JOptionPane.showInputDialog("Cantidad temporadas: ");
		String genero=JOptionPane.showInputDialog("Genero de la serie: ");
		String creador=JOptionPane.showInputDialog("Creador: ");
		
		
	
			if(!titulo.equals("") && !numeroTemporada_txt.equals("") && !genero.equals("") && !creador.equals("")) {
				int numeroTemporada=Integer.parseInt(numeroTemporada_txt);
				serie=new Serie(titulo,numeroTemporada,genero,creador);
			}else if(!titulo.equals("") && !creador.equals("")) {
				serie=new Serie(titulo,creador);
			}
		
		
		return serie;
		
	}

	public static Videojuego crearVideojuego() {
		
		Videojuego videojuego=new Videojuego();
		
		String titulo=JOptionPane.showInputDialog("Titulo videojuego: ");
		String horasEstimadas_txt=JOptionPane.showInputDialog("Cantidad horas estimadas: ");
		String genero=JOptionPane.showInputDialog("Genero del videojuego: ");
		String compañia=JOptionPane.showInputDialog("Compañia: ");
	
		
		
			if(!titulo.equals("") && !horasEstimadas_txt.equals("") && !genero.equals("") && !compañia.equals("")) {
				int horasEstimadas=Integer.parseInt(horasEstimadas_txt);
				videojuego=new Videojuego(titulo,horasEstimadas,genero,compañia);
			}else if(!titulo.equals("") && !horasEstimadas_txt.equals("")) {
				int horasEstimadas=Integer.parseInt(horasEstimadas_txt);
				videojuego=new Videojuego(titulo,horasEstimadas);
			}

		
		return videojuego;
	}
	
	public static String tempSeries(Serie s,Serie[] serieArray) {
		String mensaje="Todas las series tienen la misma cantidad\n";
		
		//En el objeto de serie que instanciamos en la variable 's' se almacena el objeto de la primera posicion del arreglo
		s=serieArray[0];
		
		for(int i=0;i<serieArray.length;i++) {
			//Esta condicion evalua si el objeto que esta en la posicion indicada es mayor que lo indique
			if(serieArray[i].compareTo(s)==1) {
				s=serieArray[i];
				mensaje="SERIE CON MAS TEMPORADAS: "+serieArray[i].toString();
			}
		}
		
		return mensaje;
	}
	
	public static String horasVideo(Videojuego v,Videojuego[] videoj) {
		String mensaje="Todos los videojuegos tienen las mismas horas\n";
		
		v=videoj[0];
		for(int j=0;j<videoj.length;j++) {
			if(videoj[j].compareTo(v)==1) {
				v=videoj[j];
				mensaje="VIDEOJUEGO CON MAS HORAS: "+videoj[j].toString();
			}
		}
		
		
		return mensaje;
		
	}
	
	

}
