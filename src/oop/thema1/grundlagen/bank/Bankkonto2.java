package oop.thema1.grundlagen.bank;

import oop.thema1.grundlagen.bank.Kunde;

public  abstract class Bankkonto2 {

	private String kontoNummer;
	
	protected double kontoStand;
	
	private Kunde kontoInhaber;
	
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
	//GetterSetter 	
	}
	
//	public String getKontoNummer() {
//		return kontoNummer;
//	}
//
//	public void setKontoNummer(String kontoNummer) {
//		this.kontoNummer = kontoNummer;
//	}
//
//	public double getKontoStand() {
//		return kontoStand;
//	}
//
//	public void setKontoStand(double kontoStand) {
//		this.kontoStand = kontoStand;
//	}
//
//	public Kunde getKontoInhaber() {
//		return kontoInhaber;
//	}
//
//	public void setKontoInhaber(Kunde kontoInhaber) {
//		this.kontoInhaber = kontoInhaber;
//	}

	@Override
	public String toString() {
		return super.toString() + "Zinssatz: "= + (zinssatz *100);
	}
}


