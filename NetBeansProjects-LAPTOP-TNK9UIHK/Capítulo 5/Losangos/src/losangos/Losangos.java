// Exercício 5.24: Losangos.java
package losangos;

public class Losangos
{
    public static void main(String[] args)
    {
        int row;
        int column;
        
        for ( row = 1; row <= 5; row++ )
        {
            for ( column = 5; column >= row; column-- )
                System.out.print( ' ' );
            for ( column = 1; column <= row; column++ )
                System.out.print( '*' );
            
            for ( column = 2; column <= row; column++ )
                System.out.print( '*' );
            for ( column = 5; column >= row; column-- )
                System.out.print( ' ' );
        
            System.out.println();
        }
        
        for ( row = 2; row <= 5; row++ )
        {
            for ( column = 1; column <= row; column++ )
                System.out.print( ' ' );
            for ( column = 5; column >= row; column-- )
                System.out.print( '*' );
            
            for ( column = 5; column > row; column-- )
                System.out.print( '*' );
            for ( column = 2; column <= row; column++ )
                System.out.print( ' ' );
            
            System.out.println();
        }
    }
}
