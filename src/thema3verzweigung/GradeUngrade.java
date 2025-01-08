package thema3verzweigung;

import java.util.Scanner;

public class GradeUngrade {
/* Aufgabe 1.2.
 * 	Schreiben Sie ein Java-Programm, das eine if-Anweisung verwendet, um zu überprüfen,
 *
*	ob eine gegebene Zahl gerade oder ungerade ist. Geben Sie entsprechend ‘Gerade‘ oder
*	‘Ungerade‘ aus.
*	Hinweis: In Java wird der Modulo-Operator (%) verwendet, um den Rest einer Division zu erhalten. Wenn ‘numbe
*/
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Zahl eingeben: ");
		int zahl =scanner.nextInt();
		
		if(zahl % 2 == 0) {
			System.out.println("Die Zahl ist grade");
		} else {
			System.out.println("Die Zahl ist ungrade");
			
		}
		
		String ergebnis = (zahl % 2 == 0)? "Grade" : " Ungrade";
		System.out.println(ergebnis);
		
		scanner.close();
		
		//(condition) ? ausdruck1 : ausdruck2
	}

}
