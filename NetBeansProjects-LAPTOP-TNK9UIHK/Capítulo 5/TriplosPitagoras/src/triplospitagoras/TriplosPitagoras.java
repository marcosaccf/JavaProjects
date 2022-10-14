// Exercício 5.21: TriplosPitagoras.java
package triplospitagoras;

public class TriplosPitagoras
{
    public static void main(String[] args)
    {
        double side1;
        double side2;
        double squareSum;
        double hypotenuse;
        int count = 1;
        
        for ( side1 = 1; side1 <= 500; side1++ )
            for ( side2 = 1; side2 <= 500; side2++ )
                for ( hypotenuse = 1; hypotenuse <= 500; hypotenuse++ )
                {
                    squareSum = Math.pow( side1, 2 ) + Math.pow( side2, 2 );
                    if ( squareSum == Math.pow( hypotenuse, 2 ) )
                        if ( side2 > side1 )
                        {
                            System.out.printf( "%3d: %3.0f %3.0f %3.0f\n", count, side1, side2, hypotenuse );
                            count++;
                        }
                }
    }
}
