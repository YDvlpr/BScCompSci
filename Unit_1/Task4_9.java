// Create two integer variables e and f, and output the result of the largest divided by the smallest. What happens if the division operation were to result in a fraction.
package sandbox;
public class Task1_9 {
	public static void main(String[] args) {
		int e = 5, f = 10;
		if(e > f){
			System.out.println(e + " divided by " + f + " = " +(e/f));
		}else{
			System.out.println(f + " divided by " + e + " = " +(f/e));
		}
	}
}

// result = 10 divided by 5 = 2
// result e = 5, f = 9 : 9 divided by 5 = 1
