package thema4schleifen;
import java.util.Scanner;
public class DoWhileProgramm {
	Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub

/*		boolean condition = false;
*		
*		do {
*			System.out.println("Hello, World!");
*		}while (condition);
*/
		int pin;
		do {
						System.out.println("Bitte PIN eingeben");
				pin =scanner.nextInt();
				System.out.println(pin);
					}while (pin != 1234);
		System.out.println("Programm ENDE");
		scanner.close();
	}

}


