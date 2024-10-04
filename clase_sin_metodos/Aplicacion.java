package clase_sin_metodos;

import javax.swing.JOptionPane;

public class Aplicacion {

	public static void main(String[] args) {
		 String cadena;
		 double ladoA;
		 double ladoB;
		 double resultado;
		 
		 cadena = JOptionPane.showInputDialog(null, "Ingrese la longitud el lado A: " );
		 ladoA = Double.parseDouble(cadena);
		 
		 cadena = JOptionPane.showInputDialog(null, "Ingrese la longitud el lado B: " );
		 ladoB = Double.parseDouble(cadena);
		 
		 resultado = ladoA * ladoB;
		 JOptionPane.showInputDialog(null, "El resultado es: " + resultado);
	}

}
