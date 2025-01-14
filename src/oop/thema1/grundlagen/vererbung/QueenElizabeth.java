package oop.thema1.grundlagen.vererbung;

public class QueenElizabeth extends monarch {
	private String responsibility = "Head of State";
	protected int anzahlAutos = 5;

	public void displayResponsibilities() {
		System.out.println("Responsibility: " + responsibility);
	}
}
