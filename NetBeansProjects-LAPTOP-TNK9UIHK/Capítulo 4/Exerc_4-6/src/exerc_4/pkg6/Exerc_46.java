// Exercício 4.6: Exerc_46.java
// Calcula e imprime a soma dos inteiros de 1 a 10
package exerc_4.pkg6;

public class Exerc_46 {

    public static void main(String[] args) 
    {
        int x = 1; // inicializa x como 1 para contagem
        int sum = 0; // inicializa a soma como 0 para totalização
        
        while ( x <= 10 ) // enquanto x é menor ou igual a 10
        {
            sum += x++; // adiciona x a soma e o incrementa
        } // fim do while
        System.out.printf( "A soma é: %d\n", sum );
    } // fim de main
} // fim da classe
