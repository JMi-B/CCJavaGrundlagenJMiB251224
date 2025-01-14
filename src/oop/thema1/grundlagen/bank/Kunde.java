package oop.thema1.grundlagen.bank;

public class Kunde {
	// Attribute
	
	public static String kundenID;
	public static String nameKunde;
	public static String adresse;
	
	//default Construktor
		Kunde(String string, String string2, String string3){}
	
	//Methode
	
	@Override
	public String toString() {
		return "Kunde [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}

	public static String getKundenID() {
		return kundenID;
	}

	public static void setKundenID(String kundenID) {
		Kunde.kundenID = kundenID;
	}

	public static String getNameKunde() {
		return nameKunde;
	}

	public static void setNameKunde(String nameKunde) {
		Kunde.nameKunde = nameKunde;
	}

	public static String getAdresse() {
		return adresse;
	}

	public static void setAdresse(String adresse) {
		Kunde.adresse = adresse;
	}

	

}
