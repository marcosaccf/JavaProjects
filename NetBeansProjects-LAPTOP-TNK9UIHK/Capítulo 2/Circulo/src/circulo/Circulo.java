// Exercício 2.28 - Circulo.java
// Programa que calcula e exibe diâmetro, circunferência e área de um círculo
package circulo;

import java.util.Scanner;

public class Circulo
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner( System.in );
        
        int raio;
        
        System.out.print( "Insira o valor do raio (número inteiro): " );
        raio = input.nextInt();
        
        System.out.printf( "O diámetro do círculo é: %d\n", 2 * raio );
        System.out.printf( "A circunferência do círculo é: %f\n", 2 * Math.PI * raio );
        System.out.printf( "A área da circunferência é: %f\n", Math.PI * raio * raio );
    }
    
}
