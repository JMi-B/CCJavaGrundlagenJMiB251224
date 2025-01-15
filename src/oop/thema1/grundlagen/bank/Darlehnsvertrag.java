package oop.thema1.grundlagen.bank;
//	Import
import oop.thema1.grundlagen.bank.Aktie;
import oop.thema1.grundlagen.bank.Bank;
import oop.thema1.grundlagen.bank.Kunde;

public class Darlehnsvertrag {

	

//		Atribute
		public String vertagId;
		private Kunde kontoInhaber;
		public double kreditbetrag;
		public double zinssatz;
		public int laufzeit;
		

//		 Konstruktor
		
		public Darlehen(String vertagId, Kunde kontoInhaber, double kreditbetrag, double zinssatz, int laufzeit) {
			super();
			this.vertagId = vertagId;
			this.kontoInhaber = kontoInhaber;
			this.kreditbetrag = kreditbetrag;
			this.zinssatz = zinssatz;
			this.laufzeit = laufzeit;
		}
		
//		Methoden	
		@Override
		public String toString() {
			return "Darlehen [vertagId=" + vertagId + ", kontoInhaber=" + kontoInhaber + ", kreditbetrag=" + kreditbetrag + "]";
		}
	

}
