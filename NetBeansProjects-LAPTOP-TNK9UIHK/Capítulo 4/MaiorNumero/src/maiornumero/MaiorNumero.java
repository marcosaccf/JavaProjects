// Exercício 4.21: MaiorNumero.java
// Localize o maior número dentre 10 números inseridos
package maiornumero;

import java.util.Scanner;

public class MaiorNumero
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        int counter = 1;
        int number;
        int largest = -2147483648;
        
        while(counter <= 10)
        {
            System.out.printf("Digite o número %d de 10: ", counter);
            number = input.nextInt();
            
            if(number > largest)
                largest = number;
            counter++;
        }
        System.out.printf("\nO maior número digitado foi: %d\n", largest);
    }
}