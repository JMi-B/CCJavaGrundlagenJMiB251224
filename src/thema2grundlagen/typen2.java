package thema2grundlagen;

public class typen2 {
	public static void main (String [] arg) {
	// Aufgabe 2.3.2 a-h Welche Typen?	
				
		int x = 120;
		int y = 1;
		int z = 3;
		
		
/*		 a )
 * 
*		System.out.println((2147483647 + ’1’));
*		'1' is char and can't be added 
*		2147483647 is int + 1 overflow 
*		result -2147483648
*/		
		System.out.println(2147483647 + 1);
		
/*		b)
*		System.out.println((byte) 256 * 2147483648));
*		2147483648 is int out of range
*		256 is int not byte out of range
*/




	}

}
