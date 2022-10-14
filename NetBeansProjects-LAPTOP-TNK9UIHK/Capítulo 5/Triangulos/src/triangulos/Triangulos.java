// Exercício 5.15: Triangulos.java
package triangulos;

public class Triangulos
{
    public static void main(String[] args)
    {
        int column;
        int row;
        
        // primeiro padrão de triângulo com asteriscos:
        for ( row = 1; row <= 10; row++ )
        {
            for ( column = 1; column <= row; column++ )
                System.out.print( '*' );
            System.out.println();
        }
        System.out.println();
        
        // segundo padrão de triângulo com asteriscos
        for ( row = 1; row <= 10; row++ )
        {
            for ( column = row; column <= 10; column++ )
                System.out.print( '*' );
            System.out.println();
        }
        System.out.println();
        
        // terceiro padrão de triângulo com asteriscos
        for ( row = 1; row <= 10; row++ )
        {
            for ( column = 1; column <= 10; column++ )
            {
                if ( column < row )
                    System.out.print( ' ' );
                else
                    System.out.print( '*' );
            }
            System.out.println();
        }
        System.out.println();
        
        // quarto padrão de triângulo com asteriscos
        for ( row = 1; row <= 10; row++ )
        {
            for ( column = 1; column <= 10; column++ )
            {
                if ( column <= (10 - row) )
                    System.out.print( ' ' );
                else
                    System.out.print( '*' );
            }
            System.out.println();
        }
    }
}
