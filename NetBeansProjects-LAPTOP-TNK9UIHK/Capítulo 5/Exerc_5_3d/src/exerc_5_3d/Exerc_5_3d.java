// Exerc_5_3d.java

package exerc_5_3d;

public class Exerc_5_3d
{
    public static void main(String[] args)
    {
        for ( int i = 1; i <= 20; i++ )
        {
            System.out.print(i);
            
            if ( i % 5 == 0 )
                System.out.println();
            else
                System.out.print( '\t' );
        }
    }
}
