package oop.thema1.grundlagen.schnittstellen.bank;

import oop.thema1.grundlagen.banksystem.Girokonto;
import oop.thema1.grundlagen.banksystem.Sparkonto;

public class SchnittstellenHauptprogramm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Objekt Sparkonto
				Sparkonto meinSparkonto = new Sparkonto();
				meinSparkonto.setkontoNummer("123456");
				meinSparkonto.einzahlen(6000);
				meinSparkonto.abheben(700);
				System.out.println(meinSparkonto);
	}
	//Objekt Girokonto
	Girokonto meinGirokonto = new Girokonto();
	meinGirokonto.einzahlen(100);
	meinGirokonto.setkontoNummer("654123");
	meinGirokonto.abheben(300.0);
	System.out.println(meinGirokonto);

}
