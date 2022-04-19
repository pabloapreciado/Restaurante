/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurante;

import javax.swing.JOptionPane;

/**
 *
 * @author juanp
 */
public class Restaurante {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {

      //Declaracion de variables 
      int d, i, con, t;
        final double DESCUENTO10 = 0.1;
        final double DESCUENTO20 = 0.2;
        final double IMPUESTO = 0.19;
     //entrada de datos
       
     con=Integer.parseInt(JOptionPane.showInputDialog("digita el precio: "));
     //procesamiento
      if (con<100000)
        {
         d = (int) (con *DESCUENTO10);
        }
        else 
        {
        d = (int) (con*DESCUENTO20);
        }
        
        i= (int) (con*IMPUESTO);
        
        t = con-d+i;
        //Salida
        JOptionPane.showMessageDialog(null, "El monto del descuento es: " +  d + " El impuesto es: " + i + " El total a pagar es: " + t);
        
     //fin
    System.exit(0);
    }
    
}
