// Exercício 2.31 - Tabela.java
// Programa que cria uma tabela de quadrados e cubos de números
package tabela;

import java.util.Scanner;

public class Tabela
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner( System.in );
        
        int linhas;
        
        System.out.print( "Insira o tamanho da tabela: " );
        linhas = input.nextInt();
        
        System.out.println( "\nnúmero   quadrado   cubo" );
        
        for ( int i = 0; i <= linhas; i++ )
            System.out.printf( "%d        %d          %d\n", i, i * i, i * i * i );
    }
    
}
