package oop.thema1.grundlagen.vererbung;

//Prince George
public class PrinceGeorge extends PrinceWilliam {
	private int anzahlFliegendeAutos = 9;

	public void displayAutos () 
		{ System.out.println(“AnzahlAutos: " +  (anzahlAutos + anzahlFliegendeAutos));
		}
}