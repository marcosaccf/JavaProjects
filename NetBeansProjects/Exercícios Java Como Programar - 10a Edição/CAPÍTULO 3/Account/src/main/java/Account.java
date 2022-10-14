// Exercício 3.11: Account.java
// Classe Account Modificada com uma variável de instância balance do tipo double
// e um construtor e métodos deposit e withdraw que executam a validação

public class Account
{
    private String name; // variável de instância
    private double balance; // variável de instância

    // o construtor de Account que recebe dois parâmetros
    public Account(String name, double balance)
    {
        this.name = name; // atribui à variável de instância name

        // valida que o balance é maior que 0.0; se não for,
        // a variável de instância balance mantém seu valor inicial padrão de 0.0
        if (balance > 0.0) // se o saldo for válido
        this.balance = balance; // atribui à variável de instância balance
    }

    // método que deposita (adiciona) apenas uma quantia válida no saldo
    public void deposit(double depositAmount)
    {
        if (depositAmount > 0.0) // se depositAmount for válido
            balance = balance + depositAmount; // adiciona ao saldo
    }

    // métod que saca (subtrai) uma quantia válida no saldo
    public void withdraw(double withdrawAmount)
    {
        if (withdrawAmount > balance)
            System.out.printf("Withdraw amount exceeded account balance.%n%n");
        else if (withdrawAmount > 0.0) // se depositAmount for válido
            balance = balance - withdrawAmount; // adiciona ao saldo
    }

    //método retorna o saldo da conta
    public double getBalance()
    {
        return balance;
    }

    // método para definir o nome do objeto
    public void setName(String name)
    {
        this.name = name; // armazena o nome
    }

    // método para recuperar o nome do objeto
    public String getName()
    {
        return name; // retorna valor do nome para o chamador
    } // fim do método getName
} // fim da classe Account