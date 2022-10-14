// Figura 4.18: DrawPanel.java
// Utilizando DrawLine para conectar os cantos de um painel.
package drawpanel1;
import java.awt.Graphics;
import javax.swing.JPanel;

public class DrawPanel1 extends JPanel
{
    // desenha um X a partir dos cantos do painel
    public void paintComponent( Graphics g )
    {
        // chama paintComponent para assegurar que o painel seja exibido corretamente
        super.paintComponent( g );
        
        int width = getWidth(); // largura total
        int height = getHeight(); // altura total
        int stepWidth = 0; // inicializa o passo da largura
        int stepHeight = 0; // inicializa o passo da altura
        
        while( stepWidth <= 15 ) // repete até o passo da largura for 15
        {
            // desenha a linha
            g.drawLine( 0, stepHeight*height/15, stepWidth*width/15, height );
            stepWidth++; // incrementa o passo da largura
            stepHeight++; // incrementa o passo da altura
        } // fim do while
    } // fim do método paintComponent
} // fim da classe drawPanel
