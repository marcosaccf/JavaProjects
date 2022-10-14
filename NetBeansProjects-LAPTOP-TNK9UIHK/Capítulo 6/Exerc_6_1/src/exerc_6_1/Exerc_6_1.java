// Figura 6.16: DrawSmiley.java
// Demonstra formas preenchidas
package exerc_6_1;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;
import java.util.Random; // o programa utiliza a classe Random

public class Exerc_6_1 extends JPanel
{
    public void paintComponent( Graphics g )
    {
        Random randomColors = new Random(); // gerador de número aleatório
        int red1, red2; // armazena intensidades de vermelho
        int green1, green2; // armazena intensidades de verde
        int blue1, blue2; // armazena intensidades de azul
        int i = 0; // armazena contador e passo do raio
        
        // gera valores aleatórios de RGB para a primeira cor
        red1 = randomColors.nextInt( 255 );
        green1 = randomColors.nextInt( 255 );
        blue1 = randomColors.nextInt( 255 );
        
        // gera valores aleatórios de RGB para a segunda cor
        red2 = randomColors.nextInt( 255 );
        green2 = randomColors.nextInt( 255 );
        blue2 = randomColors.nextInt( 255 );
        
        super.paintComponent( g );
        
        // desenha os 5 círculos
        while( i < 5)
        {
            if ( i % 2 == 0 ) // se i for par, utiliza a primeira cor
            {
                g.setColor ( new Color( red1, green1, blue1 ) );
                g.fillOval( 10 + 20 * i,10 + 20 * i, 200 - 40 * i, 200 - 40 * i );
            }
            else // se i for ímpar, utiliza a segunda cor
            {
                g.setColor ( new Color( red2, green2, blue2 ) );
                g.fillOval( 10 + 20 * i,10 + 20 * i, 200 - 40 * i, 200 - 40 * i );
            }
            i++; // incrementa i para o próximo círculo
        }
    } // fim do método paintComponent
} // fim da classe Exerc_6_1
