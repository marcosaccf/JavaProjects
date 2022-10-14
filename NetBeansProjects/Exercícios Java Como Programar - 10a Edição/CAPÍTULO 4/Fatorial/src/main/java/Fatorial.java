// Exercício 4.37(a): Fatorial.java
// Calcula e exibe o fatorial de um número inteiro não negativo digitado.
import java.util.Scanner;
        
public class Fatorial
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner( System.in );
        
        int number = -1;
        int counter = 0;
        double fatorial = 1;
        
        while(number < 0)
        {
            System.out.println("Digite um número inteiro não negativo: ");
            number = input.nextInt();
        }
    
        while(counter < number)
        {
            fatorial *= number - counter;
            ++counter;
        }
        
        System.out.printf("O fatorial é: %.0f%n", fatorial);
    }
}
