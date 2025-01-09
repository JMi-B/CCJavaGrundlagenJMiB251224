package thema4schleifen;

import java.util.Scanner;

public class Rente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Aufgabe 1.4 mit ChatGPT
		
		//Aufruf Scanner
		 Scanner scanner = new Scanner(System.in);
		 	
		//Eingabe
		// Eingab der WErte
			System.out.println("Bitte geben sie das Kapital ein");
			double kapital = scanner.nextDouble();
			
			System.out.println("Bitte geben sie den Zinsatz ein");
			double zinssatz = scanner.nextDouble()/100;
			
			System.out.println("Bitte geben sie die Rente ein");
			double rente = scanner.nextDouble();
		
			// Prüfen ob die Werte stimmig sind
			
			if (rente <= kapital * zinssatz) {
				System.out.println("Die Rente muss größer sein als das Kapital mal dem Zinssatz");
				scanner.close();
				return;
			}

		// Berechnung
			// Zählvariable
			int jahr = 0;
			
			// Beginn Schleife
			while (kapital > 0) {
						
			//Zinsberechnung und Aktualisierung des Kapitals
				kapital += kapital * zinssatz;
				
				//Rente abziehn
				kapital -= rente;
				
				//Jahre hochzählen
				
				jahr++;
				
				// Runden und Ausgeben
				double kapitalGerundet = Math.round(kapital * 100.0) / 100.0;
				System.out.println(jahr + "\t" + kapitalGerundet + " EUR " );
				
				// Abbruch nach Verbrauch kein Negatives Kapital ausgeben
				
				if (kapital <= 0) {kapital =0;}
				
			}
		
		
		//Ausgabe der Laufzeit
			System.out.println("Das Kapital wird nach " + jahr + " Jahren aufgebraucht sein");

	}
	
}
