// Exercício 2.15: Aritmetica.java
// Programa que exibe o resultado das 4 operações aritméticas de 2 números int
import java.util.Scanner; // programa utiliza a classe Scanner

public class Aritmetica
{
    // método principal inicia a execução do aplicativo Java
    public static void main(String[] args)
    {
        Scanner input = new Scanner ( System.in );
        
        int number1; // primeiro número a inserir
        int number2; // segundo número a inserir
        int sum; // soma dos números
        int difference; // diferença dos números
        int product; // produto dos números
        int quocient; // quociente dos números
        
        System.out.print( "Insira o primeiro número inteiro: " ); // prompt
        number1 = input.nextInt();  // lê o primeiro número fornecido pelo usuário
        
        System.out.print( "Insira o segundo número inteiro: "); // prompt 
        number2 = input.nextInt(); // lê o segundo número fornecido pelo usuário
        
        sum = number1 + number2; // soma os números e armazena em sum
        difference = number1 - number2; // subtrai os números e armazena em difference
        product = number1 * number2; // multiplica os números e armazena em product
        quocient = number1 / number2; // divide os números e armazena em quocient
        
        System.out.printf( "%d + %d = %d\n", number1, number2, sum ); // exibe a soma
        System.out.printf( "%d - %d = %d\n", number1, number2, difference ); // exibe a diferença
        System.out.printf( "%d * %d = %d\n", number1, number2, product ); // exibe o produto
        System.out.printf( "%d / %d = %d\n", number1, number2, quocient ); // exibe o quociente 
    }   // fim do método main
    
} // fim da classe Aritmetica
