package oop.thema1.grundlagen.bank;

public class Sparkonto extends Bankkonto2 {
	
	private static double zinssatz = 0.02;
	
	public void zinsenBerechnen() {
		this.kontoStand += this.kontoStand * zinssatz;
		Sytem.out.println(meinSparkonto);
	}

	
	
}
