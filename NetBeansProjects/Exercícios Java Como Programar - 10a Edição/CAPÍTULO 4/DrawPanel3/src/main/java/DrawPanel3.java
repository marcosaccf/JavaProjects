// Figura 4.21: DrawPanel3.java
// Exercício 4.2 (a)
import java.awt.Graphics;
import javax.swing.JPanel;

public class DrawPanel3 extends JPanel
{
    // utiliza DrawLine3 para fazer um desenho no canto Inferior Esquerdo
    public void paintComponent(Graphics g)
    {
        // chama paintComponent para assegurar que o painel é exibido corretamente
        super.paintComponent(g);
        
        int width = getWidth(); // largura total
        int height = getHeight(); // altura total
        
        int stepUp = 0; // inicializa o passo ascendente
        
        // desenha linhas a partir dos 4 cantos do painel em passos de 1/15
        while(stepUp <= 15)
        {
            // desenha a próxima linha
            g.drawLine(0, height*stepUp/15, width*stepUp/15, height);
            stepUp++; // aumenta passo ascendente
        } // fim do while
    } // fim do método paintComponent
} // fim da classe DrawPanel3
