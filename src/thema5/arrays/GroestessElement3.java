package thema5.arrays;

import java.util.Arrays;

public class GroestessElement3 {
	// Aufgabe 1.2.1 Neuer Ansatz weil Array.sort mich nicht weiter bringt Mit Index
	
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
		System.out.println("Das gößste Element ist: " + groesste);
	}
}
