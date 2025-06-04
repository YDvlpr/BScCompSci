//Using while to print text
//use an int variable and a while statement to output 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14
package sandbox;

public class Iteration_task {

	public static void main(String[] args) {
		int count = 0;
		
		while(count < 15) {
			System.out.print(count);
			if (count >= 0 && count < 14) {
				System.out.print(", ");
			}
			count++;
		}

	}

}
