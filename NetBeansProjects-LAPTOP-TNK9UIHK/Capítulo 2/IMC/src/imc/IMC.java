// Exercício 2.33 - IMC.java
// Este programa calcula e exibe o Índice de Massa Corporal (IMC)
package imc;

import java.util.Scanner;
 
public class IMC {
    public static void main (String [] args) {
 
        Scanner input = new Scanner (System.in);
         
        double peso;
        double altura;
        double imc;
         
        System.out.print ("Digite o seu peso em quilos: ");
        peso = input.nextDouble();
        System.out.print ("Digite a sua altura em metros: ");
        altura = input.nextDouble();
        imc = peso / (altura * altura);
        System.out.printf ("Seu Índice de Massa Corporal (IMC) é: %.2f\n\n", imc);
         
        System.out.println ("Classificação IMC: ");
        
        // testa se abaixo do peso
        if (imc < 18.5) 
        {
            System.out.println ("Abaixo do peso: menor do que 18.5");
        }
        
        // testa se normal
        if (imc >= 18.5) 
            if (imc < 25)
            {
                System.out.println ("Normal: entre 18.5 e 24.9");
            }
        
        // testa se acima do peso
        if (imc >= 25)
            if (imc < 30)
                {
                    System.out.println ("Acima do peso: entre 25 e 29.9");
                }
        
        // testa se obeso
        if (imc >= 30)
        {
            System.out.println ("Obeso: 30 ou mais");
        }
 
    } // fim do main
} // fim da classe IMC