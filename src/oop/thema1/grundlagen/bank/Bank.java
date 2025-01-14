package oop.thema1.grundlagen.bank;

public class Bank {
	// Statische Attribute

	private  String name; 

	private  int anzahlKonten;
	
	//default Construktor
	public Bank() {
		this.name = "Unbekannt";
	}

	// Statische Methode
	public void printBankInfo() {
		System.out.println("Name der Bank: " + name + ", die Zahl der Konten ist: " + anzahlKonten);

	//Alternative to String
	//@Override
	//publice String toString() {
		//return "Bank [nameBank=" + nameBank + ", anzahlKonton " + anzahlKonten]";
	
	}

	public  String getName() {
		return name;
	}

	public  void setName(String name) {
		this.name = name;
	}

	public int getAnzahlKonten() {
		return anzahlKonten;
	}

	public void setAnzahlKonten(int anzahlKonten) {
		this.anzahlKonten = anzahlKonten;
	}
}
