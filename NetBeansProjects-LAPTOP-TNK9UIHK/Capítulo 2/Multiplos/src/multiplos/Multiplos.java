// Exercício 2.26 - Multiplos.java
// Programa que lê dois números inteiros e determina se o primeiro
// é múltiplo do segundo e imprime o resultado
package multiplos;

import java.util.Scanner; // programa utiliza Scanner

public class Multiplos
{
    public static void main(String[] args)
    {
        // cria Scanner para obter a entrada a partir da janela de comando
        Scanner input = new Scanner ( System.in );
        
        int number1; // primeiro número inteiro a ser inserido
        int number2; // segundo número inteiro a ser inserido
        
        System.out.print( "Insira o primeiro número inteiro: " ); // prompt
        number1 = input.nextInt(); // lê o primeiro número
        
        System.out.print( "Insira o segundo número inteiro: " ); // prompt
        number2 = input.nextInt(); // lê o segundo número
        
        //rotina de comparação e impressão do resultado
        if ( number1 % number2 == 0)
            System.out.printf( "O número %d é múltiplo de %d!\n", number1, number2 );
        else
            System.out.printf( "O número %d não é multiplo de %d!\n", number1, number2 );
        
    } // fim do método main
    
} // fim da classe Multiplos
