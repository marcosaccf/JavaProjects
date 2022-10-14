// Figura 4.7: GradeBookTest2.java
// Cria o objeto da classe GradeBook2 e invoca seu método
// determineClassAverage
package gradebook2;

public class GradeBookTest2
{
    public static void main( String[] args )
    {
        // cria o objeto myGradeBook da classe GradeBook2 e
        // passa o nome de cursor para o construtor
        GradeBook2 myGradeBook = new GradeBook2(
            "CS101 Introduction to Java Programming" );
        
        myGradeBook.displayMessage(); // exibe a mensagem welcome
        myGradeBook.determineClassAverage(); // calcula a média das 10 notas
    } // fim de main
} // fim da classe GradeBookTest2
