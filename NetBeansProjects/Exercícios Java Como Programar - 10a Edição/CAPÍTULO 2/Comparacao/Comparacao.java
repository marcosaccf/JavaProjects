// Exercício 2.16: Comparacao.java
// Programa que compara dois inteiros
import java.util.Scanner;
        
public class Comparacao
{
    // método principal inicia a execução do aplicativo Java
    public static void main(String[] args)
    {
        Scanner input = new Scanner ( System.in );
        
        int number1; // primeiro número a inserir
        int number2; // segundo número a inserir
        
        System.out.print( "Digite o primeiro número inteiro: " );
        number1 = input.nextInt();
        
        System.out.print( "Digite o segundo número inteiro: " );
        number2 = input.nextInt();
        
        if ( number1 > number2 )
            System.out.printf( "O número %d é maior.%n", number1 );
            
        if ( number2 > number1 )
            System.out.printf( "O número %d é maior.%n", number2 );
        
        if ( number1 == number2 )
            System.out.println( "Esses números são iguais." );
        
    } // fim do método main
    
} // fim da classe Comparacao
