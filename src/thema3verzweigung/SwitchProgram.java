package thema3verzweigung;

import java.util.Scanner;

public class SwitchProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int tag =scanner.nextInt();
		
		switch (tag) {
		case 1:
			System.out.println("Montag");
			break;
		default:
			System.out.println("Ungültiger Tag");
		}
		
		scanner.close();
	}

}
