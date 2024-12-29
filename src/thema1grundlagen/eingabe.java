package thema1grundlagen;

import java.util.Scanner;

public class eingabe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Whats youre name?");
		String name = scanner.next();
		
		System.out.println("Enter your age");
		int age = scanner.nextInt();
		
				System.out.println("Your name is: " + name + " and your age ist " + age);

	}

}
