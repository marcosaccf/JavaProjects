// Exercício 2.16 - Aritmetica2.java
// Programa que calcula a soma, média, produto e os números maior e menor
package aritmetica2;

import java.util.Scanner;

public class Aritmetica2
{
    // método principal inicia a execução do aplicativo java
    public static void main(String[] args)
    {
        Scanner input = new Scanner ( System.in );
        
        int number1; // primeiro número a inserir
        int number2; // segundo número a inserir
        int number3; // terceiro número a inserir
        int soma; // soma dos números
        int media; // média dos números
        int produto; // produto dos números
        int maior; // armazenamento do maior número
        int menor; // armazenamento do menor número
        
        // Entrada dos valores:
        System.out.print( "Insira o primeiro número inteiro: " ); // prompt
        number1 = input.nextInt(); // lê o primeiro número fornecido pelo usuário
        
        System.out.print( "Insira o segundo número inteiro: " ); // prompt
        number2 = input.nextInt(); // lê o segundo número fornecido pelo usuário
        
        System.out.print( "Insira o terceiro número inteiro: " ); // prompt
        number3 = input.nextInt(); // lê o terceiro número fornecido pelo usuário
        
        // Cálculos diversos:
        soma = number1 + number2 + number3; // calcula a soma
        
        media = soma / 3; // calcula a média
        
        produto = number1 * number2 * number3; // calcula o produto
        
        // Cálculo do maior:
        maior = number1;
        if ( number2 > maior )
            maior = number2;
        if ( number3 > maior )
            maior = number3;
        
        // Cálculo do menor:
        menor = number1;
        if ( number2 < menor )
            menor = number2;
        if ( number3 < menor )
            menor = number3;
        
        // Apresentação dos resultados:
        System.out.printf( "A soma dos três números é: %d\n", soma );
        System.out.printf( "A média dos três números é: %d\n", media );
        System.out.printf( "O produto dos três números é %d\n", produto );
        System.out.printf( "O maior número é: %d\n", maior );
        System.out.printf( "O menor número é: %d\n", menor );
        
    } // Fim do método main
    
} // Fim da classe Aritmetica2.java
