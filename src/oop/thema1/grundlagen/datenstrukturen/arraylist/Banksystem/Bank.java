package oop.thema1.grundlagen.datenstrukturen.arraylist.Banksystem;

//Import

import java.util.ArrayList;


public class Bank {

	// Attribut

	private ArrayList<Bankkonto> konten; // null

	// Konstruktor inizalisiert konten

	public Bank() {
		konten = new ArrayList<Bankkonto>();
	}

	// Methoden

	// fügt Konto hinzu

	public void kontoHinzufuegen(Bankkonto konto) {
		konten.add(konto);
		System.out.println("Das Konnto mit der Kontonummer" + konto.getKontonummer() + "wurde erstellt.");
	}

	// entfernt Konto

	public void kontoEntfernen(String kontonummer) {

		boolean entfernt = false;

		for (int i = 0; i < konten.size(); i++) {
			if (konten.get(i).getKontonummer().equals(kontonummer)) {
				konten.remove(i);
				entfernt = true;
				System.out.println("Das Konto mit der Konntonummer" + kontonummer + "wurde entfernt.");
				break;

			}
		}
		if (!entfernt) {
			System.out.println("Das Konteo mit der Kontonummer " + kontonummer + "konnte nicht gefunden werden.");
		}

	}

	// Methode : Konto abrufen 
	public Bankkonto getKonto(String kontonummer) {
		for (Bankkonto konto : konten) {
			if (konto.getKontonummer().equals(kontonummer)) {
				return konto;

			}
		}
		System.out.println("Kein Konto mir der Kontonummer " + kontonummer + "gefunden");
		return null;
	}

	// Alle Konten anzeigen
	public void zeigeAlleKonten() {
		if (konten.isEmpty()) {
			System.out.println("Es sind keine Konten vorhanden.");
		}else{
			System.out.println("Liste aller Konten");
			for (Bankkonto konto : konten) {
				System.out.println(konto);
			}
		}
	}
}
