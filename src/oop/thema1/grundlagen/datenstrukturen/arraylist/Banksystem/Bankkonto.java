package oop.thema1.grundlagen.datenstrukturen.arraylist.Banksystem;

public class Bankkonto {
	
	//Attribute
	
	private String kontonummer;
	private String inhaber;
	private double saldo;
	
	//Konstruktor
	public Bankkonto(String kontonummer, String inhaber, double saldo) {
		this.kontonummer = kontonummer;
		this.kontonummer = inhaber;
		this.saldo = saldo;
	}

	
	//GetterSetter
	
	public String getKontonummer() {
		return kontonummer;
	}

	public void setKontonummer(String kontonummer) {
		this.kontonummer = kontonummer;
	}

	public String getInhaber() {
		return inhaber;
	}

	public void setInhaber(String inhaber) {
		this.inhaber = inhaber;
	}

	public double getSlado() {
		return saldo;
	}

	public void setSlado(double saldo) {
		this.saldo = saldo;
	}
	
	@Override
	public String toString() {
		return "Kontonummer: " + kontonummer + " Inhaber" + inhaber +" Saldo" + saldo + "€";
	}
	
	

}
