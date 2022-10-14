// Exercício 4.20: CalculadorDeSalarios.java
// Determina o salário bruto de cada um de três empregados
package calculadordesalarios;

import java.util.Scanner;

public class CalculadorDeSalarios
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        double horasTrabalhadas;
        double salarioHora;
        double salarioSemanal;
        double horasExtras;
        double salarioExtras;
        int contador = 1;
        
        while(contador <= 3)
        {
            System.out.printf("CÁLCULO DO EMPREGADO %d:\n\n", contador);
            System.out.print("Digite o número de horas trabalhadas na semana: ");
            horasTrabalhadas = input.nextDouble();
            System.out.print("Digite o valor do salário-hora do empregado: R$ ");
            salarioHora = input.nextDouble();
            if(horasTrabalhadas <= 40)
                salarioSemanal = horasTrabalhadas * salarioHora;
            else
            {
                salarioSemanal = 40 * salarioHora;
                horasExtras = horasTrabalhadas - 40;
                salarioExtras = 1.5 * salarioHora;
                salarioSemanal = salarioSemanal + horasExtras * salarioExtras;
            }
            System.out.printf("O salário bruto do empregado é de: R$ %.2f\n\n\n", salarioSemanal);
            contador++;
        } // fim do while

    } // fim do método main
    
} // fim da classe CalculadorDeSalarios
