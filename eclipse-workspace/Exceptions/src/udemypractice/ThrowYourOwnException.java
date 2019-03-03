package udemypractice;

public class ThrowYourOwnException {

	public static void ageControl(int age) {
		if (age < 18)
			throw new ArithmeticException();
		else
			System.out.println("You can enter");
	}

	public static void main(String[] args) {
		int age = 18;
		try {
			ageControl(17);
		} catch (ArithmeticException u) {
			System.out.println("You can`t enter, below 18");
		}

	}

}
