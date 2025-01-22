package oop.thema1.grundlagen.datenstrukturen.HashSet;

import java.util.HashSet;

public class HashSetExample {

	public static void main(String[] args) {
		
		//HashSet erstellen
		
		HashSet<String> fruits = new HashSet<>();
		
		//Elemente hinzufügen
		fruits.add("Apfel");
		fruits.add("Banane");
		fruits.add("Orange");
		fruits.add("Apfel");//Duplikat wird ignoriert
		
		//Elemente ausgeben
		System.out.println("Früchte: " +fruits);
		
		//Prüfen obe Lement existiert
		if(fruits.contains("Banane")) {
			System.out.println("Banane ist da");
		}
		
		//Entfernen
		
		fruits.remove("Orange");
		
		// Nahc entfernen Anzeigen
		
		System.out.println(" Früchte nach entferne" + fruits);
		

	}

}
