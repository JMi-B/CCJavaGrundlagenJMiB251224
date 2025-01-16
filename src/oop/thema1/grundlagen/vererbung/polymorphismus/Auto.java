package oop.thema1.grundlagen.vererbung.polymorphismus;

public class Auto extends Fahrzeug {

	@Override
	public void starte() {
		System.out.println("Auto.starte()aufgerufen");
		}
	
	public void klimaanlageEinschalten() {
		System.out.println("Klimaanlage gestartet");
	}
}
