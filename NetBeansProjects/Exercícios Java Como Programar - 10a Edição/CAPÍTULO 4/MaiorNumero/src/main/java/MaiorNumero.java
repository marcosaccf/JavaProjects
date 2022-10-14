// Exercício 4.21: MaiorNumero.java

import java.util.Scanner;

public class MaiorNumero
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        int counter = 1; // declara e inicializa a variável contador
        int number; // declara a variável para armazenar as entradas do usuário
        int largest = -2147483648; // declara e inicializa com o maior número
        
        while(counter <= 10) // laço para entrada de 10 números inteiros
        {
            // prompt para entrada do usuário
            System.out.printf("Digite o %dº número inteiro:%n", counter);
            number = input.nextInt();
            
            // compara e atualiza a entrada com o maior valor até o momento
            if(number > largest)
                largest = number;
            
            counter++; // incrementa o contador
        } // fim do while
        // Imprime o resultado
        System.out.printf("%nO maior número digitado foi: %d%n", largest);
    } // fim do método main
} // fim da classe MaiorNumero