// Exercício 4.37(b): ConstanteDeNeper.java
import java.util.Scanner;

public class ConstanteDeNeper
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        Fatorial fatorial = new Fatorial(0);
        
        int numeroTermos = 0;
        int termoAtual = 0;
        double fatorialAtual;
        double e = 0;
        
        // entre a quantidade de termos para melhorar a precisão
        while(numeroTermos < 1)
        {
            System.out.println("Qual a quantidade de termos para aproximação da constante 'e'?");
            numeroTermos = input.nextInt(); // prompt para a entrada do número de termos
        }
        System.out.println(); // pula uma linha
        
        while(termoAtual < numeroTermos) // loop para calcular todos os termos
        {
            fatorialAtual = fatorial.calcFatorial(termoAtual); // calcula o fatorial do termo 
            e += (1 / fatorialAtual); // calcula a fração de cada termo e adiciona ao resultado 
            ++termoAtual; // incrementa o termo
        }
        System.out.printf("%d termos: e = %.16f%n",termoAtual, e); // exibe o resultado
    }
}