// Figura 6.17: DrawSmileyTest.java
// Aplicativo de teste que exibe um rosto sorridente
package exerc_6_1;
import javax.swing.JFrame;

public class Exerc_6_1Test
{
    public static void main( String[] args )
    {
        Exerc_6_1 panel = new Exerc_6_1();
        JFrame application = new JFrame();
        
        application.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        application.add( panel );
        application.setSize( 230, 250 );
        application.setVisible( true );
    } // fim de main
} // fim da classe DrawSmileyTest