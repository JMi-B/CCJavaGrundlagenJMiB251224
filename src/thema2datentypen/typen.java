package thema2datentypen;

public class typen {
	public static void main (String [] arg) {
		
				
		int x = 1;
		int y = 2;
		int z = 3;
		
		
		//2.3 a hat nichts mit den Variablen zu tun
		//nicht  mit boelaen programmiet 
		
		// 2.3 b Ausgabe Int
		System.out.println(10/3);
		
		// 2.3 c Ausgabe ist double
		System.out.println(10/3.);
		
		// 2.3 d Tertäre Operatoren vergleichen Ausgabe boolan
		System.out.println(x == y ? x > y : y < z);
		
		// 2.3 e (byte) (127 + 1)
		System.out.println((byte) (127 + 1));
		
		//2.3 f Ausgabe String
		System.out.println(x + y + "z");
		
		//2.3 g (1 || 0) Fehler der Operator || OR erwartet boolan true false keine int
		// false ist hier toter Code
		//System.out.println((1 || 0));
		System.out.println((true || false));
	}

}
