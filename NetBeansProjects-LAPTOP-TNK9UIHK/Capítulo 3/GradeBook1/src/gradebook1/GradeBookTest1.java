// Exercício 3.11: GradeBookTest.java
// construtor GradeBook utilizado para especificar o nome
// do curso na hora em que cada objeto GradeBook é criado.
package gradebook1;
public class GradeBookTest1
{
    // método main inicia a execução de programa
    public static void main(String[] args)
    {
        // cria objeto GradeBook
        GradeBook1 gradeBook1 = new GradeBook1(
            "CS101 Introduction to Java Programming",
            "Paul Deitel" );
        GradeBook1 gradeBook2 = new GradeBook1(
            "CS102 Data Structures in Java",
            "Harvey Deitel" );
        
        // exibe o valor final de cada GradeBook
        gradeBook1.displayMessage();
        gradeBook2.displayMessage();
    } // fim de main
} // fim da classe GradeBookTest1
