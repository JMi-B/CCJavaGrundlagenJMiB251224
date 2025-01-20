package oop.thema1.grundlagen.vererbung.schnittstellen;

//Klasse

public abstract class Bankkonto {

	// Attribute
	private String kontoNummer;

	protected double kontoStand;

	// Konstruktor

	// Methoden

	// abstrakte Methode

	abstract void abrechnung();

	// betrag ist ein Parameter
	public void einzahlen(double betrag) {
		this.kontoStand += betrag;
	}

	// toString

	@Override
	public String toString() {
		return "Bankkonto [kontonummer=" + kontoNummer + ", kontostand=" + kontoStand + "]";
	}

	// SetterGetter

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

}
