// Exercício 5.11: MenorValor.java
package menorvalor;
import java.util.Scanner;
public class MenorValor
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner( System.in );
        int count;
        int number;
        int menor = 2147483647;
        
        System.out.print( "Quantos números deseja inserir? ");
        count = input.nextInt();
        
        if ( count <= 0 )
            menor = 0;
        
        for ( int i = 1; i <= count; i++ )
        {
            System.out.print( "Insira um número inteiro: ");
            number = input.nextInt();
            
            if ( number < menor )
                menor = number;
        }
        
        System.out.printf( "O menor número inteiro inserido foi: %d\n", menor );
    }
}
