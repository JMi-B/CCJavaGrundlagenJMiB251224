package thema5.arrays;

import java.util.Arrays;

public class Felder3 {

	public static void main(String[] args) {

		// Aufgabe 1.1.2 Verstehne worum es geht. Dritter Teil

		// Array1 Länge festlegen

		int[] array1 = new int[5];

		// Array mit WErten füllen

		for (int i = 0; i < array1.length; i++) {

			// Zufallszahl gneriert von 0 -99
			array1[i] = (int) (Math.random() * 50) * 2;

		}
		System.out.println(Arrays.toString(array1));

		// Array2 Länge festlegen

		int[] array2 = new int[5];

		// Array mit WErten füllen

		for (int i = 0; i < array2.length; i++) {

			// Zufallszahl gneriert von 0 -99
			array2[i] = (int) (Math.random() * 100);
			Arrays.sort(array2);

		}
		System.out.println(Arrays.toString(array2));

	}
}
