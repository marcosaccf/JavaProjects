/* Exercício 3.13: Employee.java
 * Crie uma classe chamada Employee que inclua três variáveis de instância — um primeiro nome (tipo String), um
sobrenome (tipo String) e um salário mensal (double). Forneça um construtor que inicializa as três variáveis de instância.
Forneça um método set e um get para cada variável de instância. Se o salário mensal não for positivo, não configure seu valor.
Escreva um aplicativo de teste chamado EmployeeTest que demonstre as capacidades da classe Employee. Crie dois objetos 
Employee e exiba o salário anual de cada objeto. Então dê a cada Employee um aumento de 10% e exiba novamente o salário
anual de cada Employee.
 */

public class Employee {
    private String nome;
    private String sobrenome;
    private double salario;
    
    public Employee(String nome, String sobrenome, double salario) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        if (salario > 0.0)
            this.salario = salario;
    }
    
    public double getSalarioAnual() {
        return 12 * salario;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String getNome() {
        return nome;
    }
    
    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }
    
    public String getSobrenome() {
        return sobrenome;
    }
    
    public void setSalario(double salario) {
        if (salario > 0.0)
            this.salario = salario;
    }
    
    public double getSalario() {
        return salario;
    }
}
