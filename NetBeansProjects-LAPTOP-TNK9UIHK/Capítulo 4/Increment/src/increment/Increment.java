// Figura 4.15: Increment.java
// operadores de pré-incremento e pós-incremento.
package increment;
public class Increment {
    public static void main(String[] args) 
    {
        int c;
        
        // demonstra o operador de pós-incremento
        c = 5; // atribui 5 à variável c
        System.out.println( c ); // imprime 5
        System.out.println( c++ ); // imprime 5 e pós-incrementa
        System.out.println( c ); // imprime 6
        
        System.out.println(); // pula uma linha
        
        // demonstra o operador de pré-incremento
        c = 5; // atribui 5 à variável c
        System.out.println( c ); // imprime 5
        System.out.println( ++c ); // pré-incrementa e imprime 6
        System.out.println( c ); // imprime 6
    } // fim de main
} // fim da classe increment
