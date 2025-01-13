package oop.thema1.grundlagen;

public class Hund {

	String name;

	String rasse;

	int alter;

	String farbe;

	String geschlecht;

	// Default-Konstruktor
	Hund() {

	}

	public void bellen() {
		System.out.println("bellen");
	}

	public void familienstand() {
		if (alter > 1) {
			System.out.println("verheiratet");
		} else {
			System.out.println("noch ein kindchen");
		}
	}
}
