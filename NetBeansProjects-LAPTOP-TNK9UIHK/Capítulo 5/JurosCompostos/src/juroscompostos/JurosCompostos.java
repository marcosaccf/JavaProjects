// Exercício 5.14: JurosCompostos.java
package juroscompostos;

public class JurosCompostos
{
    public static void main(String[] args)
    {
        double amount; // quantia em depósito ao fim de cada ano
        double principal; // quantidade inicial antes dos juros
        double rate; // taxa de juros
        
        for( int percent = 5; percent <= 10; percent++ )
        {
            principal = 1000.0;
            rate = (double) percent / 100;
            
            // exibe cabeçalhos
            System.out.printf( "\n%s%20s%10s \n", "Year", "Amount on deposit", "rate" );
        
            // calcula quantidade de depósito para cada um dos dez anos
            for( int year = 1; year <= 10; year++ )
            {
                // calcula nova quantidade durante ano especificado
                amount = principal * Math.pow( 1.0 + rate, year );
            
                // exibe o ano e a quantidade
                System.out.printf( "%4d%,20.2f%10s\n", year, amount, rate );
            } // fim do for interno
        } // fim do for externo
    } // fim de main
} // fim da classe JurosCompostos
