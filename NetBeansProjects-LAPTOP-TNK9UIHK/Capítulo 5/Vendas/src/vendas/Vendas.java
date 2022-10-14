// Exercício 5.17: Vendas.java
// Programa de caixa para venda de até 5 produtos com preços fixos
// Autor: Marcos Artur da Costa Cabral Filho

package vendas;
import java.util.Scanner; // programa utiliza a classe Scanner
public class Vendas
{
    public static void main(String[] args)
    {
        // cria Scanner para obter entrada a partir da janela de comando
        Scanner input = new Scanner( System.in );
        
        // variáveis inteiras para armazenar as quantidades dos produtos
        int totalQuant, quant1 = 0, quant2 = 0, quant3 = 0, quant4 = 0, quant5 = 0;
        // variáveis de ponto flutuante para armazenar os totais dos preços
        double total, total1 = 0, total2 = 0, total3 = 0, total4 = 0, total5 = 0;
        // variáveis inteiras para armazenar as entradas do usuário
        int numeroProd = 10, quantProd = 0;
        
        System.out.print( "TABELA DE PREÇOS UNITÁRIOS:\n\n" +
                "produto 1\tR$ 2,98\n" +
                "produto 2\tR$ 4,50\n" +
                "produto 3\tR$ 9,98\n" +
                "produto 4\tR$ 4,49\n" +
                "produto 5\tR$ 6,87\n" ); // exibe a tabela dos preços unitários
        
        // faz loop até o usuário inserir o valor 0 para o número do produto
        while ( numeroProd != 0 )
        {
            // solicita e armazena o número do produto
            System.out.print( "\nInsira o número do produto (0 para sair): " );
            numeroProd = input.nextInt();
            
            // se o número do produto é válido, solicita e armazena a quantidade vendida
            if ( (numeroProd > 0) && (numeroProd <= 5) )
            {
                System.out.printf( "Insira a quantidade vendida do produto %d: ", numeroProd );
                quantProd = input.nextInt();
            }
            
            // determina a quantidade e o valor para cada tipo de produto
            switch ( numeroProd )
            {
                case 0:
                    System.out.println( "Fim" );
                    break;
                case 1:
                    quant1 += quantProd;
                    total1 += ( quantProd * 2.98 );
                    break;
                case 2:
                    quant2 += quantProd;
                    total2 += ( quantProd * 4.50 );
                    break;
                case 3:
                    quant3 += quantProd;
                    total3 += ( quantProd * 9.98 );
                    break;
                case 4:
                    quant4 += quantProd;
                    total4 += ( quantProd * 4.49 );
                    break;
                case 5:
                    quant5 += quantProd;
                    total5 += ( quantProd * 6.87 );
                    break;
                default:
                    System.out.println( "Entrada inválida!" );
            }
        }
        
        // calcula os totais
        totalQuant = quant1 + quant2 + quant3 + quant4 + quant5;
        total = total1 + total2 + total3 + total4 + total5;
        
        // exibe os resultados
        System.out.println( "\nCÁLCULO DAS VENDAS\n" );
        System.out.printf( "produto 1%10d unid.\tR$ %,.2f\n" +
            "produto 2%10d unid.\tR$ %,.2f\n" +
            "produto 3%10d unid.\tR$ %,.2f\n" +
            "produto 4%10d unid.\tR$ %,.2f\n" +
            "produto 5%10d unid.\tR$ %,.2f\n\n", 
            quant1, total1, quant2, total2, quant3, total3, quant4, total4,
            quant5, total5 );
        System.out.printf( "TOTAL VENDAS: %5d unid.\tR$ %,.2f\n", totalQuant, total );  
    }  
}
