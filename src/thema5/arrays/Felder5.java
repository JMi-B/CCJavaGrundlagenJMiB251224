package thema5.arrays;

import java.util.Arrays;

//Lösung mit Dozent

public class Felder5 {

	public static void main(String[] args) {

		

		int[] feld1 = new int[20];
		int[] feld2 = new int[20];

		for (int i = 0; i < feld1.length; i++) {
			feld1[i] = (int) (Math.random() *50) *2;
			feld2[i] = (int) (Math.random() *100) ;//geht weil beide arrays gelich lang sind
			
		}
		Arrays.sort(feld2);
		System.out.println(Arrays.toString(feld1));
		System.out.println(Arrays.toString(feld2));
	}
}
