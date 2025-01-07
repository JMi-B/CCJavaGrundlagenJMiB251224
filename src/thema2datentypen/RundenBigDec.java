package thema2datentypen;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;
 

	public class RundenBigDec {
	public static void main(String[] args) {
		
 
		Scanner scanner = new Scanner(System.in);
		System.out.println("Zahl eingeben: ");
		double zahl = scanner.nextDouble();
		// Runden auf 2 Nachkommastellen
		BigDecimal bigDecimal = new BigDecimal(zahl);
		BigDecimal roundedValue = bigDecimal.setScale(2, RoundingMode.HALF_UP);
		System.out.println("Gerundet: " + roundedValue);
		
		scanner.close();
	}
}