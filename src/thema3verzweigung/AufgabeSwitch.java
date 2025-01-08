package thema3verzweigung;

import java.util.Scanner;

public class AufgabeSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Aufgabe 1.1.2 Switch-Kontrollstruktur
		 * 
		 * 1.
		 * 
		 * 2. ohne break 1
		 *
		 * Bereich 0 bis 3 Bereich 0 bis 3 Bereich 0 bis 3 Bereich 4 bis 7 Bereich 4 bis
		 * 7 Bereich 4 bis 7 Bereich 4 bis 7 Bereich 8 bis 9 Bereich 8 bis 9 ungleich 0
		 * bis 9
		 * 
		 * 
		 * Mit break; kann man verkürzen
		 */

		Scanner scanner = new Scanner(System.in);
		int zahl = scanner.nextInt();

		switch (zahl) {
		case (0):
			System.out.println("Bereich 0 bis 3");
			break;
		case (1):
//				System.out.println("Bereich 0 bis 3");
//			break;
		case (2):
//					System.out.println("Bereich 0 bis 3");
//			break;
		case (3):
			System.out.println("Bereich 0 bis 3");
			break;
		case (4):
//					System.out.println("Bereich 4 bis 7");
//			break;
		case (5):
//					System.out.println("Bereich 4 bis 7");
//			break;
		case (6):
//					System.out.println("Bereich 4 bis 7");
//			break;
		case (7):
			System.out.println("Bereich 4 bis 7");
			break;
		case (8):
//					System.out.println("Bereich 8 bis 9");
//			break;
		case (9):
			System.out.println("Bereich 8 bis 9");
			break;
		default:
			System.out.println("ungleich 0 bis 9");
		}

		scanner.close();
	}

}
