// Exercício 4.35: LadosDeTriangulo.java
package ladosdetriangulo;
import java.util.Scanner;

public class LadosDeTriangulo
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner( System.in );
        
        double a = 0;
        double b = 0;
        double c = 0;
        boolean triangle = false;
        
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
        
        if( a + b > c )
            if( b + c > a )
                if( a + c > b )
                    triangle = true;
        
        System.out.println( triangle ? "O triângulo existe." :
                "O triângulo não existe.");
    } 
}
