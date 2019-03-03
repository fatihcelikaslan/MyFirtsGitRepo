package Alvira;

public class SumOfAllDigits {

	public static void main(String[] args) {
		
	}
	public static void SumOfAllDigits(int number) {
		int copyNumber = number;
		int sum = 0;
		while(copyNumber !=0) {
			int lastDigit = copyNumber %10;
			sum +=lastDigit;
			copyNumber = copyNumber /10;
		}
		System.out.println("Sum: "+ sum);
	}

}
