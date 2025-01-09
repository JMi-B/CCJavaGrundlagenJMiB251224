package thema5.arrays;

public class SummeElemente {

	public static void main(String[] args) {
		
// Aufaben Arrays 1.1 Einfache Programierung
		// 1. Vom Dozenten

		int [] numbers = {2 , 5 , 11, 18};
		
		int sum = 0;
		
		for (int i = 0; i < numbers.length; i++) {
			// sum = sum + numbers[i];
			sum += numbers[i];
		}
		
		System.out.println("Die Summe der Zahl im Array beträgt: " + sum);
	}

}
