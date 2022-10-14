/* Exercício 3.14: Date.java
Crie uma classe chamada Date que inclua três variáveis de instância — mês (tipo int), dia (tipo int)
e ano (tipo int). Forneça um construtor que inicializa as três variáveis de instância supondo que os
valores fornecidos estejam corretos. Ofereça um método set e um get para cada variável de instância.
Apresente um método displayDate que exiba mês, dia e ano separados por barras normais (/).
Escreva um aplicativo de teste chamado DateTest que demonstre as capacidades da classe Date.
 */

public class Date {
    private int dia;
    private int mes;
    private int ano;
    
    public Date(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }
    
    public void displayDate() {
        System.out.printf("%02d/%02d/%04d%n", dia, mes, ano);
    }
    
    public void setDia(int dia) {
        this.dia = dia;
    }
    
    public int getDia() {
        return dia;
    }
    
    public void setMes(int mes) {
        this.mes = mes;
    }
    
    public int getMes() {
        return mes;
    }
    
    public void setAno(int ano) {
        this.ano = ano;
    }
    
    public int getAno() {
        return ano;
    }
}
