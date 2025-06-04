// Create two integer variables and a character variable. 
//The character will contain ‘a’, ‘s’, ‘m’, or ‘d’, and the program will output the result of the applicable operation. 
//For example, if two variables 3 and 8, the character contains ‘a’, the value output would be 11 -  the result of the addition operation.

package sandbox;
public class Task1_9 {
	public static void main(String[] args) {
		int a , b;
		char operation;
		a = 3;
		b = 8;
		operation = 'd';
		switch(operation) {
			case 'a':
				System.out.println(a+b);
				break;
			case 's':
				System.out.println(a-b);
				break;
			case 'm':
				System.out.println(a*b);
				break;
			case 'd':
				System.out.println(a/b);
				break;
		}
	}
}
