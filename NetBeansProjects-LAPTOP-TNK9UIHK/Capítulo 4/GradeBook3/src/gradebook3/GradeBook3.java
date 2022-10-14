// Figura 4.9: GradeBook3.java
// Classe GradeBook que resolve o programa da média da classe
// utilizando repetição controlada por sentinela.
package gradebook3;

import java.util.Scanner; // programa utiliza a classe Scanner

public class GradeBook3
{
    private String courseName; // nome do curso que essa GradeBook representa
    
    // construtor inicializa courseName
    public GradeBook3( String name )
    {
        courseName = name; // inicializa courseName
    } // fim do construtor
    
    // método para configurar o nome do curso
    public void setCourseName( String name )
    {
        courseName = name; // armazena o nome do curso
    } // fim do método setCourseName
    
    // método para recuperar o nome do curso
    public String getCourseName()
    {
        return courseName;
    } // fim do método getCourseName
    
    // exibe uma mensagem de boas-vindas para o usuário GradeBook
    public void displayMessage()
    {
        // getCourseName obtém o nome do curso
        System.out.printf( "Welcome to the GradeBook for\n%s!\n\n", 
                getCourseName() );
    } // fim do método displayMassage
    
    // determina a média de um número arbitrário de notas
    public void determineClassAverage()
    {
        // cria Scanner para obter entrada da janela de comando
        Scanner input = new Scanner( System.in );
        
        int total; // soma as notas
        int gradeCounter; // número de notas inseridas
        int grade; // valor da nota
        double average; // número com ponto de fração decimal para a média
        
        // fase de inicialização
        total = 0; // inicializa o total
        gradeCounter = 0; // inicializa o contador de loops
        
        // fase de processamento
        // solicita entrada e lê a nota do usuário
        System.out.print( "Enter grade or -1 to quit: " );
        grade = input.nextInt();
        
        // faz um loop até ler o valor de sentinela inserido pelo usuário
        while( grade != -1 )
        {
            total = total + grade; // adiciona grade ao total
            gradeCounter = gradeCounter + 1; // incrementa counter
            
            // solicita entrada e lê a próxima nota fornecida pelo usuário
            System.out.print( "Enter grade or -1 to quit: ");
            grade = input.nextInt();
        } // fim do while
        
        // fase de término
        // se o usuário inseriu pelo menos uma nota...
        if ( gradeCounter != 0 )
        {
            // calcula a média de todas as notas inseridas
            average = (double) total / gradeCounter;
            
            // exibe o total e a média (com 2 dígitos de precisão)
            System.out.printf( "\nTotal of the %d grades entered is %d\n", 
                    gradeCounter, total );
            System.out.printf( "Class average is %.2f\n", average );
        } // fim do if
        else // nenhuma nota foi inserida, então gera mensagem apropriada
            System.out.println( "No grades were entered" );
    } // fim do método determineClassAverage
} // fim da classe GradeBook
