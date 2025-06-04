// Do the same as Task2_10 using a for loop instead
package sandbox;

public class Iteration_task {

	public static void main(String[] args) {
		for(int i = 10; i > 0; i--) {
			System.out.print(i);
			if(i >=2 && i <11) {
				System.out.print(", ");
			}
		}
		System.out.print("\nBlast off!");
	}

}
