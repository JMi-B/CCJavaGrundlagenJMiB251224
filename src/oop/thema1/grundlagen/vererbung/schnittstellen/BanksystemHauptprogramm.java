package oop.thema1.grundlagen.vererbung.schnittstellen;

public class BanksystemHauptprogramm {
	 
	public static void main(String[] args) {
 
		//Objekt Sparkonto
		Sparkonto meinSparkonto = new Sparkonto();
		meinSparkonto.setKontoNummer("123456");
		meinSparkonto.einzahlen(6000);
		meinSparkonto.abrechnung();
		System.out.println(meinSparkonto);
		
		//Objekt Girokonto
		Girokonto meinGirokonto = new Girokonto();
		meinGirokonto.einzahlen(100);
		meinGirokonto.setKontoNummer("654123");
		meinGirokonto.abrechnung();
		System.out.println(meinGirokonto);
	
		
	}

	
}