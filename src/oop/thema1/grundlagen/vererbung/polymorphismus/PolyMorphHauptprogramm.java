package oop.thema1.grundlagen.vererbung.polymorphismus;

public class PolyMorphHauptprogramm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Fahrzeug fahrzeug = new Fahrzeug();
		
		fahrzeug = new Auto();
		fahrzeug.starte();
		
		fahrzeug =new Motorad();
		
		//Prüfung ob richtiger Objekttyp
		if(fahrzeug instanceof Auto) {
			Auto auto = (Auto) fahrzeug;
			auto.klimaanlageEinschalten();
		} else {
			System.err.println("Das ist kein Auto");
		}
		
//		//casting um klimaanlage() zustarten
//		((Auto)fahrzeug).klimaanlageEinschalten();

	}

}
