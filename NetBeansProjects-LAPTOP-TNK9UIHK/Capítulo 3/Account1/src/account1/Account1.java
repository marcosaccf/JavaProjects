// Exercício 3.12: Account.java
// classe Account com um construtor para validar e
// inicializa a variável de instância balance do tipo double
package account1;
public class Account1
{
    private double balance; // variável de instância que armazena o saldo
    
    // construtor
    public Account1( double initialBalance )
    {
        // valida que initialBalance é maior que 0,0;
        // se não, o saldo é inicializado como o valor padrão 0.0
        if ( initialBalance > 0.0 )
            balance = initialBalance;
    } // fim do construtor Account1
    
    // credita (adiciona) uma quantia à conta
    public void credit( double amount )
    {
        balance = balance + amount; // adiciona quantia ao saldo
    } // fim do método credit
    
    // retorna o saldo da conta
    
    // debita (subtrai uma quantia da conta
    public void debit( double amount )
    {
        if ( amount > balance )
            System.out.println( "Debit amount exceeded account balance." );
        if ( amount <= balance )
            balance = balance - amount; // subtrai a quantia do saldo
    }
            
    public double getBalance()
    {
        return balance; // fornece o valor de saldo ao método chamador
    } // fim do método getBalance
} // fim da classe Account1
