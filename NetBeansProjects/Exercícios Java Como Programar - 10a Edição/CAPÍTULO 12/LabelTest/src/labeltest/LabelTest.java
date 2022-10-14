/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package labeltest;

/**
 *
 * @author marco
 */
// Fig. 12.7: LabelTest.java
// Testing LabelFrame.
import javax.swing.JFrame;

public class LabelTest 
{
   public static void main(String[] args)
   { 
      LabelFrame labelFrame = new LabelFrame(); 
      labelFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      labelFrame.setSize(260, 180); 
      labelFrame.setVisible(true); 
   } 
} // end class LabelTest