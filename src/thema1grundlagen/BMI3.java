package thema1grundlagen;

import java.util.Scanner;

public class BMI3 {
	
	/* BMI mit Rundung und Eingabeaufforderung
	* Mit ChatGBT gelöst
	* Ich habe noch nicht verstanden wie alles zusammen hängt
	* Achte auf deine Klammern
	*/

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			berechnenBmi();
	}
	

	public static void berechnenBmi() {
		
		Scanner scanner = new Scanner(System.in);
				
			
			try  {
				System.out.println("Wie groß bist du in Meter?");
				double groesse = scanner.nextDouble();
				
				System.out.println("Wieviel weigst du in Kilogramm?");
				double gewicht = scanner.nextDouble();
				
						System.out.println("Du bist " + groesse + " m groß und wiegst " + gewicht + " kg.");
			
			double bmi = gewicht/(groesse*groesse);
		
			double rundBmi = Math.round(bmi);
		
			System.out.println("Dein BMI ist genau " + bmi + ".");
			System.out.println("Gerundet beträgt Dein BMI  " + rundBmi + "." );
		
				} finally {
				scanner.close();
			}
			
	}
		
	

		}
