// Figura 5.28: CirculosTest.java
// Aplicativo de teste que exibe a classe Shapes.
package circulos;
import javax.swing.JFrame;

public class CirculosTest
{
    public static void main( String[] args )
    { 
        Circulos panel = new Circulos( );
        JFrame application = new JFrame(); // cria um novo JFrame
        
        application.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        application.add( panel ); // adiciona painel ao frame
        application.setSize( 420, 440 ); // configura o tamanho desejado
        application.setVisible( true ); // mostra o frame
    } // fim de main
} // fim da classe CirculosTest