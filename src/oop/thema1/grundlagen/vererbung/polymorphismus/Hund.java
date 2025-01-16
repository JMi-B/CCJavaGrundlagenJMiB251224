package oop.thema1.grundlagen.vererbung.polymorphismus;

public class Hund extends Saeugetier{
	
	//Methode
	
	@Override
	public void macheGeraesche() {
		System.out.println("Wuff");
	}
	@Override
	public void bewegeDich () {
		System.out.println("läuft");
	}
	public void spiele() {
		System.out.println("Der Hund spielt mit dem Ball");


}


}
