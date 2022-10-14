// Exercício 4.30: Palindromos.java
package palindromos;

import java.util.Scanner;
public class Palindromos
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner( System.in );
        
        int entrada = 0;
        int numero = 0;
        int inverso = 0;
        int contador = 1;
        int decrescente = 10000;
        boolean teste = false;
        
        while( teste == false )
        {
            System.out.print( "Digite um número de 5 dígitos: ");
            entrada = input.nextInt();
            if( entrada > 9999 )
                if( entrada < 100000 )
                {
                    numero = entrada;
                    teste = true;
                }
        }
        
        while( contador <= 5 )
        {
            inverso = inverso + ( numero % 10 ) * decrescente;
            numero /= 10;
            decrescente /= 10;
            ++contador;
        }
       
        System.out.printf( "O inverso do número digitado é: %d\n", inverso );
        System.out.println( entrada - inverso == 0 ? "O número é um palíndromo" :
                "O número não é um palíndromo" );
    }
    
}
