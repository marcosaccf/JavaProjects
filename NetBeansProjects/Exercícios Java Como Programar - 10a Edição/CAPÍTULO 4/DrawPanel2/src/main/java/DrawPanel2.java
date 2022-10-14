// Figura 4.20: DrawPanel2.java
// Exercício 4.1 (b)
import java.awt.Graphics;
import javax.swing.JPanel;

public class DrawPanel2 extends JPanel
{
    // utiliza DrawLine2 para conectar os cantos de um painel
    public void paintComponent(Graphics g)
    {
        // chama paintComponent para assegurar que o painel é exibido corretamente
        super.paintComponent(g);
        
        int width = getWidth(); // largura total
        int height = getHeight(); // altura total
        
        int stepUp = 0; // inicializa o passo ascendente
        int stepDown = 15; // inicializa o passo descendente
        
        // desenha linhas a partir dos 4 cantos do painel em passos de 1/15
        while(stepUp <= 15)
        {
            // linhas começam no canto Superior Esquerdo
            g.drawLine(0, 0, width*stepUp/15, height*stepDown/15);
            // linhas começam no canto Superior Direito
            g.drawLine(0, height,width*stepUp/15, height*stepUp/15);
            // linhas começam no canto Inferior Esquerdo
            g.drawLine(width, 0, width*stepUp/15, height*stepUp/15);
            // linhas começam no canto Inferior Direito
            g.drawLine(width, height, width*stepDown/15, height*stepUp/15);
            stepUp++; // aumenta passo ascendente
            stepDown--; // diminui passo descendente
        } // fim do while
    } // fim do método paintComponent
} // fim da classe DrawPanel2
