// Figura 5.2: ForCOunter.java
// Repetição controlada por contador com a instrução de repetição for.

package forcounter;

public class ForCounter
{
    public static void main(String[] args)
    {
        // cabeçalho da instrução for inclui inicialização
        // condição de continuação do loop e incremento
        for( int counter = 1; counter <= 10; counter++ )
            System.out.printf( "%d ", counter );
        
        System.out.println(); // imprime uma nova linha
    } // imprime uma nova linha    
} // fim da classe ForCounter
