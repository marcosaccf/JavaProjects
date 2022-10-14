// Exercício 4.22: SaidaNoFormatoDeTabela.java
// Utiliza loop para imprimir uma tabela específica

public class SaidaNoFormatoDeTabela
{
    public static void main(String[] args)
    {
        int N = 1;
        
        System.out.println("N     10*N     100*N     1000*N");
        while(N <= 5)
        {
            System.out.printf("%d     %d       %d       %d\n", N, 10*N, 100*N, 1000*N);
            N++;
        }
    }
}