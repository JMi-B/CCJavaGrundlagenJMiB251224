package oop.thema1.grundlagen.vererbung;

// Prince Charles
public class PrinceCharles extends QueenElizabeth {
	private String firstName = "Charles";

	public void displayFullname() {
		System.out.println("Name: " + firstName + " " + familyName);
	}
}