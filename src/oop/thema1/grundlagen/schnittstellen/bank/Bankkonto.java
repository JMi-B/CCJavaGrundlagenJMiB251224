package oop.thema1.grundlagen.schnittstellen.bank;

abstract public class Bankkonto {

	// Attribute

	private String kontoNummer;

	protected double kontoStand;
	
	//Konstruktor
	

	// Methoden

	// abstract

	abstract void abrechung();

	// einzahlen

	public void einzahlen(double betrag) {
		this.kontoStand += betrag;
	}

	// GetterSetter

	public String getKontoNummer() {
		return kontoNummer;
	}

	public void setKontoNummer(String kontoNummer) {
		this.kontoNummer = kontoNummer;
	}

	public double getKontoStand() {
		return kontoStand;
	}

	public void setKontoStand(double kontoStand) {
		this.kontoStand = kontoStand;
	}

	// toString

	@Override
	public String toString() {
		return "Bankkonto [kontonummer=" + kontoNummer + ", kontostand=" + kontoStand + "]";
	}

}
