// Prints a given number using a hundreds, tens, and units notation.
public class NumWords {
	public static void main(String args[]) {
	    // Replace this comment with your code
		int number = Integer.parseInt(args[0]);

		//takes the last digit from the number
		int ones = number % 10;
		//this deletes the last number so now we are left with the reminaing
		number = number / 10;
		//repeat the process for tens
		int tens = number % 10;

		number = number / 10;
		//takes the third digit 
		int hundreds = number % 10;

		//the program will stop here and not read any other digits if the number is bigger thn 999

	System.out.println(hundreds + " hundreds, " + tens + " tens, and " + ones + " ones.");

	}
}