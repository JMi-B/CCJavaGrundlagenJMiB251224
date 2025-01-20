package oop.thema1.grundlagen.schnittstellen.bank;

public class Girokonto implements Ueberziehbar{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Attibut
		double dispoLimit = 500; 
		
		@Override
		public void ueberziehungPruefen(double betrag) {
			if(betrag <= kontoStand + dispoLimit) {
				this.kontoStand -= betrag;
			} else {
				System.err.println("Nicht genug Guthaben!");
			}
		
		
	}

}
