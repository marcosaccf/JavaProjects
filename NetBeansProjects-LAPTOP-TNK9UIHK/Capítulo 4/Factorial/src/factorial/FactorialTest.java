// Exercício 4.37(c): FactorialTest.java
// calcula o valor de "e" elevado a x
package factorial;
import java.util.Scanner;

public class FactorialTest
{
    // método main inicia a execução do aplicativo Java
    public static void main( String[] args )
    {
        Scanner input = new Scanner( System.in );
        Factorial factorial = new Factorial( 0 );
        PotenciaDeX power = new PotenciaDeX( 1, 1 );
        
        int x = 0;
        int numeroTermos;
        int termo = 0;
        double fatorial;
        double potenciaX;
        double eX = 0;
        
        // prompt para entrada dos dados
        while( x <= 0) // só aceita valores inteiros positivos como entrada
        {
            System.out.print( "Expoente (x) para a função eˆx : ");
            x = input.nextInt(); // prompt para a entrada do valor de x
        }
        // entre a quantidade de termos para melhorar a precisão
        System.out.print( "\nQuantidade de termos para aproximação da função eˆx : " );
        numeroTermos = input.nextInt(); // prompt para a entrada do número de termos
        
        System.out.println(); // pula uma linha
        
        while( termo < numeroTermos ) // loop para calcular todos os termos
        {
            fatorial = factorial.calcFactorial( termo ); // calcula o fatorial do termo
            
            potenciaX = power.calcPotenciaDeX( x, termo ); // calcula a potencia de x
            
            eX += (potenciaX / fatorial); // calcula a fração de cada termo e adiciona ao resultado
            
            //System.out.printf( "%d termos: eˆ%d = %.16f\n",termo, x , eX );
            
            ++termo; // incrementa o termo
        }
        System.out.printf( "%d termos: eˆ%d = %.16f\n",termo, x , eX ); // exibe o resultado
    }
}