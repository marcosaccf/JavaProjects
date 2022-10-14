// Exercício 4.6: Exercicio4_6.java
// Calcula a soma dos inteiros de 1 a 10
public class Exercicio4_6
{
    public static void main(String[] args)
    {
        int sum = 0;
        
        for(int x=1; x <= 10; x++)
        {
            sum += x;
        }
        
        System.out.printf("A soma é: %d%n", sum);
    } 
}
