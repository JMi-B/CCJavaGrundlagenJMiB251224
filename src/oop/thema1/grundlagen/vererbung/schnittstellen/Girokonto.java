package oop.thema1.grundlagen.vererbung.schnittstellen;

public class Girokonto extends Bankkonto implements Ueberzeihung{
	
	//Attibut
	private double dispoLimit = 500; 
	
	
	//Methode
			
	@Override
	public void ueberziehungsPruefung(double betrag) {
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
