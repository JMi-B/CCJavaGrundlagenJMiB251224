package thema2datentypen;

import java.util.Scanner;

public class RundenMath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// rundne ohne Math
		Scanner scanner = new Scanner (System.in);
		System.out.println("Zahl eingeben: ");
		double zahl = scanner.nextDouble();
		int zahlMal100 = (int) (zahl * 100.0 + 0.5);
		double zahlGerundet = zahlMal100 / 100.0;
		System.out.println("Gerunde: " + zahlGerundet);
		
		scanner.close();
		
	}

}
