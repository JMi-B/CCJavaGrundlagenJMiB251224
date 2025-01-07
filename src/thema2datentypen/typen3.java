package thema2datentypen;

public class typen3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*	Aufgabe 2.4. Implizierte Typenkonverstion
 */
		
		// Dekleration
		byte b1 = 10, b2 = 20; // Mehre Variablen vom gleichen Typ in einer Zeile
		short p = 200;
		int n = 500;
		long q = 100;
		float x = 2.5f;
		double y = 5.25;
		
/*		a) Typ int der Operator + wandelt um 
 * 			b2 hat keinen Überlauf
 * 			Ergebnis 30 
 * */		
		System.out.println(b1 + b2);

/*		b) Typ Ausgebe int sobalt mit byte, short, char wandelt um in int sobalt gerechtent wirs
 * 			ERgebnis 210
 * */		
		System.out.println(p + b1);
		
/*		c) Typ int
 * 			Überlauf Ergbnis 200
 * */
			System.out.println(b1 * b2);
		
/*		d) Typ long
 * 			(q + p * (b1 + b2)) = 100 + 200 *30
 * 			Ergebnis 6100
 * */	
		System.out.println(q + p * (b1 + b2));
		
/*		e) Typ float
 * 			Ergebnis 2,5 + 100 * 500 = 50002,5 
 * */		
		System.out.println(x + q * n);
		
/*		f) Typ long
 * 			ERgebnis 
 * */		
	}

}
