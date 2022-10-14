// Exercício 5.18: JurosCompostosModificado.java
package juroscompostosmodificado;

public class JurosCompostosModificado
{
    public static void main(String[] args)
    {
        double amount; // quantia em depósito ao fim de cada ano
        double amountInt;
        double amountCent;
        double principal; // quantidade inicial antes dos juros
        double rate = 5; // taxa de juros
        double percent;
        
        principal = 100000;
        percent = 100;
            
        // exibe cabeçalhos
        System.out.printf( "\n%s%23s%10s \n", "Year", "Amount on deposit", "rate" );
        
        // calcula quantidade de depósito para cada um dos dez anos
        for( int year = 1; year <= 10; year++ )
        {
            // calcula nova quantidade durante ano especificado
            amount = principal * Math.pow( 100 + rate, year );
            amount /= percent;
            percent *= 100;
            
            // separa os inteiros e os centavos
            amountCent = amount % 100;
            if ( amount % 100 < 50 )
                amountInt = amount / 100;
            else
                amountInt = amount / 100 - 1;
            
            // exibe os resultados
            System.out.printf( "%4d%,20.0f,%.0f%10.0f\n", year, amountInt, amountCent, rate );
        } // fim do for interno
    } 
}
