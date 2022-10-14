// Figura 5.13: ContinueTest.java
// continua instrução que termina iteração de uma instrução for.
package continuetest;
public class ContinueTest
{
    public static void main(String[] args)
    {
        for ( int count = 1; count <= 10; count++ ) // faz o loop 10 vezes
        {
            if ( count == 5 ) // se contagem for 5,
                continue; // pula o código restante no loop
            
            System.out.printf( "%d ", count );
        } // for final
        
        System.out.println( "\nUsed continue to skip printing 5" );
    } // fim de main
} // fim da classe ContinueTest
