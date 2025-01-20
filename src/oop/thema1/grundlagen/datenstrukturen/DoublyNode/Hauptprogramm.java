package oop.thema1.grundlagen.datenstrukturen.DoublyNode;

public class Hauptprogramm {

	public static void main(String[] args) {
		//Erstekke eine doppelt verkettet Liste
		DoublyLinkedList list = new DoublyLinkedList();
		
		//Füge Elemente hinzu
		list.add(5);
		list.add(15);
		list.add(25);
		
		//Liste vorwärts ausgeben
		
		System.out.println("Doppelt verkettete Liste vorwärts:");
		list.displayForward();

	}

}
