package oop.thema1.grundlagen.vererbung.polymorphismus;

public class SaeugetierMain {

	public static void main(String[] args) {

		Saeugetier hund = new Hund();
		hund.setName("Bello");

		Saeugetier katze = new Katze();
		katze.setName("Minka");

		// Array von Saeugetier
		Saeugetier[] saeugetiere = { hund, katze };

		// Ausgabe durch Polymorphismus
		for (Saeugetier saeugetier : saeugetiere) {
			System.out.println(saeugetier); // Aufruf von toString()
			saeugetier.macheGeraesche(); // Aufruf der Überschreibung in den Subklassen
			saeugetier.bewegeDich(); // Aufruf der Überschreibung in den Subklassen
			
			
			// Typüberprüfung mit instanceof
			if (saeugetier instanceof Hund) {
				((Hund) saeugetier).spiele(); // Cast zu Hund und Aufruf von spiele()
			} else if (saeugetier instanceof Katze) {
				((Katze) saeugetier).spiele(); // Cast zu Katze und Aufruf von spiele()
			}
		}

	}

}
