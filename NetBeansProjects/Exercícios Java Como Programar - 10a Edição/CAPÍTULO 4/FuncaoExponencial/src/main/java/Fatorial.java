// Exercício 4.37(c): Fatorial.java

public class Fatorial
{
    private double fatorial; // variável de instância que armazena o fatorial
     
    // método construtor
    public Fatorial(double initialFatorial)
    {
        fatorial = 0;
    }
    
    // calcula e retorna o fatorial do número
    public double calcFatorial(int number)
    {
        int counter = 0;
        fatorial = 1;
        
        while(counter < number)
        {
            fatorial *= number - counter;
            ++counter;
        }
        return fatorial;
    }
}
