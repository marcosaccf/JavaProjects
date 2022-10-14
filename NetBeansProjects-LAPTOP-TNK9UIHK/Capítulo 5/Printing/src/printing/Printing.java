// Exercício 5.10: Printing.java
package printing;
public class Printing
{
    public static void main(String[] args)
    {
        for ( int i = 1; i <= 10; i++ )
        {
            for ( int j = 1; j <= 5; j++ )
                System.out.print( '@' );
            
            System.out.println();
        } // fim do for externo
    } // fim de main
} // fim da classe Printing
