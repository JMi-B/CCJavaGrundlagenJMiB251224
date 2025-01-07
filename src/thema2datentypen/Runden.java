package thema2datentypen;

import java.util.Scanner;

public class Runden {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// rundne mit Math
		Scanner scanner = new Scanner (System.in);
		System.out.println("Zahl eingeben: ");
		double zahl = scanner.nextDouble();
		double zahlGerundet = Math.round( zahl *100.0)/100.0;
		// 2 Stellen nach dem Komma
		System.out.println("Gerunde: " + zahlGerundet);
		
		scanner.close();
		
	}

}
