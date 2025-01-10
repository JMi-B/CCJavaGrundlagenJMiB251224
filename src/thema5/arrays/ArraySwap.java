package thema5.arrays;

import java.util.Arrays;

public class ArraySwap {
// Vom Doz sepberate Methode erstellt für Aufgabe 1.3
	public static void main(String[] args) {
		int [] arr = {4,2,3,0,10,-5,19};
		int index1 = 3;
		int index2 = 5;
		
			
		System.out.println("Vorher");
		System.out.println(Arrays.toString(arr));
		swap(arr, index1, index2);	
		System.out.println("Nachher:");
		System.out.println(Arrays.toString(arr));
		
		
		
	}
	// die Funktion für den Taushc mit Teporaler variable
	private static void swap(int [] arr, int index1, int index2) {
		int temp = arr[index1];
		arr [index1] = arr[index2];
		arr [index2] = temp;
	
}
}
