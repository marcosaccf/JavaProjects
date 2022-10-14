// Exercício 5.16: GraficoBarras.java
package graficobarras;
import java.util.Scanner;
public class GraficoBarras
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner( System.in );
        
        int num1, num2, num3, num4, num5;
        
        System.out.println( "Este programa exibe um gráfico de barras com 5 números\n"
            + "inteiros entre 1 e 30 fornecidos pelo usuário\n" );
        
        System.out.print( "Digite o primeiro número inteiro: " );
        num1 = input.nextInt();
        
        System.out.print( "Digite o segundo número inteiro: " );
        num2 = input.nextInt();
        
        System.out.print( "Digite o terceiro número inteiro: " );
        num3 = input.nextInt();
        
        System.out.print( "Digite o quarto número inteiro: " );
        num4 = input.nextInt();
        
        System.out.print( "Digite o quinto número inteiro: " );
        num5 = input.nextInt();
        
        System.out.println( "\nGRÁFICO DE BARRAS:\n" );
        
        System.out.printf( "%d\t", num1 );
        for ( int i = 1; i <= num1; i++ )
            System.out.print( '*' );
        System.out.println();
        
        System.out.printf( "%d\t", num2 );
        for ( int i = 1; i <= num2; i++ )
            System.out.print( '*' );
        System.out.println();
        
        System.out.printf( "%d\t", num3 );
        for ( int i = 1; i <= num3; i++ )
            System.out.print( '*' );
        System.out.println();
        
        System.out.printf( "%d\t", num4 );
        for ( int i = 1; i <= num4; i++ )
            System.out.print( '*' );
        System.out.println();
        
        System.out.printf( "%d\t", num5 );
        for ( int i = 1; i <= num5; i++ )
            System.out.print( '*' );
        System.out.println();
    }
}
