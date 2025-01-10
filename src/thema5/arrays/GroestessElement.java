package thema5.arrays;

import java.util.Arrays;

public class GroestessElement {
	// Aufgabe 1.2.1
	
	public static void main(String[] args) {
		
		// Inizialisierung des Arrays
		int [] array = {27, 2 , 5 , 11, 18};
		
		
		for (int i = 0; i < array.length; i++) {
			Arrays.sort(array); // sortieren
			System.out.println(array[i]);// Ausgebe direkt nach der Generierung
		}
	}
}
