// Exercício 2.31 - Tabela.java
// Programa que cria uma tabela de quadrados e cubos de números
import java.util.Scanner;

public class Tabela
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner( System.in );
        
        int linhas;
        
        System.out.print( "Insira o tamanho da tabela: " );
        linhas = input.nextInt();
        
        System.out.printf( "%nnúmero\tquadrado\tcubo%n" );
        
        for ( int i = 0; i <= linhas; i++ )
            System.out.printf( "%d\t%d\t\t%d%n", i, i * i, i * i * i );
    }   
}