// Exercício 2.32 - DeterminaSinal.java
// Programa que lê 5 números e determina quantos positivos, negativos e zeros
import java.util.Scanner;

public class DeterminaSinal
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner( System.in );
        
        int number1, number2, number3, number4, number5;
        int positives = 0, negatives = 0, zeros = 0;
        
        System.out.print( "Insira o primeiro número: " );
        number1 = input.nextInt();
        
        System.out.print( "Insira o segundo número: " );
        number2 = input.nextInt();
        
        System.out.print( "Insira o terceiro número: " );
        number3 = input.nextInt();
        
        System.out.print( "Insira o quarto número: " );
        number4 = input.nextInt();
        
        System.out.print( "Insira o quinto número: " );
        number5 = input.nextInt();
        
        if ( number1 > 0 )
            positives++;
        if ( number1 < 0 )
            negatives++;
        if ( number1 == 0 )
            zeros++;
        
        if ( number2 > 0 )
            positives++;
        if ( number2 < 0 )
            negatives++;
        if ( number2 == 0 )
            zeros++;
        
        if ( number3 > 0 )
            positives++;
        if ( number3 < 0 )
            negatives++;
        if ( number3 == 0 )
            zeros++;
        
        if ( number4 > 0 )
            positives++;
        if ( number4 < 0 )
            negatives++;
        if ( number4 == 0 )
            zeros++;
        
        if ( number5 > 0 )
            positives++;
        if ( number5 < 0 )
            negatives++;
        if ( number5 == 0 )
            zeros++;
        
        System.out.printf( "Quantidade de positivos: %d\n", positives);
        System.out.printf( "Quantidade de negativos: %d\n", negatives);
        System.out.printf( "Quantidade de zeros: %d\n", zeros);
    }   
}