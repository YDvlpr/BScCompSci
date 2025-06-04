package sandbox;
import java.util.Scanner;

public class ATM {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int pin = 1234;
		
		int tries = 0;
		
		
		while(tries < 3) {
			System.out.println("Please enter your 4-digit pin: ");
			int userInput = scanner.nextInt();
			
			if(userInput == pin) {
				System.out.println("Access granted!");
				break;
			} else {
				System.out.println("Incorrect! Try again.");
				tries++;
			}
		}
		
		if(tries == 3) {
			System.out.println("Too many atempts. Account Locked!");
		}
		
		scanner.close();
	}

}
