package oop.thema1.grundlagen.banksystem;

public class Girokonto extends Bankkonto {
	
	//Attibut
	private double dispoLimit = 500; 
	
	
	//Methode
			
	@Override
	public void abheben(double betrag) {
		if(betrag <= kontoStand + dispoLimit) {
			this.kontoStand -= betrag;
		} else {
			System.err.println("Nicht genug Guthaben!");
		}
	}
	
	@Override
	public String toString() {
		return super.toString() + ", Dispo: " + dispoLimit + "EUR";
	}
	
	
}
