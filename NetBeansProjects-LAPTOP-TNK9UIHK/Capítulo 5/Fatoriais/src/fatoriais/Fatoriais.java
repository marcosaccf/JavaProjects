// Exercício 5.13: Fatoriais.java
package fatoriais;

public class Fatoriais
{
    public static void main(String[] args)
    {
        int counter;
        long fatorial;
        
        System.out.printf( "%3s\t%s = %s\n", "n!", "produto", "fatorial" );
        
        for( int number = 1; number <= 20; number++ )
        {
            fatorial = 1;
            counter = 0;
            
            System.out. printf( "%2s!\t", number );
            
            while( counter < number )
            {
                System.out.print( (number - counter) );
                if ( number - counter > 1 )
                    System.out.print( "x" );
                fatorial *= number - counter;
                ++counter;
            }
            
            System.out.printf( " = %,d%s", fatorial, "\n" );
        }
    }
}
