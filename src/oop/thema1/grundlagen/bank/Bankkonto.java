package oop.thema1.grundlagen.bank;

import oop.thema1.grundlagen.bank.Kunde;

public class Bankkonto {

	private String kontoNummer;
	
	private double kontoStand;
	
	private Kunde kontoInhaber;
	
	public void einzahlen(double betrag) {
		kontoStand += betrag;
	}
	
	public void abheben(double betrag) {
		if(betrag <= kontoStand) {
			kontoStand -= betrag;
		} else {
			System.err.println("Nicht genug Guthaben!");
		}
	}
	
	@Override
	public String toString() {

		return "Konto: " 
				+ kontoNummer 
				+ ", Inhaber: " 
				+ kontoInhaber.getName()
				+ ", Kontostand: " 
				+ kontoStand 
				+ " EUR"; 
	}
}


