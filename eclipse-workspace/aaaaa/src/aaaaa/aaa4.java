package aaaaa;

public class aaa4 {
	String targetString;
	aaa4(){}
	aaa4(String targetString){
	this.targetString = targetString;}
	
	public int calculateSum() {
		int sum = 0;
		for (int i = 0; i < targetString.length(); i++) {
			if(Character.isDigit(targetString.charAt(i))){
				String s = String.valueOf(targetString.charAt(i));
				sum = sum +Integer.parseInt(s);
			}
		}
		return sum;
	}

	public static void main(String[] args) {
		System.out.println(Math.addExact(5, 10));
		
		Integer i1 = 127;
		Integer i2 = 127;
		System.out.println(i1 == i2);
		
		Integer i5 = 166;
		Integer i8 = 166;
		System.out.println(i5 == i8);
		
		Integer i3 = 128;
		Integer i4 = 128;
		System.out.println(i3 == i4);
		
		System.out.println(Math.min(Double.MIN_VALUE, 0.0d));
		
		long wl = 1000 * 60 * 60 * 24 * 365L;
		long wthl = 1000 * 60 * 60 * 24 * 365;
		System.out.println(wl);
		System.out.println(wthl);
	}

}
