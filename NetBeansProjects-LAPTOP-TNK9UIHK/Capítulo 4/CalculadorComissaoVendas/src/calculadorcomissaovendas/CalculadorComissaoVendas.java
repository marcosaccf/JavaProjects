// Exercício 4.19: CalculadorComissaoVendas.java
// Calcula e exibe a comissão de vendas de um vendedor
package calculadorcomissaovendas;

import java.util.Scanner; // programa utiliza a classe Scanner
public class CalculadorComissaoVendas
{
    public static void main(String[] args)
    {
        // cria Scanner para obter entrada a partir da janela de comando
        Scanner input = new Scanner(System.in);
        
        // inicializando as variáveis nas declarações
        int item = 0;
        double value = 0;
        double soma = 0;
        double comissao = 0.09;
        double rendimento = 0;
        
        // Solicita entrada do usuário
        System.out.println("Digite o valor de cada item vendido \n"
                + "(Digite \"-1\" para sair!)\n");
        System.out.println("Item     Valor");
        // Insere e calcula novos itens até a sentinela ser inserida
        while(value != -1)
        {
            soma += value;
            item++;
            System.out.printf("%d        ", item);
            value = input.nextDouble();
        }
        
        // cálculo dos rendimentos
        rendimento = 200 + comissao * soma;
        
        // exibe resultados
        System.out.printf("\nO valor total das vendas foi: R$ %.2f\n", soma);
        System.out.printf("O valor dos rendimentos a ser recebido é R$ %.2f\n", rendimento);
    }
    
}
