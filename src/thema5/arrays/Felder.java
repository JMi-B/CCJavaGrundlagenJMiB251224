package thema5.arrays;

public class Felder {

	public static void main(String[] args) {

		// Aufgabe 1.1.2 Verstehne worum es geht. Erster Teil mit ChatGPT

		// Array Länge festlegen

		int[] array = new int[20];

		// Array mit WErten füllen

		for (int i = 0; i < array.length; i++) {

			// Zufallszahl gneriert von 0 -99
			array[i] = (int) (Math.random() * 50) * 2;
			System.out.println(array[i]);// Ausgebe direkt nach der Generierung
		}

		// Array seperat auslesen und Ausgeben
		//for (int zahl : array) {
		// System.out.println(zahl);
		//	}

	}
}
