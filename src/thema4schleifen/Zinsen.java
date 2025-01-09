package thema4schleifen;

import java.util.Scanner;

public class Zinsen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Aufgabe 1.3. mit ChatGPT
		 */
		// Aufruf Scanner
		Scanner scanner = new Scanner(System.in);

		// Eingab der WErte
		System.out.println("Bitte geben sie das Kabital ein");
		double kapital = scanner.nextDouble();

		System.out.println("Bitte geben sie den Zinsatz ein");
		double zinssatz = scanner.nextDouble() / 100;

		System.out.println("Bitte geben sie die Laufzeit ein");
		int laufzeit = scanner.nextInt();

		// Kopfzeile der Ausgabe Tabelle
		System.out.println("\nJahr\tKapital (inkl. Zinsen)");
		System.out.println("-----------------------------");
		System.out.println("Start\t" + kapital + " EUR");

		// Berechung mit Schleife

		for (int jahr = 1; jahr <= laufzeit; jahr++) {
			kapital = kapital + kapital * zinssatz;

			// Runden auf zwei Stellen

			double kapitalGerundet = Math.round(kapital * 100.0) / 100.0;

			// Ausgabe
			
			System.out.printf("%d \t %.2f EUR \n", jahr, kapital);
			
			

//			System.out.println(jahr + "\t" + kapitalGerundet + " EUR ");

		}
		scanner.close();
	}
}
