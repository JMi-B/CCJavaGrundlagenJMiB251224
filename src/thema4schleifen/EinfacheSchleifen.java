package thema4schleifen;

public class EinfacheSchleifen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*AufgabenZettel 1 Schleifen
		 * 	1.1.Einfache Programmierung 
		 * */
		
		// 1. Die Wert von 1 bis 10 werden ausgegen
		
		int i = 0;
		while (i < 10) {
			i++;
			System.out.print("Wert = " + i + " ");
		}
		
		//2. und 3. Theoretisch muss d = unendlich sein oder Not a Number
		//Wie wird das programiert
		
		/*double d = Double.POSITIVE_INFINITY;
		* while (d == d + 1);
		* System.out.print("läuft");
*/
		//4. 
		
		int n, a=5; // 1
		 //while( a<10 ) { n = 1; a++ ; } // 2 n not initialized
		do{ n = 1 ; a++ ; } while( a<10 ) ; // 3 läuft durch
		// for( int i=0; i<10; i++ ){ n = 10 ; } // 4 duplicat variable i
		int b = n; // 5
		
		// 
	}

}
