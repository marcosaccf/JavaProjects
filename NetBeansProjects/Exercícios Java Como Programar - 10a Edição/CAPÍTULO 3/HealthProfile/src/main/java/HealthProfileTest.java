// Exercício 3.17: HealthProfile.java

public class HealthProfileTest {

    public static void main(String[] args) {
        HealthProfile perfil = new HealthProfile("Marcos", "Cabral", "Masculino", 13, 07, 1975, 1.72, 73.5);

	System.out.printf("Primeiro nome: %s%n", perfil.getNome());
	System.out.printf("Sobrenome: %s%n", perfil.getSobrenome());
	System.out.printf("Sexo: %s%n", perfil.getSexo());
	System.out.printf("Data de Nascimento: %s%n", perfil.getDataDeNascimento());
	System.out.printf("Altura: %.2f m%n", perfil.getAltura());
	System.out.printf("Peso: %.3f kg%n", perfil.getPeso());
        System.out.printf("Idade: %d anos%n", perfil.getIdade());
	System.out.printf("Máxima Frequência Cardíaca: %d bpm%n", perfil.getFrequenciaCardiacaMax());
	System.out.printf("Frequência Cardíaca Alvo: %s bpm%n", perfil.getFrequenciaCardiacaAlvo());
        System.out.printf("IMC: %.2f%n", perfil.getIMC());
	perfil.getTabelaIMC();
    }  
}
