// Figura 5.12: BreakTest.java
// a instrução break sai de uma instrução for.
package breaktest;
public class BreakTest
{
    public static void main(String[] args)
    {
        int count; // variável de controle também usada depois que o loop termina
        
        for ( count = 1; count <= 10; count++ ) // faz o loop 10 vezes
        {
            if ( count == 5 ) // se contagem for 5,
                break; // termina o loop
            
            System.out.printf( "%d ", count );
        } // for final
        
        System.out.printf( "\nBroke out of loop at count = %d\n", count );
    } // fim de main
} // fim da classe BreakTest
