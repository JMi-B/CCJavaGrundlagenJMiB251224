package thema4schleifen;

public class WurzelZiehen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Aufgabe 1.8 Wurzelziehen durch Iteration nach vorgebenen Psodocode

		double z = 25; // Beispiel
		int n = 10; // Anzahl der Wiederholungen

		berechneWurzel(z, n);
	}

	public static void berechneWurzel(double z, int n) {
		// Inizialisierung

		double links = 0;
		double rechts = z;
		int i = 1;

		// Iteratiever Prozess SChleife

		while (i <= n) {
			double m = (links + rechts) / 2; // Mitte berechnen
			if (m * m < z) {
				links = m; // Wurzek ist keiner m als links
			} else {
				rechts = m; // Wurzel ist größer als m also rechts
			}

			// Ausgabe der Zwischen WErt
			System.out.println("Iteration " + i + ": links = " + links + " ,  rechts = " + rechts);

			++i; // Nächste Iteration
		}
		// ERgebnis Ausgabe

		System.out.printf("Nach %d Iterationen: Die Wurzel liegt ungefähr zwischen %.6f und %.6f%n", n, links, rechts);

	}

}
