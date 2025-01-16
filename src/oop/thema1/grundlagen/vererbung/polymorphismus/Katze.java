package oop.thema1.grundlagen.vererbung.polymorphismus;

public class Katze extends Saeugetier{
	
	//Methode
	
	@Override
	public void macheGeraesche() {
		System.out.println("Miau");
	}
	
	@Override
	public void bewegeDich () {
		System.out.println("schleichen");
	}
	
	public void spiele() {
		System.out.println("Die Katze spielt mit einem Wollknäul");


	}

}
