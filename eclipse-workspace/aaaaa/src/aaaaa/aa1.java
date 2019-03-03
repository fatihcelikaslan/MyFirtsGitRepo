package aaaaa;
public class aa1 {      //PROBLEM WITH THE CLASS
	private double leftVal;
	private double rightVal;
	private char opCode;
	private double result;
	
	public aa1(char opCode) {
		this.opCode = opCode;}
	public aa1(char opCode, double leftVal, double RightVal) {
		this(opCode);
		this.leftVal= leftVal;
		this.rightVal= rightVal;}
	public double getResult() {
		return result;}
	public double getLeftVal() {
		return leftVal;}
	public void setLeftVal(double leftVal) {
		this.leftVal = leftVal;}
	public double getRightVal() {
		return rightVal;}
	public void setRightVal(double rightVal) {
		this.rightVal = rightVal;}
	public char getOpCode() {
		return opCode;}
	public void setOpCode(char opCode) {
		this.opCode = opCode;}
	public void execute() {
		switch(this.opCode) {
		case 'a' : this.result= leftVal+rightVal;
		break;
		case 's' : this.result= leftVal-rightVal;
		break;
		case 'm' : this.result= leftVal*rightVal;
		break;
		case 'd' : this.result= leftVal/rightVal;
		break;
		default : 
			result = 0;}}
	
	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 2;
		aa1 cal1 = new aa1('d', num1, num2);
		aa1 cal2 = new aa1('d', num1, num2);
		aa1 cal3 = new aa1('d', num1, num2);
		aa1 cal4 = new aa1('d', num1, num2);
		aa1 cal5 = new aa1('d', num1, num2);
		
		aa1[] equasionArr = {cal1, cal2, cal3, cal4, cal5};
		
		for (aa1 each : equasionArr) {
			each.execute();
		}
		cal1.execute();
		System.out.println(cal1.getResult());
		
			
		
	}

}
