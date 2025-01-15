package oop.thema1.grundlagen.banksystem;

public class Sparkonto extends Bankkonto {
	 
	private final double zinssatz = 0.02; // 2% Zinsen
	
	//Konstruktor
	
	public void zinsenBerechnen() {
		this.kontoStand += this.kontoStand * zinssatz;
	}
	
	@Override
	public String toString() {
		return super.toString() + ", Zinsatz: " + (zinssatz * 100) + "%";
	}

	
	
}
