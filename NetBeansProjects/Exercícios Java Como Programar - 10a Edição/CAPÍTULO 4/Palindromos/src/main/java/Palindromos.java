// Exercício 4.30: Palindromos.java

import java.util.Scanner;
public class Palindromos
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        int entrada = 0;
        int numero = 0;
        int inverso = 0;
        int contador = 1;
        int decrescente = 10000;
        boolean teste = false;
        
        while(teste == false)
        {
            System.out.println("Digite um número de 5 dígitos: ");
            entrada = input.nextInt();
            if(entrada > 0 && entrada < 100000)
                {
                    numero = entrada;
                    teste = true;
                }
        }
        
        while(contador <= 5)
        {
            inverso = inverso + (numero % 10) * decrescente;
            numero /= 10;
            decrescente /= 10;
            ++contador;
        }
        
        System.out.println("O inverso do número digitado é: ");
        if(inverso < 9)
            System.out.print("0");
        if(inverso < 99)
            System.out.print("0");
        if(inverso < 999)
            System.out.print("0");
        if(inverso < 9999)
            System.out.print("0");
        System.out.printf("%d%n", inverso);
        System.out.println(entrada == inverso ? "O número é um palíndromo.":
                "O número não é um palíndromo.");
    }
}