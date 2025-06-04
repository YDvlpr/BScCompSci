package sandbox;
import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int option;
		
		do {
			System.out.println("1. Option 1");
			System.out.println("2. Option 2");
			System.out.println("3. Exit");
			option = scanner.nextInt();
			
			if(option == 1) {
				System.out.println("You have chosen option 1!");
			} else if(option == 2) {
				System.out.println("You have chosen option 2!");
			} else if(option != 3){
				System.out.println("Incorrect option! try again.");
			}
		} while(option !=3);
		System.out.println("Exiting system.");
		
		scanner.close();
	}

}
