// Computes the future value of a saving investment.
public class FVCalc {
	public static void main(String[] args){

		//first value is money saved
		//current value of the money they are investing
		int currentValue = Integer.parseInt(args[0]);
		int currentValuePositive = Math.abs(currentValue);

		//second input value is the rate
		double rate = Double.parseDouble(args[1]);
		double rateDivided = ((rate) / 100.0);

		//third variable is the number of years they are saving for
		int years = Integer.parseInt(args[2]);
		int yearsPositive = Math.abs(years);

		//futureValue = currentValue * (1 + rate)^n
		double futureValue = (double) currentValue * Math.pow((1 + rateDivided), yearsPositive);
		int futureValueInt = (int) futureValue;

		

		System.out.println("After " + yearsPositive + " years, a $" + 
		currentValuePositive + " saved at " + rate + "% will yield $" + futureValueInt);

	}
}