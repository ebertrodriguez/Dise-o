/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.ArrayList;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class tablero {

    public int tablero;
    public  int inicio = 1;
    public int fin;
    private int positivas;
    private int negativas;
    private int porcentaje;
    public ArrayList celdasP = new ArrayList();
    public ArrayList celdasN = new ArrayList();
    private int celda;

    Scanner teclado = new Scanner(System.in);

    public void leertablero() {
    	int tamano = Integer.parseInt(JOptionPane.showInputDialog("Digite el tamaño del tablero"));
        while (tamano <= 10) {
            tamano = Integer.parseInt(JOptionPane.showInputDialog("Digite el tamaño del tablero, debe ser mayor a 10."));
        }
        
        tablero = tamano;
        fin= tablero;
        JOptionPane.showMessageDialog(null, "La dimencion del tablero es: "+fin);
        JOptionPane.showMessageDialog(null, " START GAME ");

        porcentaje = (tablero * 10) / 100;
        double resto = 0.5;

        if (porcentaje % 2 == 0) {
            positivas = (porcentaje / 2);
            negativas = positivas;
        } else {
            negativas = (int) ((porcentaje / 2) + resto);
            positivas = (int) ((porcentaje / 2) - resto);
        }
          
        for(int i = inicio;i<=porcentaje; i++){
            if(i<= negativas){
                celda =(int) (Math.random() * (tablero- 1) + 2);
                celdasN.add(celda);
            } else{
                celda =(int) (Math.random() * (tablero- 1) + 2);
                celdasP.add(celda);
            }
        }
        JOptionPane.showMessageDialog(null, "Las posiciones: "+celdasP+" avanza posiciones adicionales ");
        JOptionPane.showMessageDialog(null, "Las posiciones: "+celdasN+" retroceden posiciones ");       
    }

}
