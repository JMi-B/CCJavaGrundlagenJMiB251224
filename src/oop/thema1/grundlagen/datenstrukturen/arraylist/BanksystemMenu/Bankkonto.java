package oop.thema1.grundlagen.datenstrukturen.arraylist.BanksystemMenu;

public abstract class Bankkonto {

	// Attribute

	private String kontonummer;
	private String inhaber;
	protected double saldo;

	// Konstruktor
	public Bankkonto(String kontonummer, String inhaber, double saldo) {
		this.kontonummer = kontonummer;
		this.kontonummer = inhaber;
		this.saldo = saldo;
	}
	// Methoden

	// Getter
	public String getKontonummer() {
		return kontonummer;
	}

	public String getInhaber() {
		return inhaber;
	}

	public double getSaldo() {
		return saldo;
	}
	// Abstracte Klasse erzwingt überschreibne in de Subklasse

	public abstract void abrechung();

	// Ausgabe
	@Override
	public String toString() {
		return "Bankkonto [Kontonummer=" + kontonummer + ", Kontostand=" + saldo + "]";
	}

}
