/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventana3;
import javax.swing.*;
import java.awt.*;
//Paso 14 - Importar la clase conexion
import bd.ConexionBD;
import java.sql.Connection;
import java.awt.event.*;


/**
 *
 * @author LAB02
 */
public class interfaz1 extends JFrame
{
  JPanel panel;
  JLabel label;
  JTextField text;
  JButton boton;
  JButton boton2;
  
  //Paso 15 - Creación de un objeto tipo ConexionBD
  ConexionBD con;
  
  
  public interfaz1() //poner llaves
  {
   panel = new JPanel();
   label = new JLabel();  
   text  =  new JTextField(20);
   boton = new JButton();
   boton2 = new JButton();
   
   this.add(panel);
   panel.add(label);
   panel.add(text);
   panel.add(boton); 
   panel.add(boton2);
   
   label.setText("Atributo");
   boton.setText("Conectar");
   boton2.setText("Desconectar");
   panel.setBackground(Color.PINK);
   
   //PASO 16 - agregamos escuchadores al boton
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
          con.conectar();
       }
   
           });
 
       
   }
   

}
