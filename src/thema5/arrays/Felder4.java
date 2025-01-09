package thema5.arrays;

import java.util.Arrays;

public class Felder4 {

	public static void main(String[] args) {

		// Aufgabe 1.1.2 Verstehne worum es geht. 4. Teil = und Dubbletten raus

		// Array1 Länge festlegen

		int[] array1 = new int[20];
		
		for (int i = 0; i < array1.length; i++) {
		    int randomNumber1;
		    do {
		        randomNumber1 = (int) (Math.random() * 50) * 2; // Zufallszahl von 0 bis 100
		    } while (randomNumber1 == 0 || contains1(array1, randomNumber1));
		    array1[i] = randomNumber1;
		}


		
		System.out.println(Arrays.toString(array1));

		// Array2 Länge festlegen

		int[] array2 = new int[20];

		// Array mit WErten füllen

		for (int i = 0; i < array2.length; i++) {
			int randomNumber2;
			do {
				randomNumber2 = (int) (Math.random() * 100);
			} while (randomNumber2 == 0 || contains1(array2, randomNumber2));
			array2[i] = randomNumber2;

			Arrays.sort(array2);

		}
		System.out.println(Arrays.toString(array2));

	}

	private static boolean contains1(int[] array1, int randomNumber1) {
		// TODO Auto-generated method stub
		return false;
	}
	
	
}
