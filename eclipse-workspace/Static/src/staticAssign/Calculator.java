package staticAssign;

public class Calculator {
	
	public static double add(double n1, double num2) {
	return n1+num2;
	}
	static double substract(double n1 , double num2) {
		return n1-num2;
	}
	static double multiply (double n1 , double num2) {
		return n1*num2;
	}
	static double divide(double n1 , double num2) {
		return n1/num2;
	}
	public static void main(String[] args) {
		System.out.println(add(30,15));
		System.out.println(substract(30,15));
		System.out.println(multiply(30,15));
		System.out.println(divide(30,15));
		
		Calculator c = new Calculator();
		
		System.out.println(c.add(2, 5));
		
		Calculator b = null;
//		System.out.println(b);
		b.add(30, 95);
		Calculator.add(89, 88);
		String s = null;
		
		//System.out.println(s.length());
		
	}
	
	
	

}
