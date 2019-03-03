package udemypractice;

public class ExceptionPropagation {
	
	public static void thirdFunction() {
//		try {
		int a = 12/0;
//		}
//		catch(ArithmeticException k) {
//			System.out.println("No divide into  '0'...");
//		}
	}
	public static void secondFunction() {
//		try {
		thirdFunction();
//		}
//		catch(ArithmeticException lop) {
//			System.out.println("No divide into '0'.. ***");
//		}
	}
	public static void firstFunction() {
		secondFunction();
	}

	public static void main(String[] args) throws ArithmeticException{
		firstFunction();
		secondFunction();
		thirdFunction();

	}

}
