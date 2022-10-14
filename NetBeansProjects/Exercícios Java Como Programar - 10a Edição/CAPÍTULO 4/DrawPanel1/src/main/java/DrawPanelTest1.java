// Figura 4.20: DrawPanelTest1.java
// Exercício 4.1 (a)
import javax.swing.JFrame;

public class DrawPanelTest1
{
    public static void main(String[] args)
    {
        // cria um painel que contém nosso desenho
        DrawPanel1 panel = new DrawPanel1();
        
        // cria um novo quadro para armazenar o painel
        JFrame application = new JFrame();
        
        // configura o frame para ser encerrado quando ele é fechado
        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        application.add(panel); // adiciona o painel ao frame
        application.setSize(250, 250); // configura o tamanho do frame
        application.setVisible(true); // torna o frame visível
    }
}
