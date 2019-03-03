package calculatorEngine;

public class CalculatorEngine {

	public static void main(String[] args) {
		
		
		MathEquation a1 = new MathEquation('a',7,8);
		MathEquation a2 = new MathEquation('s', 8,4);
		MathEquation a3 = new MathEquation('m', 3,9);
		MathEquation a4 = new MathEquation('d', 15,5);
		MathEquation a5 = new MathEquation('z', 14,50);
		
		MathEquation[] equasionArr = {a1,a2,a3,a4,a5};
		for (MathEquation each : equasionArr) {
			each.execute();
			System.out.println("Op Code is: "+ each.getOpCode()+" Result is: "+ (int)each.getResult());
		}
		
		a5.setOpCode('d');
			a5.execute();
			System.out.println(a5.getResult());
		
		

	}

}
