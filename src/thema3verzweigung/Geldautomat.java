package thema3verzweigung;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Geldautomat {

	
	//import java.util.Scanner;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.00");
		double kontostand = 69.69;

		double betrag = scanner.nextDouble();

		System.out.println(
				"Ihr Guthaben beträgt: " + df.format(kontostand) + " Euro. Wieviel Geld möchten Sie abheben? ");
		// double betrag = scanner.nextDouble();
		if (betrag > kontostand) {
			System.out.println("So viel Geld hast du leider nicht auf deinem Konto, du Otto.");
		} else {
			double restGuthaben = kontostand - betrag;
			System.out.println("Sie haben " + betrag + "Euro abgehoben. " + "Ihr Restguthaben beträgt " + restGuthaben
					+ ". Bleib sparsam, Bruder!");
		}

		scanner.close();

}}
