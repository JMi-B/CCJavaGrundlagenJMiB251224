package oop.thema1.grundlagen.bank;

public class Bankkonto {
	//Attribute
	public static String kontonummer;
	public static double kontostand;
	public static String kunde;
	
	//default Construktor
		Bankkonto(){}
		
	//Methoden
	public static void einzahlen() {
		
	}
public static void auszahlen() {
		
	}

public String toString() {
	return "Kontoinformation: Kontonummer" + kontonummer + ", Kontostand: " + kontostand + ", Kunde" + kunde;
}

}
