package thema1grundlagen;

import java.util.Scanner;

public class BMI3 {
	
	// BMI mit Rundung und Eingabeaufforderung

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		berechnenBmi(1.75, 85.0);
	}
	

	public static void berechnenBmi(double groesse, double gewicht) {
		
			
		double bmi = gewicht/(groesse*groesse);
	
	
		double rundBmi = 0;

		rundBmi = Math.round(bmi);
		
		System.out.println(bmi);
		System.out.println(rundBmi);
		
		{
			
			try (Scanner scanner = new Scanner(System.in)) {
				System.out.println("Whats youre name?");
				String name = scanner.next();
				
				System.out.println("Enter your age");
				int age = scanner.nextInt();
				
						System.out.println("Your name is: " + name + " and your age ist " + age);
			}

		}

	
		
	

	}	}
