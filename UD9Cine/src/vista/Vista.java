package vista;

import javax.swing.JOptionPane;

public class Vista {
	
	/*public void imprimirSala() {
		
		for(int i=0;i<FILA;i++) {
			for(int j=0;j<COL;j++) {
				System.out.println(sala[i][j].getId());
			}
		}
	}*/
	
	public void noCumpleRequisitos() {
		JOptionPane.showMessageDialog(null, "No cumple con los requisitos");
	}
	

	
	public void noPuestos() {
		JOptionPane.showMessageDialog(null, "No se encuentran puestos disponibles");
	}
}
