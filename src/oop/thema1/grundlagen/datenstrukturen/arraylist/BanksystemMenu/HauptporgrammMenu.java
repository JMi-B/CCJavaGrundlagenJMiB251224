package oop.thema1.grundlagen.datenstrukturen.arraylist.BanksystemMenu;


public class HauptporgrammMenu {

	public static void main(String[] args) {
		
		Bank bank = new Bank();
		bank.erstelleZufallskonten(5);
		
		System.out.println("Alle Konten");
		bank.zeigeAlleKonten();
	}

}
