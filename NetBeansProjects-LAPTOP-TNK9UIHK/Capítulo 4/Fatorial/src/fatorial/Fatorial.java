// Exercício 4.37: Fatorial.java
package fatorial;
import java.util.Scanner;

public class Fatorial
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner( System.in );
        
        double number = -1;
        double counter = 0;
        double fatorial = 1;
        
        while( number < 0 )
        {
            System.out.print( "Digite um número inteiro não negativo: " );
            number = input.nextInt();
        }
    
        while( counter < number )
        {
            fatorial *= number - counter;
            ++counter;
        }
        
        System.out.printf( "O fatorial é: %.0f\n", fatorial );
    }
}
