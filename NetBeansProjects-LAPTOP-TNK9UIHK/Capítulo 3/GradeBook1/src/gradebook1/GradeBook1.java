// Exercício 3.11: GradeBook1.java
// Classe GradeBook (Modificada) com um construtor para inicializar
// o nome de um curso.
package gradebook1;
public class GradeBook1
{
    private String courseName; // nome do curso para esse GradeBook
    private String instructorName; // nome do instrutor para esse GradeBook
    
    // o construtor inicializa courseName com o argumento String
    public GradeBook1( String cName, String iName )
    {
        courseName = cName; // inicializa courseName
        instructorName = iName; // inicializa instructorName
    } // fim do construtor
    
    // método para configurar o nome do curso
    public void setCourseName( String cName )
    {
        courseName = cName; // armazena o nome do curso
    } // fim do método setCourseName
    
    // método para recuperar o nome do curso
    public String getCourseName()
    {
        return courseName;
    } // fim do método getCourseName
    
    // método para configurar o nome do instrutor
    public void setInstructorName( String iName )
    {
        instructorName = iName; // armazena o nome do instrutor
    } // fim do método setInstructorName
    
    // método para recuperar o nome do instrutor
    public String getInstructorName()
    {
        return instructorName;
    } // fim do método getInstructorName
    
    // exibe uma mensagem de boas-vindas para o usuário GradeBook
    public void displayMessage()
    {
        // essa instrução chama getCourseName para obter o
        // nome do curso que esse GradeBook representa
        System.out.printf( "Welcome to the GradeBook for \n%s!\n", 
                getCourseName() );
        // essa instrução chama getInstructorName para obter o
        // nome do instrutor que esse GradeBook representa
        System.out.printf( "This course is presented by: \n%s.\n\n", 
                getInstructorName() );
    } // fim do método displayMessage
} // fim da classe GraBook1