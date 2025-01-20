package oop.thema1.grundlagen.schnittstellen.bank;

public class Sparkonto implements Zinsfaehig{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Attribute
		
		final double zinssatz = 0.02; // 2% Zinsen
		
		// Methode
		
		
	}

	@Override
	public void zinsenBerechnen() {
		// TODO Auto-generated method stub
		this.kontoStand += this.kontoStand * zinssatz;
		}
	

	
	

}
