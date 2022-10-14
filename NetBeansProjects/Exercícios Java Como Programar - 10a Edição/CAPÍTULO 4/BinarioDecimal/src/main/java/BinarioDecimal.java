// Exercício 4.31: BinarioDecimal.java

import java.util.Scanner;

public class BinarioDecimal
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        int numero;
        int decimal = 0;
        int contador = 1;
        int potencia = 1;
        boolean testeBinario = true;
        
        System.out.println("Digite um número binário de até 10 dígitos: ");
        numero = input.nextInt();
        
        while(contador <= 10)
        {
            if(numero % 10 > 1)
                testeBinario = false;
            decimal = decimal + (numero % 10) * potencia;
            numero /= 10;
            potencia *= 2;
            ++contador;
        }
        
        if(testeBinario == true)
            System.out.printf("O equivalente decimal do número digitado é: %d\n",
                decimal );
        else
            System.out.println("O número digitado não é binário.");
    }
}
