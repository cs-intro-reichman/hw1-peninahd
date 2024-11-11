// Generates three integer random numbers in a given range,
// and prints them in increasing order.
public class Ascend {
	public static void main(String[] args) {
		
		//receive input as a variable that becomes the limit
		int limit = Integer.parseInt(args[0]);

		//generate three random numbers
		double value1 = (Math.random() * limit);
		double value2 = (Math.random() * limit);
		double value3 = (Math.random() * limit);

		//is there a way to save the values as an int?
		int intValue1 = (int) value1;
		int intValue2 = (int) value2;
		int intValue3 = (int) value3;

		//print the three random numbers
		System.out.println(intValue1 + " " + intValue2 + " " + intValue3);

		//compare the size of each variable
		int largest = Math.max(Math.max(intValue1,intValue2),intValue3);
		int smallest =Math.min(Math.min(intValue1,intValue2),intValue3);
		int middle = (intValue1 + intValue2 + intValue3) - (largest + smallest);

		//print the three random numbers in ascending order

		System.out.println(largest + " " + middle + " " + smallest);

	}
}
