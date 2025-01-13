package thema5.zweidimensional;

public class TicTacToe2 {

	public static void main(String[] args) {

		// Feld initialisieren

		char[][] ttt = new char[3][3];
		for (int i = 0; i < ttt.length; i++) { // Zeilen
			for (int j = 0; j < ttt[i].length; j++) { // Spalten
				ttt[i][j] = ' '; // Leeres char
			}
		}

		System.out.println("Vorher: ");
		spielFeldAusgeben(ttt);

		// Befüllen
		ttt[0][0] = 'O';
		ttt[0][2] = 'x';
		ttt[1][0] = 'x';
		ttt[1][1] = 'x';
		ttt[1][0] = 'O';
		ttt[2][0] = 'O';

		System.out.println("Nachher: ");
		spielFeldAusgeben(ttt);

		// Ausgabe des Spielfelds
	}

	public static void spielFeldAusgeben(char[][] ttt) {
		
		for (int i = 0; i < ttt.length; i++) { 			
			for (int j = 0; j < ttt[i].length; j++) { 
		System.out.print(ttt[i][j] + " | ");
			}
		System.out.println();
			}
		}
}

