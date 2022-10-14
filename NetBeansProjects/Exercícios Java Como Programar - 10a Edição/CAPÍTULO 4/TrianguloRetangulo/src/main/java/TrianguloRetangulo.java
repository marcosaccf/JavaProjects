// Exercício 4.36: TrianguloRetangulo.java
// Determina se os três valores solicitados são lados de um triângulo retângulo.
import java.util.Scanner;

public class TrianguloRetangulo
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        double a = 0;
        double b = 0;
        double c = 0;
        boolean rightTriangle = false;
        
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
        
        if ((a*a == b*b + c*c) || (b*b == a*a + c*c) || (c*c == a*a + b*b))
            rightTriangle = true;
        
        System.out.println(rightTriangle ? "Os valores são lados de um triângulo retângulo." : 
                "Os valores não são lados de um triângulo retângulo.");
    }
}
