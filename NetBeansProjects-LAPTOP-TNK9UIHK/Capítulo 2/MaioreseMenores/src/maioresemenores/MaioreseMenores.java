// Exercício 2.24 - MaioreseMenores.java
// Programa que calcula e exibe o maior e o menor número inteiro dentre 5.
package maioresemenores;

import java.util.Scanner;

public class MaioreseMenores
{
    // método principal inicia a execução do aplicativo java
    public static void main(String[] args)
    {
        Scanner input = new Scanner ( System.in );
        
        int number1; // primeiro número a inserir
        int number2; // segundo número a inserir
        int number3; // terceiro número a inserir
        int number4; // quarto número a inserir
        int number5; // quinto número a inserir
        int maior; // armazenamento do maior número
        int menor; // armazenamento do menor número
        
        // Entrada dos valores:
        System.out.print( "Insira o primeiro número inteiro: " ); // prompt
        number1 = input.nextInt(); // lê o primeiro número fornecido pelo usuário
        
        System.out.print( "Insira o segundo número inteiro: " ); // prompt
        number2 = input.nextInt(); // lê o segundo número fornecido pelo usuário
        
        System.out.print( "Insira o terceiro número inteiro: " ); // prompt
        number3 = input.nextInt(); // lê o terceiro número fornecido pelo usuário
        
        System.out.print( "Insira o quarto número inteiro: " ); // prompt
        number4 = input.nextInt(); // lê o quarto número fornecido pelo usuário
        
        System.out.print( "Insira o quinto número inteiro: " ); // prompt
        number5 = input.nextInt(); // lê o quinto número fornecido pelo usuário
        
        // Cálculo do maior:
        maior = number1;
        if ( number2 > maior )
            maior = number2;
        if ( number3 > maior )
            maior = number3;
        if ( number4 > maior )
            maior = number4;
        if ( number5 > maior )
            maior = number5;
        
        // Cálculo do menor:
        menor = number1;
        if ( number2 < menor )
            menor = number2;
        if ( number3 < menor )
            menor = number3;
        if ( number4 < menor )
            menor = number4;
        if ( number5 < menor )
            menor = number5;
        
        // Apresentação dos resultados:
        System.out.printf( "O maior número é: %d\n", maior );
        System.out.printf( "O menor número é: %d\n", menor );
        
    } // Fim do método main
    
} // Fim da classe Aritmetica2.java
