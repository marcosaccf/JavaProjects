// Exercício 4.18: CalculadorLimiteCredito.java
// Determina se um cliente de uma loja de departamentos excedeu o limite
// de crédito em uma conta-corrente
package calculadorlimitecredito;

import java.util.Scanner; // programa utiliza a classe Scanner

public class CalculadorLimiteCredito
{
    public static void main(String[] args)
    {
        // cria Scanner para obter entrada a partir da janela de comando
        Scanner input = new Scanner( System.in );
        
        // inicializando as variáveis nas declarações
        int numConta;
        int saldoMensal = 0;
        int totalDebitos = 0;
        int totalCreditos = 0;
        int limite;
        
        // solicita a primeira das entradas dos usuários
        System.out.print("Digite o NÚMERO da conta (-1 para sair): ");
        numConta = input.nextInt();
        
        // faz um loop até ler o valor da sentinela inserida pelo usuário
        while( numConta != -1 )
        {
            // solicita as demais entradas dos usuários
            System.out.print("Digite o SALDO no início do mês: ");
            saldoMensal = input.nextInt();
            System.out.print("Digite o total de todos os itens COBRADOS desse cliente no mês: ");
            totalDebitos = input.nextInt();
            System.out.print("Digite o total de CRÉDITOS aplicados ao cliente no mês: ");
            totalCreditos = input.nextInt();
            System.out.print("Digite o LIMITE de crédito autorizado: ");
            limite = input.nextInt();
            
            // realiza o cálculo do novo saldo e exibe mensagens
            saldoMensal = saldoMensal - totalDebitos + totalCreditos;
            System.out.printf("O novo saldo no início do mês é: R$ %d\n", saldoMensal);
            if( saldoMensal < - limite )
                System.out.println("Limite de crédito excedido");
            
            // solicita nova entrada do usuário
            System.out.print("Digite o NÚMERO da conta (-1 para sair): ");
            numConta = input.nextInt();
        } // fim do while
    } // fim do main
    
} // fim da classe
