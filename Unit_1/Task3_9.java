// Create two variable c and d, and output whichever is the largest

package sandbox;
public class Task1_9 {
	public static void main(String[] args) {
		int c = 7, d = 2;
		if(c > d){
			System.out.println(c);
		} else {
			System.out.println(d);
		}
	}
}

// result = 7

// Or we could use a different approach
package sandbox;
public class Task1_9 {
	public static void main(String[] args) {
		int c = 1, d = 2;
		int greater = Math.max(c, d);
		System.out.println(greater);
	}
}

// result = 2
