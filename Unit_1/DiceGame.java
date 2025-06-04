package sandbox;
import java.util.Random;

public class DiceGame {

	public static void main(String[] args) {
		Random rd = new Random();
		int roll;
		
		do {
			roll = rd.nextInt(6) + 1;
			System.out.println("You have rolled a " + roll);
		
		}while(roll != 6);
		
		System.out.println("You got a 6, you won!");
		

	}

}
