// Exercício 4.18: CalculadorLimiteCredito.java
// Determina se um cliente de uma loja de departamentos excedeu o limite
// de crédito em uma conta-corrente

import java.util.Scanner; // programa utiliza a classe Scanner

public class CalculadorLimiteCredito
{
    public static void main(String[] args)
    {
        // cria Scanner para obter entrada a partir da janela de comando
        Scanner input = new Scanner( System.in );
        
        // inicializando as variáveis nas declarações
        int numConta;
        double saldoMensal;
        double totalDebitos;
        double totalCreditos;
        double limite;
        
        // solicita a primeira das entradas dos usuários
        System.out.println("Digite o NÚMERO da conta (-1 para sair): ");
        numConta = input.nextInt();
        
        // faz um loop até ler o valor da sentinela inserida pelo usuário
        while(numConta != -1)
        {
            // solicita as demais entradas dos usuários
            System.out.println("Digite o SALDO no início do mês: ");
            saldoMensal = input.nextDouble();
            System.out.println("Digite o total de todos os itens COBRADOS desse cliente no mês: ");
            totalDebitos = input.nextDouble();
            System.out.println("Digite o total de CRÉDITOS aplicados ao cliente no mês: ");
            totalCreditos = input.nextDouble();
            System.out.println("Digite o LIMITE de crédito autorizado: ");
            limite = input.nextDouble();
            
            // realiza o cálculo do novo saldo e exibe mensagens
            saldoMensal = saldoMensal - totalDebitos + totalCreditos;
            System.out.printf("O novo saldo no início do mês é: R$ %.2f%n%n", saldoMensal);
            if(saldoMensal < - limite)
                System.out.println("Limite de crédito excedido\n");
            
            // solicita nova entrada do usuário
            System.out.println("Digite o NÚMERO da conta (-1 para sair): ");
            numConta = input.nextInt();
        } // fim do while
    } // fim do main 
} // fim da classe
