// Exercício 3.14: EmployeeTest.java
package employee;

import java.util.Scanner;

public class EmployeeTest
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        Employee funcionario1 = new Employee("nome", "sobrenome", 0.0);
        Employee funcionario2 = new Employee("nome", "sobrenome", 0.0);
        
        String nome;
        String sobrenome;
        double salario;
        double aumento;
        
        System.out.println("FUNCIONÁRIO 1:");
        
        System.out.print("Insira o nome do Funcionário: ");
        nome = input.next();
        funcionario1.setNomeFuncionario(nome);
        
        System.out.print("Insira o sobrenome do Funcionário: ");
        sobrenome = input.next();
        funcionario1.setSobrenomeFuncionario(sobrenome);
        
        System.out.print("Insira o salário mensal do Funcionário: R$ ");
        salario = input.nextDouble();
        if (salario > 0)
            funcionario1.setSalarioFuncionario(salario);
        
        System.out.println();
        
        System.out.println("FUNCIONÁRIO 2:");
        
        System.out.print("Insira o nome do Funcionário: ");
        nome = input.next();
        funcionario2.setNomeFuncionario(nome);
        
        System.out.print("Insira o sobrenome do Funcionário: ");
        sobrenome = input.next();
        funcionario2.setSobrenomeFuncionario(sobrenome);
        
        System.out.print("Insira o salário mensal do Funcionário: R$ ");
        salario = input.nextDouble();
        if (salario > 0)
            funcionario2.setSalarioFuncionario(salario);
        
        System.out.println();
        
        funcionario1.displaySalarioAnual();
        funcionario2.displaySalarioAnual();
        
        System.out.println();
        
        System.out.print( "Insira o aumento percentual: ");
        aumento = input.nextDouble();
        
        salario = funcionario1.getSalarioFuncionario() * (1 + aumento/100);
        funcionario1.setSalarioFuncionario(salario);
        
        salario = funcionario2.getSalarioFuncionario() * (1 + aumento/100);
        funcionario2.setSalarioFuncionario(salario);
        
        funcionario1.displaySalarioAnual();
        funcionario2.displaySalarioAnual();
    }
}
