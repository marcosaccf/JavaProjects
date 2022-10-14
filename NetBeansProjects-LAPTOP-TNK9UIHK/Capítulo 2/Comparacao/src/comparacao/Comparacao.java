// Exercício 2.16: Comparacao.java
// Programa que compara dois inteiros
package comparacao;

import java.util.Scanner;
        
public class Comparacao
{
    // método principal inicia a execução do aplicativo Java
    public static void main(String[] args)
    {
        Scanner input = new Scanner ( System.in );
        
        int number1; // primeiro número a inserir
        int number2; // segundo número a inserir
        int maior = 0; // armazenamento do número maior
        
        System.out.print( "Digite o primeiro número inteiro: " );
        number1 = input.nextInt();
        
        System.out.print( "Digite o segundo número inteiro: " );
        number2 = input.nextInt();
        
        if ( number1 > number2 )
            maior = number1;
            
        if ( number2 > number1 )
            maior = number2;
        
        if ( number1 == number2 )
            System.out.println( "Esses números são iguais." );
        else
            System.out.printf( "O número %d é maior.\n", maior );
    } // fim do método main
    
} // fim da classe Comparacao
