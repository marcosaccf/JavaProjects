// Exercício 5.12: ProdutoInteirosImpares.java
package produtointeirosimpares;
public class ProdutoInteirosImpares
{
    public static void main(String[] args)
    {
        int count;
        int product = 1;
        
        for ( count = 1; count <= 15; count += 2 )
        {
            product *= count;
        }
        
        System.out.printf( "O produtos dos números inteiros ímpares de "
                + "1 a 15 é: %d\n", product);
    }
}
