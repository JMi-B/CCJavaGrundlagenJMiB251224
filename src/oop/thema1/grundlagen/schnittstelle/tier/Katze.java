package oop.thema1.grundlagen.schnittstelle.tier;

public class Katze implements Tier{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public void laufen() {
		// TODO Auto-generated method stub
		System.out.println("Die Katze Läuft");
	}

	@Override
	public void fressen() {
		// TODO Auto-generated method stub
		System.out.println("Die Katze frisst");
	}
	
	public void klettern() {
		System.out.println("Die Katze klettert");
	}
}
