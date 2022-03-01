import java.util.Random;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class JuegoG {
	
	public static void main(String[] args) {
		int cantidad; 
	    int dado1;
	    int dado;
	    int apuesta;
	    int casa;
	    int casa1;
		 
		 do {
			 cantidad = Integer.parseInt(JOptionPane.showInputDialog(null, "ingrese la cantidad de jugadores"));
			 casa = Integer.parseInt(JOptionPane.showInputDialog(null, "ingrese el valor nicial de la apuesta"));
			 casa1 = casa;
			 casa = casa*2;
			 } while (cantidad > 6 || cantidad <= 1);
		 	String arreglo[] = new String[cantidad];
		 	for (int i = 0; i < cantidad; i++) {
		 		arreglo[i] = JOptionPane.showInputDialog(null,"ingrese los nombres ");
		 		}
		 	JOptionPane.showMessageDialog(null, "la cantidad total de la casa es: " + casa + " pesos");
		 	do {
		 		for (int i = 0; i < cantidad - 1; i++) {
		 			JOptionPane.showMessageDialog(null, "precione enter para lanzar jugador " + arreglo[i]);
		 			Random azar = new Random();
		 			dado = azar.nextInt(6) + 1;
		 			JOptionPane.showMessageDialog(null, "su numero es " + dado);
		 			if (dado == 1 || dado == 6) {
		 				JOptionPane.showMessageDialog(null, "ponga el valor de la apuesta inicial de la casa");
		 				casa = casa + casa1 ;
		 				JOptionPane.showMessageDialog(null, "el valor de la casa es : " + casa + " pesos");
		 				} else {
		 					apuesta= Integer.parseInt(JOptionPane.showInputDialog("ponga su apuesta"));
		 					JOptionPane.showMessageDialog(null, "precione enter para lanzar");
		 					dado1 = azar.nextInt(6) + 1;
		 					JOptionPane.showMessageDialog(null, "su numero es " + dado1);
		 					if (dado1 <= dado) {
		 						JOptionPane.showMessageDialog(null, "pierde");
		 						casa = casa + apuesta;JOptionPane.showMessageDialog(null, "el valor de la casa es : " + casa + " pesos");
		 						} else {
		 							JOptionPane.showMessageDialog(null, "gana lo apostado");
		 							casa = casa - apuesta;
		 							JOptionPane.showMessageDialog(null,"el pozo tiene " + casa + " pesos");

		 
		 						}
		 					
		 			if (casa == 0) {JOptionPane.showMessageDialog(null,"gracias por jugar ");
		 			i = cantidad - 1;
		 			}
		 				}
		 			}
		 		} while (casa != 0);
		 	}
}
