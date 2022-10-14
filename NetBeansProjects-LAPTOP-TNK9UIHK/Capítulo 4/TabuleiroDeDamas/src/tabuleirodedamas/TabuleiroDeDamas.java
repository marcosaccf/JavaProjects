// Exercício 4.32: TabuleiroDeDamas.java
package tabuleirodedamas;

public class TabuleiroDeDamas
{
    public static void main(String[] args)
    {
        int column = 1; // declara e inicializa a variável para colunas
        int row = 1; // declara e inicializa a variável para linhas
        
        while( row <= 8 ) // loop externo para as linhas de 1 a 8
        {
            if( row % 2 == 0 ) // testa de a linha é par
                System.out.print( " " ); // exibe a primeira casa da linha como branca
            while( column <= 8 ) // loop interno para as colunas de 1 a 8
            {
                System.out.print( "* " ); // exibe uma casa pretas e uma branca
                ++column; // incrementa a coluna
            } // fim do loop interno das colunas
            column = 1; // reinicializa as colunas
            System.out.println(); // gera um caractere de nova linha
            ++row; // incrementa a linha
        } // fim do loop externo das linhas
    } // fim do main
} // fim da classe TabuleiroDeDamas
