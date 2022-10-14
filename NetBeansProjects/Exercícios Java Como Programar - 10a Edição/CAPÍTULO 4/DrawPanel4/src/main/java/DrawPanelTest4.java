// Figura 4.21: DrawPanelTest4.java
// Criando JFrame para exibir um DrawPanel.
import javax.swing.JFrame;

public class DrawPanelTest4
{
    public static void main(String[] args)
    {
        // cria um painel que contém nosso desenho
        DrawPanel4 panel = new DrawPanel4();

        // cria um novo quadro para armazenar o painel
        JFrame application = new JFrame();

        // configura o frame para ser encerrado quando ele é fechado
        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        application.add(panel); // adiciona o painel ao frame
        application.setSize(250, 250); // configura o tamanho do frame
        application.setVisible(true); // torna o frame visível
    } // fim do método main
} // fim da classe DrawPanelTest4