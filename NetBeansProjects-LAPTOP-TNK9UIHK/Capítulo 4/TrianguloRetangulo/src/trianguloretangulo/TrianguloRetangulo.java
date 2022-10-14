// Exercício 4.36: TrianguloRetengulo.java
package trianguloretangulo;
import java.util.Scanner;

public class TrianguloRetangulo
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner( System.in );
        
        double a = 0;
        double b = 0;
        double c = 0;
        boolean rectangle = true;
        
        while( a <= 0)
        {
            System.out.print( "Digite o valor do primeiro lado do triângulo: ");
            a = input.nextDouble();
        }
        
        while( b <= 0)
        {
            System.out.print( "Digite o valor do segundo lado do triângulo: ");
            b = input.nextDouble();
        }
        
        while( c <= 0)
        {
            System.out.print( "Digite o valor do primeiro lado do triângulo: ");
            c = input.nextDouble();
        }
        
        if( a * a + b * b != c * c )
            if( b * b + c * c != a * a )
                if( a * a + c * c != b * b )
                    rectangle = false;
        
        System.out.println( rectangle ? "O triângulo é retângulo." :
                "O triângulo não é retângulo.");
    }
    
}
