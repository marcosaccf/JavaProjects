/* Exercício 3.14: DateTest.java
Crie uma classe chamada Date que inclua três variáveis de instância — mês (tipo int), dia (tipo int)
e ano (tipo int). Forneça um construtor que inicializa as três variáveis de instância supondo que os
valores fornecidos estejam corretos. Ofereça um método set e um get para cada variável de instância.
Apresente um método displayDate que exiba mês, dia e ano separados por barras normais (/).
Escreva um aplicativo de teste chamado DateTest que demonstre as capacidades da classe Date.
 */

public class DateTest {

    public static void main(String[] args) {
        Date data = new Date(13, 7, 1975);
        
        data.displayDate();
        
        data.setDia(9);
        data.setMes(3);
        data.setAno(2021);
        
        data.displayDate();
    }
    
}
