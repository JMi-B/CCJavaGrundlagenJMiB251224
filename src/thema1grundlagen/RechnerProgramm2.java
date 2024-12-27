package thema1grundlagen;

public class RechnerProgramm2 {
	public static void main(String[] args) {
	

	/**
	* Dieses Programm dient der Erstellung eines einfachen Rechners in Java. 
	* Das ist die Lösung des Dozenten die ich überarbeitet habe
	* 
	*/
			
			addierenUndAusgeben(10, 20);
			subtraierenUndAusgeben(3, 13);
			multipliezierenUndAusgeben(5, 100);
			divisionUndAusgeben(144, 12);
			
			
		}
		
		public static void addierenUndAusgeben(int zahl1, int zahl2) {
			int ergebnis = zahl1 + zahl2;
			System.out.println("Addition von " + zahl1 + " und " + zahl2 + " ist " + ergebnis);
		}
		public static void subtraierenUndAusgeben(int zahl1, int zahl2) {
			int ergebnis = zahl1 - zahl2;
			System.out.println("Subraktion von " + zahl1 + " und " + zahl2 + " ist " + ergebnis);
		}
		public static void multipliezierenUndAusgeben(int zahl1, int zahl2) {
			int ergebnis = zahl1 * zahl2;
			System.out.println("Mulriplikation von " + zahl1 + " und " + zahl2 + " ist " + ergebnis);
		}
		

		public static void divisionUndAusgeben(int zahl1, int zahl2) {
			
			int ergebnis = zahl1 / zahl2;
			System.out.println("Division von " + zahl1 + " und " + zahl2 + " ist " + ergebnis);
		}
	}
	 

