// Prints a given number using a hundreds, tens, and units notation.
public class NumWords {
	public static void main(String args[]) {
	    // receives the number input as a string
		int number = Integer.parseInt(args[0]);

		//takes the last number from the integer
		int ones = number % 10;
		
		//this deletes the last number so now we are left with the reminaing
		number = number / 10;
		
		//repeat the process for tens
		int tens = number % 10;
		number = number / 10;

		//hundreds
		int hundreds = number % 10;
		number = number / 10;

		//thousands
		int thousands = number;

		//convert hundreds and thousands into strings
		String hundredsString = String.valueOf(hundreds);
		String thousandsString = "";
		if (thousands != 0) {
		
			thousandsString = String.valueOf(thousands);
		}

	System.out.println((thousandsString + hundredsString) + " hundreds, " + tens + " tens, and " + ones + " ones.");

	}
}