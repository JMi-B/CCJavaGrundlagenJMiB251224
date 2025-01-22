package oop.thema1.grundlagen.datenstrukturen.arraylist.BanksystemMenu;

//Import

import java.util.ArrayList;
import java.util.Random;

public class Bank {

	// Attribut
	private ArrayList<Bankkonto> konten; // null

	// Konstruktor inizalisiert konten

	public Bank() {
		konten = new ArrayList<Bankkonto>();
	}

	// Methoden

	// Neues Konto hinzufuegen

	public void kontoHinzufuegen(Bankkonto konto) {
		konten.add(konto);
		System.out.println("Das Konto mit der Kontonummer" + konto.getKontonummer() + " wurde angelegt.");
	}

// Zufällige Konten erstellen
	public void erstelleZufallskonten(int anzahl) {
		Random random = new Random();

		// SChleife
		for (int i = 0; i < anzahl; i++) {
			
			String kontonummer = String.format("%6", random.nextInt(1000000));
			
			double startguthaben = 1000 + random.nextInt(9001);
			
//			if (random.nextBoolean()) {
//				Sparkonto sparkonto = new Sparkonto(String kontonummer, String inhaber, double saldo); 
//					kontoHinzufuegen(sparkonto);
//			} else {
//				Girokonto girokonto = new Girokonto(String kontonummer, String inhaber, double saldo); 
//					kontoHinzufuegen(girokonto);
//			}
		}
	}

	// Konten anzeigen
	public void zeigeAlleKonten() {
		for (Bankkonto konto : konten) {
			System.out.println(konto);
		}
	}
}
