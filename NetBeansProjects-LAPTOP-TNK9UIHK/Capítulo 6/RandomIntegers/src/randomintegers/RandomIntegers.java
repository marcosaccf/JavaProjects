// Figura 6.7: RandomIntegers.java
// Inteiros aleatórios deslocados e escalonados
package randomintegers;
import java.util.Random; // o programa utiliza a classe Random
public class RandomIntegers
{
    public static void main(String[] args)
    {
        Random randomNumbers = new Random(); // gerador de número aleatório
        int face; // armazena cada inteiro aleatório gerado
        
        // faz o loop 20 vezes
        for ( int counter = 1; counter <= 24; counter++ )
        {
            // seleciona o inteiro aleatório entre 1 e 6
            face = 1 + randomNumbers.nextInt( 60 );
            
            System.out.printf( "%d ", face ); // exibe o valor gerado
            
            // se o contador for divisível por 5, inicia uma nova linha de saída
            if ( counter % 6 == 0 )
                System.out.println();
        } // for final
    } // fim de main
} // fim da classe RandomIntegers
