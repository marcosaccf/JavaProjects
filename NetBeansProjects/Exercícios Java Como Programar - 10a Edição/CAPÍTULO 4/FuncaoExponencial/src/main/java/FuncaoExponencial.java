// Exercício 4.37(c): FuncaoExponencial.java
import java.util.Scanner;

public class FuncaoExponencial
{
    // método main inicia a execução do aplicativo Java
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        Fatorial fatorial = new Fatorial(0);
        PotenciaDeX power = new PotenciaDeX(1, 1);
        
        int x;
        int numeroTermos = 0;
        int termoAtual = 0;
        double fatorialAtual;
        double potenciaX;
        double eX = 0;
        
        // prompt para entrada dos dados
        System.out.println("Expoente (x) para a função eˆx:");
        x = input.nextInt(); // prompt para a entrada do valor de x
        
        // entre a quantidade de termos para melhorar a precisão
        while(numeroTermos <= 0)
        {
            System.out.printf("Quantidade de termos para aproximação da função eˆ%d:%n", x);
            numeroTermos = input.nextInt(); // prompt para a entrada do número de termos
        }
        System.out.println(); // pula uma linha
        
        while(termoAtual < numeroTermos) // loop para calcular todos os termos
        {
            fatorialAtual = fatorial.calcFatorial(termoAtual); // calcula o fatorial do termo
            potenciaX = power.calcPotenciaDeX(x, termoAtual); // calcula a potencia de x
            eX += (potenciaX / fatorialAtual); // calcula a fração de cada termo e adiciona ao resultado
            ++termoAtual; // incrementa o termo
        }
        System.out.printf( "%d termos: eˆ%d = %.16f\n",termoAtual, x , eX ); // exibe o resultado
    }
}