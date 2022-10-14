// Exercício 3.11: AccountTest.java
// Classe AccountTest Modificada com uma variável de instância balance do tipo double
// e um construtor e métodos deposit e withdraw que executam a validação

import java.util.Scanner;

public class AccountTest 
{
    public static void main(String[] args)
    {
        // cria um Scanner para obter entrada a partir da janela de comando
        Scanner input = new Scanner(System.in);

        // cria dois objetos Account
        Account account1 = new Account("Jane Green", 50.00);
        Account account2 = new Account("John Blue", -7.53);

        // exibe saldo inicial de cada objeto
        displayAccount(account1);
        displayAccount(account2);
        System.out.println();
        
        // usuário insere depósito para account1
        System.out.println("Enter deposit amount for account1: "); // prompt
        double depositAmount = input.nextDouble(); // obtém a entrada do usuário
        System.out.printf("%nadding %.2f to account1 balance%n%n", depositAmount);
        account1.deposit(depositAmount); // adiciona o saldo de account1

        // exibe os saldos
        displayAccount(account1);
        displayAccount(account2);
        System.out.println();

        // usuário insere depósito para account2
        System.out.println("Enter deposit amount for account2: "); // prompt
        depositAmount = input.nextDouble(); // obtém a entrada do usuário
        System.out.printf("%nadding %.2f to account2 balance%n%n", depositAmount);
        account2.deposit(depositAmount); // adiciona o saldo de account2

        // exibe os saldos
        displayAccount(account1);
        displayAccount(account2);
        System.out.println();

        // testa a realização de saque em account1
        System.out.println("Enter withdraw amount for account1: "); // prompt
        double withdrawAmount = input.nextDouble(); // obtém a entrada do usuário
        System.out.printf("%nsubtracting %.2f to account1 balance%n%n", withdrawAmount);
        account1.withdraw(withdrawAmount); // subtrai o saldo de account1

        // exibe os saldos
        displayAccount(account1);
        displayAccount(account2);
        System.out.println();

        // testa a realização de saque em account2
        System.out.println("Enter withdraw amount for account2: "); // prompt
        withdrawAmount = input.nextDouble(); // obtém a entrada do usuário
        System.out.printf("%nsubtracting %.2f to account2 balance%n%n", withdrawAmount);
        account2.withdraw(withdrawAmount); // subtrai o saldo de account2

        // exibe os saldos
        displayAccount(account1);
        displayAccount(account2);
        System.out.println();
    } // fim de main
    
    public static void displayAccount(Account accountToDisplay)
    {
         System.out.printf("%s balance: $%.2f %n", accountToDisplay.getName(), accountToDisplay.getBalance());
    }
} // fim da classe AccountTest
