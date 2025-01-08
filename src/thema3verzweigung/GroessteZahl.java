package thema3verzweigung;

import java.util.Scanner;

public class GroessteZahl {

	/*
	 * Aufgabe 1.3 Ausgehend von IfElse.java
	 * 
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);

		System.out.println("Gib eine Zahlen ein ");
		int zahl1 = scanner.nextInt();
		System.out.println("Gib eine Zahlen ein ");
		int zahl2 = scanner.nextInt();
		System.out.println("Gib eine Zahlen ein ");
		int zahl3 = scanner.nextInt();

//		int  groeste;

		if (zahl1 >= zahl2 && zahl1 >= zahl3) {
			System.out.println(zahl1 + "ist die größe Zahl.");
		} else if (zahl2 >= zahl3 && zahl2 >= zahl1) {
			System.out.println(zahl2 + "ist die größe Zahl.");

		} else {
			System.out.println(zahl3 + "ist die größe Zahl.");

		}
		scanner.close();
	}
}
