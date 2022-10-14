
package fatorial;

public class Fatorial
{
    public static void main(String[] args)
    {
        int counter;
        long fatorial;
        
        for( int number = 1; number <= 20; number++ )
        {
            fatorial = 1;
            counter = 0;
            
            while( counter < number )
            {
                fatorial = fatorial * (number - counter);
                counter = counter + 1;
            }
            
            System.out.println( number + "! " + fatorial );
        }
    }
}
