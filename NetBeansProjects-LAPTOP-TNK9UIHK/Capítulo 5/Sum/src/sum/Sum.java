// Figura 5.5: Sum.java
// Somando inteiros com a instrução for.

package sum;

public class Sum
{
    public static void main(String[] args)
    {
        int total = 0; // inicializa o total
        
        // total de inteiros pares de 2 a 20
        for( int number = 2; number <= 20; number += 2 )
            total += number;
        
        System.out.printf( "Sum is %d\n", total ); // exibe os resultados
    } // fim de main    
} // fim da classe Sum
