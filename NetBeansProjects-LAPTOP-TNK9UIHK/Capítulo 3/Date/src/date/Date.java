// Exercício 3.15: Date.java
package date;

public class Date
{
    private int dia;
    private int mes;
    private int ano;
    
    public Date(int recebeDia, int recebeMes, int recebeAno)
    {
        dia = recebeDia;
        mes = recebeMes;
        ano = recebeAno;    
    }
    
    public void setDia( int recebeDia )
    {
        dia = recebeDia;
    }
    
    public int getDia()
    {
        return dia;
    }
    
    public void setMes( int recebeMes )
    {
        mes = recebeMes;
    }
    
    public int getMes()
    {
        return mes;
    }
    
    public void setAno( int recebeAno )
    {
        ano = recebeAno;
    }
    
    public int getAno()
    {
        return ano;
    }
    
    public void displayDate()
    {
        System.out.printf( "A data atual é %s/%s/%s.\n", 
                getDia(),
                getMes(),
                getAno() );
    }
}
