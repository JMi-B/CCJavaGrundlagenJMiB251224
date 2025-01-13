package oop.thema1.grundlagen;

public class Auto {
	// Klassenattribut
	public final static int ANZAHL_REIFEN = 4;
//Objektattribute
	private String marke;

	private String modell;
	private int baujahr;

	// DefaultKonstruktor
	Auto() {
		this.baujahr = 1000;
	}

	public Auto(String marke, String modell, int baujahr) {
		super();
		this.marke = marke;
		this.modell = modell;
		this.baujahr = baujahr;
	}
	// ObjektMethode

	public void fahren() {
		System.out.println(marke + " " + modell + " fährt und hat " + ANZAHL_REIFEN + " Reifen");
	}

	@Override
	public String toString() {
		return "Auto: Marke=" + marke + ", Modell=" + modell + ", Baujahr=" + baujahr;
	}

	// Klassenmethode
	public static void info() {
		System.out.println("Standard Auto mit " + ANZAHL_REIFEN + " Reifen");
	}

	public String getMarke() {
		return marke;
	}

	public void setMarke(String marke) {
		this.marke = marke;
	}

	public String getModell() {
		return modell;
	}

	public void setModell(String modell) {
		this.modell = modell;
	}

	public int getBaujahr() {
		return baujahr;
	}

	public void setBaujahr(int baujahr) {
		this.baujahr = baujahr;
	}

}
