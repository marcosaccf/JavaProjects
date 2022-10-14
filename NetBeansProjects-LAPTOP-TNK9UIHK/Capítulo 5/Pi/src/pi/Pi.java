// Exercício 5.20: Pi.java
package pi;

public class Pi
{
    public static void main(String[] args)
    {
        double contPos = 1;
        double contNeg = 3;
        int termos = 1;
        double pi = 0;
        
        while ( termos <= 500000 )
        {
            pi = pi + ( 4 / contPos ) - ( 4 / contNeg );
            contPos += 4;
            contNeg += 4;
            termos++;
        }
        System.out.printf( "\npi = %.20f\n", pi );
    }
}
