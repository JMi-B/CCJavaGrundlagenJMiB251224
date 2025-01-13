package oop.thema1.grundlagen.bank;

public class Bank {
	// Statische Attribute

	public static String nameBank;

	public static int anzahlKonten;
	
	//default Construktor
	Bank(String string){}

	// Statische Methode
	public static void printBankInfo() {
		System.out.println("Name der Bank: " + nameBank + ", die Zahl der Konten ist: " + anzahlKonten);

	}

	public static String getName() {
		return nameBank;
	}

	public static void setName(String name) {
		Bank.nameBank = name;
	}

	public static int getAnzahlKonten() {
		return anzahlKonten;
	}

	public static void setAnzahlKonten(int anzahlKonten) {
		Bank.anzahlKonten = anzahlKonten;
	}
}
