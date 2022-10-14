// Exercício 4.29: QuadradoDeAsteriscos.java
// Solicita um número do usuário menor que 20 e exibe um quadrado com esse lado
import java.util.Scanner; // utiliza a classe Scanner

public class QuadradoDeAsteriscos
{
    public static void main(String[] args)
    {
        // cria Scanner para obter a entrada do usuário
        Scanner input = new Scanner(System.in); 
        
        int n = 22; // cria e inicializa o lado do quadrado
        int linha = 1; // cria e inicializa linha a ser exibida
        int coluna = 1; // cria e inicializa coluna a ser exibida
        
        while (n > 21) // só permite valores menores do que 20 para o lado
        {
            // solicita a entrada do usuário
            System.out.println("Digite o tamanho do lado do quadrado (entre 1 e 20):");
            n = input.nextInt();
        } // fim do while
        
        // repete o loop enquanto a linha for menor ou igual ao lado
        while (linha <= n)
        {
            if (linha == 1) // se for a primeira linha
            {
                // exibe "n" asteriscos
                while (coluna <= n)
                {
                    System.out.print("* ");
                    ++ coluna; // incrementa a coluna
                } // fim do while
                coluna = 1; // volta para a primeira coluna
            } // fim do if
            else // se não for a primeira linha
            {
                if (linha == n) // se for a última linha
                {
                    // exibe "n" asteriscos
                    while (coluna <= n)
                    {
                        System.out.print("* ");
                        ++ coluna; // incrementa a coluna
                    } // fim do while
                    coluna = 1; // volta para a primeira linha
                } // fim do if
                else // se não for a primeira nem a última linha
                {
                    System.out.print("* "); // exibe "*" na primeira coluna
                    ++coluna; // incrementa a coluna
                    while (coluna < n) // enquanto a coluna for menor que o lado
                    {
                        System.out.print("  "); // exibe espaço na coluna
                        ++coluna; // incrementa a coluna
                    } // fim do while
                    System.out.print("* "); // exibe "*" na última coluna
                    coluna = 1; // volta para a primeira coluna
                } // fim do else
            } // fim do else
            ++linha; // incrementa a linha
            System.out.println(); // passa para a próxima linha
        } // fim do while
    } // fim do main
} // fim da classe