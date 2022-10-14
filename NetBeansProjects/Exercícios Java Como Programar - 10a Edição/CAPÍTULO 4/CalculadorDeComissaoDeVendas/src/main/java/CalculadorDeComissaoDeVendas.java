// Exercício 4.19: CalculadorDeComissaoDeVendas.java

import java.util.Scanner;

public class CalculadorDeComissaoDeVendas
{
    public static void main(String[] args)
    {
        // cria um Scanner para obter entrada a partir da janela de comando
        Scanner input = new Scanner(System.in);
        
        int quantItem; // cria variável para a quantidade de vendas de cada item
        double valorItem1 = 239.99; // cria e inicializa o preço do item1
        double valorItem2 = 129.75; // cria e inicializa o preço do item2
        double valorItem3 = 99.95; // cria e inicializa o preço do item3
        double valorItem4 = 350.89; // cria e inicializa o preço do item4
        double rendimentoFixo = 200; // cria e inicializa a comissão fixa do vendedor
        double valorDeVendasBruto = 0; // cria e inicializa o valor total bruto de vendas
        double rendimento; // cria variável para armezenar o valor final da comissão
        
        // prompt inicial para identificar o vendedor
        System.out.println("Digite a matrícula do vendedor (0 para sair): ");
        int matricula = input.nextInt();
        
        while(matricula != 0) // processa loop controlado por sentinela
        {
            // prompt para entrada das quantidades vendidas de cada item
            System.out.println("Digite a quantidade vendida do Item 1: ");
            quantItem = input.nextInt();
            valorDeVendasBruto = valorDeVendasBruto + quantItem * valorItem1;
            System.out.println("Digite a quantidade vendida do Item 2: ");
            quantItem = input.nextInt();
            valorDeVendasBruto = valorDeVendasBruto + quantItem * valorItem2;
            System.out.println("Digite a quantidade vendida do Item 3: ");
            quantItem = input.nextInt();
            valorDeVendasBruto = valorDeVendasBruto + quantItem * valorItem3;
            System.out.println("Digite a quantidade vendida do Item 4: ");
            quantItem = input.nextInt();
            valorDeVendasBruto = valorDeVendasBruto + quantItem * valorItem4;
            
            // calcula e exibe o rendimento total final da semana do vendedor
            rendimento = rendimentoFixo + 0.09 * valorDeVendasBruto;
            System.out.printf("%nO redimento semanal do vendedor %d foi: R$ %.2f%n%n",
                    matricula, rendimento);
            
            //prompt para nova entrada de dados
            System.out.println("Digite a matrícula do vendedor (0 para sair): ");
            matricula = input.nextInt();
        } // fim do loop while
    } // fim do método main
} // fim da classe CalculadorDeComissaoDeVendas
