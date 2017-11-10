/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebajava3;

import ventana3.interfaz1;
import javax.swing.JFrame;

/**
 *Lavinia Avalos Oyarzo
 *  @author LAB02
 * Fecha:Noviembre 10 de 2017
 * Programa: PruebaJava3
 * Responsabilidad: Clase principal
 */
public class Pruebajava3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
            
    {
       interfaz1 ventana = new interfaz1();
      
      ventana.setVisible(true);
      ventana.setBounds(0, 0, 450, 500);
      ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      
      ventana.setTitle("Tercera Evaluacion Sumativa");
       ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
