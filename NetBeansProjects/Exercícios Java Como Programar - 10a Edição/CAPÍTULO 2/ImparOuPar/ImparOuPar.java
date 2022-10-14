// Exercício 2.25 - ImparouPar.java
// Programa que lê um inteiro e determina se é ímpar ou par
import java.util.Scanner; // programa utiliza Scanner

public class ImparOuPar
{
    public static void main(String[] args)
    {
        // cria Scanner para obter entrada a partir da janela de comando
        Scanner input = new Scanner ( System.in );
        
        int number; // número inserido pelo usuário
        
        System.out.print( "Entre um número inteiro: "); // solicita a entrada
        number = input.nextInt(); // lê o número inteiro
        
        // Rotina para descobrir e imprimir se o número é par ou ímpar
        if ( number % 2 == 0 )
            System.out.printf( "O número %d é par!%n", number );
        else
            System.out.printf( "O número %d é ímpar!%n", number );
        
    } // fim do método main
} // fim da classe ImparouPar