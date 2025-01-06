package thema2datentypen;

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

/*		c)  think 120 4 
*			get x 13
*/		
		System.out.println("x " + y + z);
		System.out.println("x " + (y + z));
//		System.out.println(x  + y + z);
		
/*		d) think false or error
 * 			No error
 * 			x is lager y false
 * 			false AND true are false
 * */	
		System.out.println(x < y && true);
		
/*		e) Variable not defined
 * 			get 3.0 Why?
 * 			9f is float
 * 			3d is double
 * */		
		System.out.println(9f / 3d);
		
/*		f) think 120y -3
 * 			error 'The operator - is undefined for the argument type(s) String, int'
 * 			System.out.println(x + "y" - z);
 * */		
		
		System.out.println(x + "y" +(- z));
		
/*		g) think 4.0
 * 			3f is float
 * */		
		System.out.println(1 + 3f);
		
/*		h) x not equel  -x ? No idea
 * 			? is tertärer Operator ersetz if else
 * 			if x NOT char x 
 * 			Ausgabe 1
 * 			Anpassung des Varablentyp da 2f floate ist 
 * 			1.0
 * */
		System.out.println(x != 'x'? 2f : 1);
		

	}

}
