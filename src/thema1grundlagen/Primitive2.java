package thema1grundlagen;

public class Primitive2 {
	
public static void main(String[] args) {
	
	int i = 36 ;
	System.out.println( " i = " + i );

	
	
addierenUndAusgeben(10, 20);
subtraierenUndAusgeben(3, 13);
multipliezierenUndAusgeben(5, 100);
divisionUndAusgeben(144, 12);
moduleUndAusgeben(53, 5);


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

			if (zahl2 == 0) {
	System.out.println("0 ist kein gültiger Teiler");
} else {
	int ergebnis = zahl1 / zahl2;
System.out.println("Division von " + zahl1 + " und " + zahl2 + " ist " + ergebnis);}

}
public static void moduleUndAusgeben(int zahl1, int zahl2) {
int ergebnis = zahl1 % zahl2;
System.out.println("Der Rest von " + zahl1 + " und " + zahl2 + " ist " + ergebnis);
}
}
