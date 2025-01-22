package oop.thema1.grundlagen.datenstrukturen.arraylist.BanksystemMenu;

public class Sparkonto extends Bankkonto {
	 
	

	private final double zinssatz = 0.02; // 2% Zinsen
	
	//Konstruktor
	public Sparkonto(String kontonummer, String inhaber, double saldo) {
		super(kontonummer, inhaber, saldo);
		// TODO Auto-generated constructor stub
	}
	@Override
	public void abrechung() {
		this.saldo += this.saldo * zinssatz;
	}
	
	@Override
	public String toString() {
		return super.toString() + ", Zinsatz: " + (zinssatz * 100) + "%";
	}

	
	
}
