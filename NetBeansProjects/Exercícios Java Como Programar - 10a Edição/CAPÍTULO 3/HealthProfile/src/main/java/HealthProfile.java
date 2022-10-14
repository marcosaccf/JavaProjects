// Exercício 3.17: HealthProfile.java

import java.util.Calendar;

public class HealthProfile {
    private String nome;
    private String sobrenome;
    private String sexo;
    private int dia;
    private int mes;
    private int ano;
    private double altura;
    private double peso;
    
    public HealthProfile(String nome, String sobrenome, String sexo, int dia, int mes, int ano, double altura, double peso){
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.sexo = sexo;
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
        this.altura = altura;
        this.peso = peso;
    }
    
    public String getDataDeNascimento(){
		return String.format("%d/%d/%d", dia, mes,ano);
    }
               
    public int getIdade(){
        return Calendar.getInstance().get(Calendar.YEAR) - ano;
    }
    
    public int getFrequenciaCardiacaMax(){
        return 220 - getIdade();
    }
    
    public String getFrequenciaCardiacaAlvo(){
        return String.format("%.0f-%.0f", 0.5 * getFrequenciaCardiacaMax(), 0.85 * getFrequenciaCardiacaMax());
    }
    
    public double getIMC(){
        return (double) peso / (altura * altura);
    }
    
    public void getTabelaIMC(){
        System.out.println("\nCategorias de IMC:\r\nAbaixo do peso <= 18,5\r\nPeso normal = 18,5 – 24,9\r\n"
                + "Acima do peso = 25 – 29,9\r\n" + "Obesidade >= 30");
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public String getNome(){
        return nome;
    }
    
    public void setSobrenome(String sobrenome){
        this.sobrenome = sobrenome;
    }
    
    public String getSobrenome(){
        return sobrenome;
    }
    
    public void setSexo(String sexo){
        this.sexo = sexo;
    }
    
    public String getSexo(){
        return sexo;
    }
    
    public void setDia(int dia){
        this.dia = dia;
    }
    
    public int getDia(){
        return dia;
    }
    
    public void setMes(int mes){
        this.mes = mes;
    }
    
    public int getMes(){
        return mes;
    }
    
    public void setAno(int ano){
        this.ano = ano;
    }
    
    public int getAno(){
        return ano;
    }
    
    public void setAltura(double altura){
        this.altura = altura;
    }
    
    public double getAltura(){
        return altura;
    }
    
    public void setPeso(double peso){
        this.peso = peso;
    }
    
    public double getPeso(){
        return peso;
    }
}