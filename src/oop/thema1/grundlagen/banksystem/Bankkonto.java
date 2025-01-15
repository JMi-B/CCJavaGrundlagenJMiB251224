package oop.thema1.grundlagen.banksystem;


//Klasse

public  abstract class Bankkonto {

	//Attribute
	private String kontoNummer;
	
	protected double kontoStand;
	
	//Konstruktor
		
	//Methoden
	
	// Methoden statt setter
	// betrag ist ein Parameter
	public void einzahlen(double betrag) {
		this.kontoStand += betrag;
	}
		
	public void abheben(double betrag) {
		if(betrag <= kontoStand) {
			this.kontoStand -= betrag;
		} else {
			System.err.println("Nicht genug Guthaben!");
		}
	}
	
	// Getter
	public double getKontostand() {
		return kontoStand;
	}
	//Setter
	public void setkontoNummer(String kontoNummer) {
		this.kontoNummer = kontoNummer;
	}
	
	//Getter
	public String getkontoNummer() {
		return kontoNummer;
	}
	
	//toString
	
	@Override
	public String toString() {
		return "Bankkonto [kontonummer=" + kontoNummer + ", kontostand=" + kontoStand + "]";
	}

	

	
}


