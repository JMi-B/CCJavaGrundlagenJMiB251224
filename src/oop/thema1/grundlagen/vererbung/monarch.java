package oop.thema1.grundlagen.vererbung;

public class monarch {
	// Superklasse

	public class Monarch {
		protected String title = "King/Queen";
		protected String familyName = "Windsor";

		public void displayInfo() {
		System.out.println("Title: " +  title + 
				"Family Name: " + familyName);
		}

		 
	}
}
