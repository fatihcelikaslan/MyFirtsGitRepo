package aaaaa;

public class aaa5 {
	
	String a = "Cybertek2018";
	
	public int calSum () {
		int sum = 0;
		for (int i = 0; i < a.length(); i++) {
			if(Character.isDigit(a.charAt(i))) {
				String s = String.valueOf(a.charAt(i));
				sum = sum + Integer.parseInt(a);}}
			return sum;
		}
	
	
	public static void main(String[] args) {
		aaa5 a1 = new aaa5();
		a1.a = "Cybertek2018";
		System.out.println(a1.calSum());
	}

}
