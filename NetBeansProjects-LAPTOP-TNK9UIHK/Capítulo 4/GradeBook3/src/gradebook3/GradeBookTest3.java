// Figura 4.10: GradeBookTest3.java
// Cria o objeto da classe GradeBook e invoca seu método determineClassAverage
package gradebook3;

public class GradeBookTest3 
{
    public static void main( String[] args )
    {
        // cria o objeto myGradeBook da Classe GradeBook3 e
        // passa o nome de cursor para o construtor
        GradeBook3 myGradeBook = new GradeBook3(
            "CS101 Introduction to Java Programming" );
        
        myGradeBook.displayMessage(); // exibe a mensagem welcome
        myGradeBook.determineClassAverage(); // calcula a média
    } // fim de main
} // fim da classe GradeBookTest3
