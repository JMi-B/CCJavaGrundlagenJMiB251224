package oop.thema1.grundlagen.bank;

public class Kunde {
	// Attribute
	
	public static String kundenID;
	public static String nameKunde;
	public static String adresse;
	
	//default Construktor
		Kunde(String string, String string2, String string3){}
	
	//Methode
	
	public String toString() {
		return "Kunde: KundenId" + kundenID + ", Name: " + nameKunde + ", Adresse" + adresse;
	}

	

}
