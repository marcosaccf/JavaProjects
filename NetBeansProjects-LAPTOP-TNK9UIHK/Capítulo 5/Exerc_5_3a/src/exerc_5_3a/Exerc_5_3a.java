// Exerc_5_3a.java 
package exerc_5_3a;

public class Exerc_5_3a
{
    public static void main(String[] args)
    {
        int sum = 0;
        int count;
        
        for ( count = 1; count <= 9; count += 2 )
            sum += count;
        
        System.out.printf( "sum = %d\n", sum);
    } 
}
