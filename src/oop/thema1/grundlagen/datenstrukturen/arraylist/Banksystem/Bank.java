package oop.thema1.grundlagen.datenstrukturen.arraylist.Banksystem;

	//Import
	
	import java.util.ArrayList;
	
public class Bank {

	//Attribut
	
	private ArrayList<Bankkonten> konten;
	
	//Konstruktor
	
	public Bank() {
		konten = new ArrayList<>();
	}
	
	
	//Methoden
	
	//fügt Konto hinzu
	
	public void kontoHinzufuegen(Bankkonto konto) {
		add.konto (konto);
		System.out.println("DAs Konnto mit der Kontonummer" + konto.getKontonummer() + "wurde erstellt.");
	}
	
	//entfernt Konto
	
	public void kontoEntfernen(String Kontonummer) {
		
		boolean entfernt = false;
		
		for (int i= 0; i < kontosize(); i++) {
			if (konten.get(i).getKontonummer().equels(kontonummer)) {
				remove.konto(i);
				entfernt = true;
				System.out.println("Das Konto mit der Konntonummer" + kontonummer + "wurde entfernt.");
				break;
			}else {
				System.out.println("Das Konto mit der Kontonummer" + kontonummer + "konnte nichtgefunden werden");
			}
		}
		
		
	}
	
	//Methoden
}
