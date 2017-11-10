/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventana3;
import javax.swing.*;
import java.awt.*;

import bd.ConexionBD;
import java.sql.Connection;
import java.awt.event.*;


/**
 * *Lavinia Avalos Oyarzo
 *  @author LAB02
 * Fecha:Noviembre 10 de 2017
 * Programa: Interfaz1.Java
 * Responsabilidad: Clase principal
 * 
 */
public class interfaz1 extends JFrame
{
  JPanel panel;
  JLabel label;
  JTextField text;
  JButton boton;
  JButton boton2;
  
 
  ConexionBD con;
  
  
  public interfaz1() 
  {
   panel = new JPanel();
   label = new JLabel();  
   text  =  new JTextField(15);
   boton = new JButton();
   boton2 = new JButton();
   
   this.add(panel);
   panel.add(label);
   panel.add(text);
   panel.add(boton); 
   panel.add(boton2);
   
   label.setText("Base de Datos");
   boton.setText("Conectar");
   boton2.setText("Desconectar");
   panel.setBackground(Color.PINK);
   
   
   boton.addActionListener(new ActionListener()
           
   { 
       
       public void actionPerformed(ActionEvent evt)
       {
         con =new ConexionBD();
         Connection reg = con.conectar();
       }
   
           });
   
     boton2.addActionListener(new ActionListener()
           
   { 
       
       public void actionPerformed(ActionEvent evt)
       {
          con.desconectar();
       }
   
           });
 
       
   }
   

}
