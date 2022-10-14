// Figura 6.15: MethodOverloadError.java
// Métodos sobrecarregados com assinaturas idênticas
// resultam em erros de compilação, mesmo que os tipos de retorno sejam diferentes.
package methodoverloaderror;
public class MethodOverloadError
{
    // declaração do método square com argumento int
    public int square( int x )
    {
        return x * x;
    }
    
    // segunda declaração do método square com argumento ont resulta
    // em erros de compilação mesmo que os tipos de rotorno sejam diferentes
    public double square( int y )
    {
        return y * y;
    }
} // fim da classe MethodOverloadError
