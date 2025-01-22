package oop.thema1.grundlagen.datenstrukturen.arraylist.BanksystemMenu;

public class Girokonto extends Bankkonto {
	 
	

	//Attibut
		private double dispoLimit = 500;
	
	//Konstruktor
	public Girokonto(String kontonummer, String inhaber, double saldo) {
		super(kontonummer, inhaber, saldo);
		// TODO Auto-generated constructor stub
	}
	@Override
	public void abrechnung(double betrag) {
		if(betrag <= saldo + dispoLimit) {
			this.saldo -= betrag;
		} else {
			System.err.println("Nicht genug Guthaben!");
		}
	}
	
	@Override
	public String toString() {
		return super.toString() + ", Dispo: " + dispoLimit + "EUR";
	}

	
	
}
