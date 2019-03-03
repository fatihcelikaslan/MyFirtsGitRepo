package bb;

import java.util.ArrayList;

public class b2 {
	
	public int go(int a) { return a; }
	public int go(int a, int b) {return 6;}
	public String goi(int a, int b) { return null;}
	
	public int sumIt(int a, int b) { return a+b;}
	
	public int sumIt(int a, int b, int c) { return a+b+c;}
	
	public int sumIt(int[] ia) {
		int sum = 0;
		for (int sum1 : ia) {
			sum+=sum1;}
		return sum;}
	public int sumIt(ArrayList<Integer>nums) {
		int sum = 0;
		for (int sum1 : nums) {
			sum+=sum1;}
		for (int i = 0; i < nums.size(); i++) {
			sum+=nums.get(i);
		}
		
		return sum;
		
		
	}
		
		
		
		

		
	
	
	
	
	
	
	
	
	

	public static void main(String[] args) {
		
		
		
		

	}

}
