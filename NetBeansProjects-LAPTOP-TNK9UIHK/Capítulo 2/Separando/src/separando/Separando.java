// Exercício 2.30 - Separando.java
// Programa que lê um número de 5 dígitos e os separa.
package separando;

import java.util.Scanner;

public class Separando
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner( System.in );
        
        int number;
        
        System.out.print( "Insira um número inteiro de 5 dígitos: " );
        number = input.nextInt();
        
        System.out.println( "Os dígitos separados são:" );
        
        for ( int i = 1; i <= 5; i++ )
        {
            System.out.printf( "%d   ", number / 10000 );
            number = number % 10000 * 10;
        }
        System.out.println();
    }
    
}
