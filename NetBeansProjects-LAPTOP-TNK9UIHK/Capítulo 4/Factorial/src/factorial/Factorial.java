// Exercício 4.37(b): Factorial.java
package factorial;

public class Factorial
{
    private double fatorial; // variável de instência que armazena o fatorial
     
    // método construtor
    public Factorial( double initialFatorial )
    {
        fatorial = 0;
    }
    
    // calcula e retorna o fatorial do número
    public double calcFactorial( double number )
    {
        double counter = 0;
        fatorial = 1;
        
        while( counter < number )
        {
            fatorial *= number - counter;
            ++counter;
        }
        return fatorial;
    }
    
}
