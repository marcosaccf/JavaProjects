// Figura 4.21: DrawPanel4.java
// Exercício 4.2 (b)
import java.awt.Graphics;
import javax.swing.JPanel;

// classe DrawLine4 para fazer um desenho nos quatro cantos do painel
public class DrawPanel4 extends JPanel
{
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
            g.drawLine(0, height*stepUp/15, width*stepUp/15, height);
            // linhas começam no canto Superior Direito
            g.drawLine(width*stepDown/15, 0, 0, height*stepUp/15);
            // linhas começam no canto Inferior Esquerdo
            g.drawLine(width*stepUp/15, 0, width, height*stepUp/15);
            // linhas começam no canto Inferior Direito
            g.drawLine(width, height*stepUp/15, width*stepDown/15, height);
            
            stepUp++; // aumenta passo ascendente
            stepDown--; // diminui passo descendente
        } // fim do while
    } // fim do método paintComponent
} // fim da classe DrawPanel4