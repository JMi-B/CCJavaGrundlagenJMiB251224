package thema2datentypen;

public class typen3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*	Aufgabe 2.4. Implizierte Typenkonverstion
 */
		
		// Dekleration
		byte b1 = 10, b2 = 20;
		short p = 200;
		int n = 500;
		float x = 2.5f;
		double y = 5.25;
		
/*		a) Typ Byte
 * 			b2 hat keinen Überlauf
 * 			Ergebnis 30 
 * */		
		System.out.println(b1 + b2);

/*		b) Typ Ausgebe short
 * 			ERgebnis 210
 * */		
		System.out.println(p + b1);
		
/*		c) Typ int
 * 			Überlauf Ergbnis 200
 * 
 * */
	
		System.out.println(b1 * b2);
	}

}
