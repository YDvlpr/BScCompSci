// Do the same as Task1_10 but backwards
package sandbox;

public class Iteration_task {

	public static void main(String[] args) {
		int count = 10;
		
		while(count > 0){
			System.out.print(count);
			if (count >= 2 && count < 11) {
				System.out.print(", ");
			}
			count--;
			
		}
		System.out.println("\nBlast off!");

	}

}
