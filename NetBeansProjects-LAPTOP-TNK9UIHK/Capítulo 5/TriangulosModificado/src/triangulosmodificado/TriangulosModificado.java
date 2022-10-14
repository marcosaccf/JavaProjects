// Exercício 5.15: TrisngulosModificado.java
package triangulosmodificado;

public class TriangulosModificado
{
    public static void main(String[] args)
    {
        int row; // declara a variável linha
        int column; // declara a variável coluna
        
        for ( row = 1; row <= 10; row++ ) // loop para as linhas
        {
            // exibe o primeiro triângulo
            for ( column = 1; column <= row; column++ )
                System.out.print( '*' );
            for ( column = 10; column >= row; column-- )
                System.out.print( ' ' );
            
            System.out.print( ' ' ); // separa por uma coluna em branco
            
            // exibe o segundo triângulo
            for ( column = 10; column >= row; column-- )
                System.out.print( '*' );
            for ( column = 1; column <= row; column++ )
                System.out.print( ' ' );
            
            // exibe o terceiro triângulo
            for ( column = 1; column <= row; column++ )
                System.out.print( ' ' );
            for ( column = 10; column >= row; column-- )
                System.out.print( '*' );
            
            System.out.print( ' ' ); // separa por uma coluna em branco
            
            // exibe o quarto triângulo
            for ( column = 10; column >= row; column-- )
                System.out.print( ' ' );
            for ( column = 1; column <= row; column++ )
                System.out.print( '*' );
            
            System.out.println(); // pula para a próxima linha
        }
    }
    
}
