// Exercício 4.17: QuilometragemDeCombustivel.java
package quilometragemdecombustivel;

import java.util.Scanner; // programa utiliza a classe Scanner

public class QuilometragemDeCombustivel
{
    public static void main(String[] args)
    {
        // cria Scanner para obter entrada a partir da janela de comando
        Scanner input = new Scanner( System.in );
        
        // inicializando as variáveis nas declarações
        int quilometragem;
        int litros;
        int somaKm = 0;
        int somaLitros = 0;
        double consumo;
        double consumoTotal;
        
        // solicita as entradas dos usuários
        System.out.print( "Digite a quilometragem dirigida (-1 para sair): " );
        quilometragem = input.nextInt();
        System.out.print( "Digite a quantidade de combustível em litros: " );
        litros = input.nextInt();
        
        // faz um loop até ler o valor da sentinela inserida pelo usuário
        while ( quilometragem != -1 )
        {
            somaKm += quilometragem;
            somaLitros += litros;
            consumo = (double) quilometragem / litros;
            System.out.printf( "O consumo de combustível foi de: %.2f km/l\n", consumo );
            System.out.print( "Digite a quilometragem dirigida (-1 para sair): " );
            quilometragem = input.nextInt();
            System.out.print( "Digite a quantidade de combustível em litros: " );
            litros = input.nextInt();
        }
        
        if ( somaLitros > 0 )
        {
            consumoTotal = (double) somaKm / somaLitros;
            System.out.printf( "Quilometragem combinada: %d km\n", somaKm );
            System.out.printf( "Soma total de combustível consumido: %d litros\n", somaLitros );
            System.out.printf( "Consumo médio total: %.2f km/litros\n", consumoTotal );
        }
        else
            System.out.println( "Nenhum dado foi inserido!" );
    } // fim de main
    
} // fim da classe QuilometragemDeCombustivel
