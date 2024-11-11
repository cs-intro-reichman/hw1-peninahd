// Splits a restaurant bill evenly among three diners.
public class Bill3 {
	public static void main(String[] args) {
		//get the names of the diners from the command line
		String name1 = args[0];

		String name2 = args[1];

		String name3 = args[2];

		//receives the value of the bill from the command line

		Double price = Double.parseDouble(args[3]);

				//calculates the bill split by three people
				double split = (double) price / 3.0;

				//rounds the double up to the nearest whole number with one decimal spot
				double rounded = Math.ceil(split);
			
		//tell the user how much each diner owes
		System.out.println("Dear " + name3 + ", " + name2 + ", and " + name1 + ": " + "pay " + rounded + " Shekels each");
  
	}
}
