// Prints the numbers 0 to 5.
// (Same program as shown in lecture 1-1).
public class PrintTo5 {
	public static void main(String args[]) {
		int num = Integer.parseInt ( args [0] );
		System.out.println ( (num / 100) + " hundreds " + ((num / 10) % 10)  + " tens " + (num % 10) + " ones " );
	    // Replace this comment with your code
	}
 }