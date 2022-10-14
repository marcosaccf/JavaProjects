// Exercício 4.35: LadosDeTriangulos.java
// Determina se os três valores solicitados são lados de um triângulo.
import java.util.Scanner;

public class LadosDeTriangulos
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        double a = 0;
        double b = 0;
        double c = 0;
        boolean triangle = false;
        
        while(a <= 0)
        {
            System.out.println("Insira um valor para o primeiro lado do triângulo:");
            a = input.nextDouble();
        }
        
        while(b <= 0)
        {
            System.out.println("Insira um valor para o segundo lado do triângulo:");
            b = input.nextDouble();
        }
        
        while(c <= 0)
        {
            System.out.println("Insira um valor para o terceiro lado do triângulo:");
            c = input.nextDouble();
        }
        
        if ((a < b + c) && (b < a + c) && (c < a + b))
            triangle = true;
        
        System.out.println(triangle ? "Os valores são lados de um triângulo." : 
                "Os valores não são lados de um triângulo.");
    }
}
