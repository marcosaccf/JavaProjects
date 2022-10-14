/* Exercício 3.13: EmployeeTest.java
Crie uma classe chamada Employee que inclua três variáveis de instância — um primeiro nome (tipo String), um
sobrenome (tipo String) e um salário mensal (double). Forneça um construtor que inicializa as três variáveis de instância.
Forneça um método set e um get para cada variável de instância. Se o salário mensal não for positivo, não configure seu valor.
Escreva um aplicativo de teste chamado EmployeeTest que demonstre as capacidades da classe Employee. Crie dois objetos 
Employee e exiba o salário anual de cada objeto. Então dê a cada Employee um aumento de 10% e exiba novamente o salário
anual de cada Employee.
 */

public class EmployeeTest {
    public static void main(String[] args) {
        Employee employee1 = new Employee("José", "Silva", 1000.0);
        Employee employee2 = new Employee("Maria", "Santos", 1500.0);
        
        System.out.printf("EMPREGADO 1: %nNome: %s %s%nSalário Anual: $%,.2f%n%n", employee1.getNome(), 
                employee1.getSobrenome(), employee1.getSalarioAnual());
        System.out.printf("EMPREGADO 2: %nNome: %s %s%nSalário Anual: $%,.2f%n%n", employee2.getNome(),
                employee2.getSobrenome(), employee2.getSalarioAnual());
        
        employee1.setSalario(employee1.getSalario() * 1.10);
        employee2.setSalario(employee2.getSalario() * 1.10);
        
        System.out.println("\nNOVOS SALÁRIOS APÓS AUMENTO\n");
        System.out.printf("EMPREGADO 1: %nNome: %s %s%nSalário Anual: $%,.2f%n%n", employee1.getNome(), 
                employee1.getSobrenome(), employee1.getSalarioAnual());
        System.out.printf("EMPREGADO 2: %nNome: %s %s%nSalário Anual: $%,.2f%n%n", employee2.getNome(),
                employee2.getSobrenome(), employee2.getSalarioAnual());
    }
}
