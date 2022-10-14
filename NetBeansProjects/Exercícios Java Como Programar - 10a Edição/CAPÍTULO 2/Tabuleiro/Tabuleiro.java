// Exercício 2.27 - Tabuleiro.java
// Programa exibe um padrão de tabuleiro de damas de asteriscos

public class Tabuleiro
{
    
    public static void main(String[] args)
    {
        for( int i = 1; i <= 8; i++ ) // laço para exibir 8 linhas
        {
            if ( i % 2 == 1 )
                System.out.println( "* * * * * * * *" ); // exibe a linha ímpar
            else
                System.out.println( " * * * * * * * *" ); // exibe a linha par
        } // fim do laço for
    } // fim do método main
} // fim da classe Tabuleiro