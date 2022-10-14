// Figura 6.8: RollDie.java
// Rola um dado de seis lados 6 mil vezes
package rolldie;
import java.util.Random;
public class RollDie
{
    public static void main(String[] args)
    {
        Random randomNumbers = new Random(); // gerador de número aleatório
        
        int frequency1 = 0; // mantém a contagem de 1s lançados
        int frequency2 = 0; // contagem de 2s lançados
        int frequency3 = 0; // contagem de 3s lançados
        int frequency4 = 0; // contagem de 4s lançados
        int frequency5 = 0; // contagem de 5s lançados
        int frequency6 = 0; // contagem de 6s lançados
        
        int face; // armazena o valor lançado mais recentemente
        
        // soma 6.000 lançamentod de um dado
        for ( int roll = 1; roll <= 6000; roll++ )
        {
            face = 1 + randomNumbers.nextInt( 6 ); // número entre 1 e 6
            
            // define o valor de lançamento de 1 a 6 e incrementa o contador apropriado
            switch ( face )
            {
                case 1:
                    ++frequency1; // incrementa o contador de 1s
                    break;
                case 2:
                    ++frequency2; // incrementa o contador de 2s
                    break;
                case 3:
                    ++frequency3; // incrementa o contador de 3s
                    break;
                case 4:
                    ++frequency4; // incrementa o contador de 4s
                    break;
                case 5:
                    ++frequency5; // incrementa o contador de 5s
                    break;
                case 6:
                    ++frequency6; // incrementa o contador de 6s
                    break; // opicional no final do switch
            } // fim do switch
        } // for final
        
        System.out.println( "Face\tFrequency" ); // cabeçalhos de saída
        System.out.printf( "1\t%d\n2\t%d\n3\t%d\n4\t%d\n5\t%d\n6\t%d\n", 
                frequency1, frequency2, frequency3, frequency4,
                frequency5, frequency6 );
    } // fim de main
} // fim da classe RollDie
