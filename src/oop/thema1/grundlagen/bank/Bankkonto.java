package oop.thema1.grundlagen.bank;

public class Bankkonto {
	//Attribute
	public  String kontoNummer;
	public  double kontoStand;
	public Kunde kontoInhabe;
	
	//default Construktor
		Bankkonto(String string1, int int1, String string2){}
		
	//Methoden
	public  void einzahlen(double betrag) {
		kontoStand += betrag;
	}
	
	public void auszahlen(double betrag) {
		kontoStand -= betrag;
		
	}

	@Override
	public String toString() {
		return "Bankkonto [kontoNummer="
			+ kontoNummer + ","
			+ " kontostand="
			+ kontoStand + ","
			+ " kontoInhabe=" +
			kontoInhabe.getNameKunde()
			+ "]";
	}




}


