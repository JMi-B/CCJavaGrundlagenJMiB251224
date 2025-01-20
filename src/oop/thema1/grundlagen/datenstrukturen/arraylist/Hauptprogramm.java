package oop.thema1.grundlagen.datenstrukturen.arraylist;

public class Hauptprogramm {

	public static void main(String[] args) {
		// Erstelle eine neu verkettet Liste
		
		SinglyLinkedList list = new SinglyLinkedList();
		
		// Füge Elemente hinzu
		list.add(10);
		list.add(20);
		list.add(30);
	
	
	//Zeige die List an
	
	System.out.println("Inhalt der einfach " + "verketten Liste");
	
	list.display();
	 
}

}
