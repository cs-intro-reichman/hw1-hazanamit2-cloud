// Generates three integer random numbers in a given range,
// and prints them in increasing order.
public class Ascend {
	public static void main(String[] args) {
		// Declares an int variable, and sets it to 1
        int lim = 100; 
        int randNum1 = (int)(Math.random() * lim );
        int randNum2 = (int)(Math.random() * lim );
        int randNum3 = (int)(Math.random() * lim ); 
        int min = Math.min(randNum1, (Math.min(randNum2, randNum3)));
        int max = Math.max(randNum1, (Math.max(randNum2, randNum3)));
        int mid = (randNum1 + randNum2 + randNum3 - max - min);
        System.out.println(randNum1 + " " + randNum2 + " " + randNum3);
        System.out.println(min + " " + mid + " " + max);


 
         
    }
 }
