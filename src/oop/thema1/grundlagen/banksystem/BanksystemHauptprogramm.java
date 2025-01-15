package oop.thema1.grundlagen.banksystem;

public class BanksystemHauptprogramm {
	 
	public static void main(String[] args) {
 
		//Objekt Sparkonto
		Sparkonto meinSparkonto = new Sparkonto();
		meinSparkonto.setkontoNummer("123456");
		meinSparkonto.einzahlen(6000);
		meinSparkonto.abheben(700);
		System.out.println(meinSparkonto);
		
		//Objekt Girokonto
		Girokonto meinGirokonto = new Girokonto();
		meinGirokonto.einzahlen(100);
		meinGirokonto.setkontoNummer("654123");
		meinGirokonto.abheben(300.0);
		System.out.println(meinGirokonto);
	
		
	}

	
}