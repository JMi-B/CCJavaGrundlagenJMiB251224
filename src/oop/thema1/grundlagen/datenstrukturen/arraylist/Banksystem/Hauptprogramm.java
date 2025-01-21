package oop.thema1.grundlagen.datenstrukturen.arraylist.Banksystem;

public class Hauptprogramm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Copy und Past aus Zeitmangel vo ChatGPT
		Bank bank = new Bank();
		// Neue Konten erstellen
        Bankkonto konto1 = new Bankkonto("12345", "Max Mustermann", 1000.0);
        Bankkonto konto2 = new Bankkonto("67890", "Erika Musterfrau", 2000.0);

        // Konten hinzufügen
        bank.kontoHinzufuegen(konto1);
        bank.kontoHinzufuegen(konto2);

        // Alle Konten anzeigen
        bank.zeigeAlleKonten();

        // Konto abrufen
        Bankkonto gefundenesKonto = bank.getKonto("12345");
        if (gefundenesKonto != null) {
            System.out.println("Gefundenes Konto: " + gefundenesKonto);
        }

        // Konto entfernen
        bank.kontoEntfernen("67890");

        // Alle Konten erneut anzeigen
        bank.zeigeAlleKonten();

        // Versuch, ein nicht existierendes Konto zu entfernen
        bank.kontoEntfernen("11111");

	}

}
