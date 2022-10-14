// Exercício 3.14: Employee.java
package employee;

public class Employee
{
    private String nomeFuncionario;
    private String sobrenomeFuncionario;
    private double salarioFuncionario;
    
    public Employee(String nome, String sobrenome, double salario)
    {
        nomeFuncionario = nome;
        sobrenomeFuncionario = sobrenome;
        salarioFuncionario = salario;
    }
    
    public void setNomeFuncionario( String nome )
    {
        nomeFuncionario = nome;
    }
    
    public void setSobrenomeFuncionario( String sobrenome )
    {
        sobrenomeFuncionario = sobrenome;
    }
    
    public void setSalarioFuncionario( double salario )
    {
        salarioFuncionario = salario;
    }
    
    public String getNomeFuncionario()
    {
        return nomeFuncionario;
    }
    
    public String getSobrenomeFuncionario()
    {
        return sobrenomeFuncionario;
    }
    
    public double getSalarioFuncionario()
    {
        return salarioFuncionario;
    }
    
    public void displaySalarioAnual()
    {
        double salarioAnual;
        
        salarioAnual = 12 * getSalarioFuncionario();
        
        System.out.printf( "O salário anual de %s %s é de R$ %.2f\n",
                getNomeFuncionario(),
                getSobrenomeFuncionario(),
                salarioAnual );
    }
}
