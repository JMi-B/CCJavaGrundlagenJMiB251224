package oop.thema1.grundlagen.bank;

public class BankHauptprogramm {

	public static void main(String[] args) {
		
		Bank bank = new Bank();
		bank.setName("Sparkasse");
		System.out.println("Bank: "+ bank.getName());
		
		bank.setAnzahlKonten(2);
		bank.printBankInfo();
		
//	Kunde kunde1 = new Kunde();
//		kunde1.setName ("Max Mustermann");
		Kunde kunde2 = new Kunde("Kunde02", "Anna Meier", "Meierweg 2");
		Bankkonto konto1=new Bankkonto("123456", 1000, "Kunde01");
		Bankkonto konto2=new Bankkonto("654321", 2000, "Kunde02");
		
		//Ausgabe
		//bank.printBankInfo();// Gibt Null aus
		
		// Teil 2
		Aktie aktie1 = new Aktie("AAPL123", "Apple Inc.", 150.0);
		Aktie aktie2 = new Aktie("MSFT456", "Microsoft Corp.", 280.0);
 
		System.out.println("Aktieninformation");
		System.out.println(aktie1);
		System.out.println(aktie2);
	}

}
