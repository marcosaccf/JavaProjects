// Exercício 4.20: CalculadorDeSalarios.java

import java.util.Scanner;

public class CalculadorDeSalarios
{
    public static void main(String[] args)
    {
        // cria um Scanner para obter entrada a partir da janela de comando
        Scanner input = new Scanner(System.in);
        
        String nomeEmpregado; // declara a variável do nome do empregado
        Double salario; // declara a variável do salário bruto semanal 
        
        // laço para calcular o salário bruto semanal de 3 empregados
        for(int i = 1; i <=3; i++)
        {
            // prompt para entrada dos dados necessários
            System.out.printf("%nEMPREGADO %d%n", i);
            System.out.println("Digite o primeiro nome do empregado: ");
            nomeEmpregado = input.next();
            System.out.println("Digite o número de horas trabalhadas na semana: ");
            Double horasSemanal = input.nextDouble();
            System.out.println("Digite o valor do salário-hora: ");
            Double salarioHora = input.nextDouble();
            
            // calcula o salário semanal normal ou acrescido de horas-extras
            if(horasSemanal <= 40)
                salario = horasSemanal * salarioHora;
            else
                salario = 40 * salarioHora + 1.5 * (horasSemanal - 40) * salarioHora;
            
            // imprime o resultado
            System.out.printf("O valor do salário bruto do empregado %s é: R$ %.2f%n",
                    nomeEmpregado, salario);
        } // fim do laço for
    } // fim do método main
} // fim da classe CalculadorDeSalarios
