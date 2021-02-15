package punto5;

import javax.swing.JOptionPane;

public class EntregableApp {

	public static void main(String[] args) {
	
		Alumno alumnoArray[]=new Alumno[5];
		alumnoArray[0]= new Alumno("Jhon",10,'M',40,4.5);
		alumnoArray[1]= new Alumno("Maria",11,'F',50,5);
		alumnoArray[2]= new Alumno("Pepe",10,'M',30,3.5);
		alumnoArray[3]= new Alumno("Luisa",12,'F',2,4.8);
		alumnoArray[4]= new Alumno("Gustavo",12,'M',4,4.4);

		
		Profesor profesor=new Profesor("Alvaro",40,'M',20,"matematicas");
		Aula aula=new Aula(001,5,"Matematicas",alumnoArray,profesor);
		
	
		JOptionPane.showMessageDialog(null, aula.darClase());
		
		
		/*profesorArray[0]=new Profesor("Alvaro",40,'M',"Matematicas",20);
		profesorArray[1]=new Profesor("Elizabeth",45,'F',"Filosofia",21);
		profesorArray[2]=new Profesor("Jaime",31,'M',"Matematicas",1);
		profesorArray[3]=new Profesor("Jairo",50,'M',"Fisica",2);
		profesorArray[4]=new Profesor("Steven",30,'M',"Filosofia",4);*/
	
		
		/*aulaArray[0]=new Aula(001,5,"Matematicas",alumnoArray,profesorArray[0]);
		aulaArray[1]=new Aula(002,5,"Fisica",alumnoArray,profesorArray[2]); //No coincide materia profesor con materia aula
		aulaArray[2]=new Aula(003,5,"Filosofia",alumnoArray,profesorArray[4]);
		aulaArray[3]=new Aula(004,5,"Fisica",alumnoArray,profesorArray[3]);
		aulaArray[0]=new Aula(005,5,"Matematicas",alumnoArray,profesorArray[2]);*/
		
		

	}

}
