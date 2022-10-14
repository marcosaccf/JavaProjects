// Exercício 3.16: HeartRatesTest.java

public class HeartRatesTest {

    public static void main(String[] args) {
        HeartRates heartRates = new HeartRates("Marcos", "Cabral", 13, 7, 1975);
                
                System.out.printf("Name: %s %s%n", heartRates.getFirstName(), heartRates.getLastName());
                System.out.printf("Date of birth: %02d/%02d/%04d%n", heartRates.getDay(), heartRates.getMonth(), 
                        heartRates.getYear());
                System.out.printf("Age: %d years%n", heartRates.getAge());
		System.out.printf("Maximum heart rate: %s bpm%n", heartRates.getMaximumHeartRate());
		System.out.printf("Target heart rate: %s bpm%n", heartRates.getTargetHeartRate());
    }
}