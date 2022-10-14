// Figura 4.20: DrawPanel1.java
// Exercício 4.1 (a)
import java.awt.Graphics;
import javax.swing.JPanel;

public class DrawPanel1 extends JPanel
{
    // desenha um painel de linhas a partir de um canto
    public void paintComponent(Graphics g)
    {
        // chama paintComponent para assegurar que o painel éexibido corretamente
        super.paintComponent(g);
        
        int width = getWidth(); // largura total
        int height = getHeight(); // altura total
        
        int stepWidth = 0; // inicializa o passo da largura
        int stepHeight = 15; // inicializa o passo da altura
        
        while(stepWidth <= 15) // repete até o passo da largura for igual a 15
        {
            // desenha várias linhas a partir do canto superior esquerdo
            g.drawLine(0, 0, width*stepWidth/15, height*stepHeight/15);
            
            stepWidth++; // incrementa o passo da largura
            stepHeight--; // decrementa o passo da altura
        } // fim do laço while
    } // fim do método paintComponent
} // fim da classe DrawPanel1
