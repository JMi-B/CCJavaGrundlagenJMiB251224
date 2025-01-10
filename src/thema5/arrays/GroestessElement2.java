package thema5.arrays;

import java.util.Arrays;

public class GroestessElement2 {
	// Aufgabe 1.2.1 Neuer Ansatz weil Array.sort mich nicht weiter bringt 
	
	public static void main(String[] args) {
		
		//  Arrays
		int [] zahlen = {27, 2 , 5 , 11, 18};
		
		// das größte Element initialisieren
		
		int groesste = zahlen[0];
		
		//Schleife um es zu finden 
		
		
		for (int zahl : zahlen) {
			if (zahl > groesste) {
				groesste = zahl;
			}
			
		}
		System.out.println(Arrays.toString(zahlen));
		System.out.println("Das gößste Element ist: " + groesste);
	}
}
