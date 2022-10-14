// Exercício 4.23: DoisNumerosMaiores.java
// Localiza e exibe os dois maiores números inteiros inseridos
// (Deve-se inserir ao menos dois números diferentes)

import java.util.Scanner; // o programa utiliza a classe Scanner

public class DoisNumerosMaiores
{
    public static void main(String[] args)
    {
        // cria Scanner para obter entrada a partir da janela de comando
        Scanner input = new Scanner(System.in);
        
        // inicializando as variáveis na inicialização
        int counter = 1; // contador dos valores inseridos
        int number; // número inserido
        int largest1 = -2147483648; // comparador inicial (menor inteiro permitido_
        int largest2 = -2147483648; // comparador inicial (menor inteiro permitido_
        
        // processa 10 números inseridos pelo loop
        while(counter <= 10)
        {
            // solicita ao usuário a entrada identificada pelo contador
            System.out.printf("Digite o número %d de 10:%n", counter);
            number = input.nextInt();
            
            if(number > largest1) // testa se é maior que o maior atual
            {
                largest2 = largest1; // coloca o maior atual no segundo maior
                largest1 = number; // atualiza o maior atual com o número inserido
            }
            else if(number > largest2) // senão, testa se é maior que o segundo maior
                if(number < largest1) // testa se é menor que o maior atual
                    largest2 = number; // atualiza o segundo maior com o número inserido
            counter++; // incrementa o contador
        } // fim do loop while
        
        // Exibe os resultados
        System.out.printf("%nO maior número digitado foi: %d%n", largest1);
        System.out.printf("O segundo maior número digitado foi: %d%n", largest2);
    } // fim do método main
} // fim da classe DoisNumerosMaiores
