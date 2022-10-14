// Figura 5.10: GradeBookTest.java
// Cria o objeto GradeBook, insere notas e exibe relatório de notas.
package gradebook;

public class GradeBookTest
{
    public static void main( String[] args )
    {
        // cria o objeto myGradeBook da classe GradeBook e
        // passa o nome de curso para o construtor
        GradeBook myGradeBook = new GradeBook(
            "CS101 Introduction to Java Programming" );
        
        myGradeBook.displayMessage(); // exibe a mensagem welcome
        myGradeBook.inputGrades(); // lê notas fornecidas pelo usuário
        myGradeBook.displayGradeReport(); // exibe relatório baseado em notas
    } // fim de main
} // fim da classe GradeBookTest
