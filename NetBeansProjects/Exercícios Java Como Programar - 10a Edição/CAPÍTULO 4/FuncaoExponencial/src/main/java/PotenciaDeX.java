// Exercício 4.37(c): PotenciaDeX.java

public class PotenciaDeX
{
    private double potencia; // variável de instência que armazena a potência
     
    // método construtor
    public PotenciaDeX(double initialNumber, int initialPot)
    {
        potencia = 1;
    }
    
    // calcula e retorna a potência: number elevado a pot
    public double calcPotenciaDeX(double number, int pot)
    {
        double counter = 0;
        potencia = 1;
        
        while(counter < pot)
        {
            potencia *= number;
            counter++;
        }
        return potencia;
    }
}