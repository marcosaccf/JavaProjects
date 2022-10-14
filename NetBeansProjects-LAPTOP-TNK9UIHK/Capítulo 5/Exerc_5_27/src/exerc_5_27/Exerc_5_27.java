// Exercício 5.27: Exerc_5_27.java
package exerc_5_27;

public class Exerc_5_27
{
    public static void main(String[] args)
    {
        int i, j, k;
        
        for ( i = 1; i <= 5; i++ )
        {
            for ( j = 1; j <= 3; j++ )
            {
                for ( k = 1; k <= 4; k++ )
                    System.out.print( '*' );
                
                System.out.println();
            } // fim do for interno
            System.out.println();
        } // fim do for externo
    } // fim do main
    
}
