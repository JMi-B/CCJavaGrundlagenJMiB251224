package thema1grundlagen;

public class Eingaben {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	

java.util.Scanner sc = new java.util.Scanner(System.in );
// sc.useLocale ( new java . util.Locale ("en") ) ; // *)
System.out.print(" String: ");
String st = sc.next ( ) ;
System.out.println( st ) ;
//System.out.print(" Byte: ");
//byte b = sc.nextByte ( ) ;
//Stystem.out.println ( b ) ;
short s = sc.nextShort ( ) ;
int n = sc.nextInt ( ) ;
long l = sc.nextLong ( ) ;
float f = sc.nextFloat ( ) ;
double d = sc.nextDouble ( ) ;
boolean bl = sc.nextBoolean ( ) ;
sc.close ( ) ;
// f a l l s d i e s u n t e r b l e i b t e r f o l g t nur Warnung
}
}