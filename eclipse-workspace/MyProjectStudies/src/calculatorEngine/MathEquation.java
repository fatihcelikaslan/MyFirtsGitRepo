package calculatorEngine;

public class MathEquation {
	private double leftVal;
	private double rightVal;
	private char opCode;
	private double result;
	
	
	public MathEquation(char opCode) {
		this.opCode = opCode;
	}
	public MathEquation(char opCode, double leftVal, double rightVal ) {
		this.leftVal = leftVal;
		this.rightVal = rightVal;
		this.opCode = opCode;
	}
	
	public double getLeftVal() {
		return leftVal;
	}
	public void setLeftVal(double leftVal) {
		this.leftVal = leftVal;
	}
	public double getRightVal() {
		return rightVal;
	}
	public void setRightVal(double rightVal) {
		this.rightVal = rightVal;
	}
	public char getOpCode() {
		return opCode;
	}
	public void setOpCode(char opCode) {
		this.opCode = opCode;
	}
	
	public double getResult() {
		return result;
	}
	public void execute() {
		switch(opCode) {
		
		case'a' : 
			this.result = leftVal+rightVal;
			break;
		case's' : 
			result = leftVal-rightVal;
			break;
		case'm' : 
			result = leftVal*rightVal;
			break;
		case'd' : 
			result = leftVal/rightVal;
			break;
			default:
				result = 0;
		}
		
	}
	

}
