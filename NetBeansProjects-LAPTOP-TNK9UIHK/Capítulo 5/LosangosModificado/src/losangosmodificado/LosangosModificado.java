// Exercício 6.25: LosangosModificado.java
package losangosmodificado;
import java.util.Scanner;
public class LosangosModificado
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner( System.in );
        int row;
        int column;
        int tamanho;
        int meio;
        
        System.out.print( "Digite o número de linhas do losango.\n" +
                "(Número ímpar no intervalo de 1 a 19): " );
        tamanho = input.nextInt();
        meio = (tamanho + 1) / 2;
        
        for ( row = 1; row <= meio; row++ )
        {
            for ( column = meio; column >= row; column-- )
                System.out.print( ' ' );
            for ( column = 1; column <= row; column++ )
                System.out.print( '*' );
            
            for ( column = 2; column <= row; column++ )
                System.out.print( '*' );
            for ( column = meio; column >= row; column-- )
                System.out.print( ' ' );
        
            System.out.println();
        }
        
        for ( row = 2; row <= meio; row++ )
        {
            for ( column = 1; column <= row; column++ )
                System.out.print( ' ' );
            for ( column = meio; column >= row; column-- )
                System.out.print( '*' );
            
            for ( column = meio; column > row; column-- )
                System.out.print( '*' );
            for ( column = 2; column <= row; column++ )
                System.out.print( ' ' );
            
            System.out.println();
        }
    
    }
    
}
