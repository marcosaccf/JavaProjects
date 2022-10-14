// Exercicio 3.15: DateTest.java
package date;

import java.util.Scanner;

public class DateTest
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner( System.in );
        
        int dia;
        int mes;
        int ano;
        
        Date data = new Date( 13, 7, 1975 );
        
        data.displayDate();
       
        System.out.println("Digite o dia: ");
        dia = input.nextInt();
        data.setDia(dia);
        
        System.out.println("Digite o mês: ");
        mes = input.nextInt();
        data.setMes(mes);
        
        System.out.println("Digite o ano: ");
        ano = input.nextInt();
        data.setAno(ano);
        
        data.displayDate();
    }    
}