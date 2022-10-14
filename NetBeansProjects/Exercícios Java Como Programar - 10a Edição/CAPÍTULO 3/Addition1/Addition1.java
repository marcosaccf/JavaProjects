/** Figura 2.7: Addition1.java
 *  Programa de adição que exibe a soma de dois números usando caixas de diálogo
 * @author marcoscabral
 */

import javax.swing.JOptionPane; // programa utiliza a classe JOptionPane

public class Addition1
{
    // método principal inicia a execução do aplicativo Java
    public static void main(String[] args) 
    {
        int sum; // define a variável sum como inteiro
        
        // lê o primeiro número fornecido pelo usuário
        String string1 = JOptionPane.showInputDialog("Digite o primeiro inteiro: ");
        int number1 = Integer.parseInt(string1); // converte string1 para int
        
        // lê o segundo número fornecido pelo usuário
        String string2 = JOptionPane.showInputDialog("Digite o segundo inteiro: ");
        int number2 = Integer.parseInt( string2 ); // converte string2 para int
        
        sum = number1 + number2; // soma os dois números e armazena em sum
        
        // cria a mensagem
        String message = String.format("A soma é: %s", sum);
        // exibe a mensagem
        JOptionPane.showMessageDialog(null, message);

    } // fim do método main
} // fim da classe Addition1