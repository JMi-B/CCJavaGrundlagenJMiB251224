package oop.thema1.grundlagen.bank;

public class Bank {

//	Attribute
	
	private String name;
	
	private int anzahlKonten;

// 	Konstruktor public gleicher Name wie Klasse
	// setz Wert
	public Bank() {
		this.name = "Unbekannt";
	}
	
	public Bank(String name) {
		super();
		this.name = name;
	}

	public Bank(String name, String so) {
		super();
		this.name = name;
	}
	
	public Bank(String name, String so, int ak) {
		super();
		this.name = name;
		this.anzahlKonten = ak;
	}
	
	//Methoden
	
	// getter vorne immer ein Typ
//	keine Parameter
	// gibt mit return zurück
	// damit Main zugreifen kann
	public String getName() {
		return name;
	}
	// setter immer voit
	public void setName(String name) {
		this.name = name; //this representiert das bestimmte Obejkt
	}
	
	public int getAnzahlKonten() {
		return anzahlKonten;
	}
	
	public void setAnzahlKonten(int anzahlKonten) {
		this.anzahlKonten = anzahlKonten;
	}
	
	@Override
	public String toString() {
		return "Bank [name=" + name + ", anzahlKonten=" + anzahlKonten + "]";
	}	
	
	public void printBankInfo() {
		System.out.println("Bank: " + name);
		System.out.println("Anzahl Konten:" + anzahlKonten);
	}	
}