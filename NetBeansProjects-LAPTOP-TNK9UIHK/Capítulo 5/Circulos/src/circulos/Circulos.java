// Figura 5.28: Circulos.java
// Demonstra o desenho de diferentes círculos concêntricos.
package circulos;

import java.awt.Graphics;
import javax.swing.JPanel;

public class Circulos extends JPanel
{   
    public void paintComponent( Graphics g )
    {
        super.paintComponent( g );
        
        for ( int i = 0; i < 200; i += 10 )
        {
            g.drawOval( 200 - i, 200 - i,
                    20 + 2 * i, 20 + 2 * i );
        }
    } // fim do método paintComponent
} // fim da classe Circulos