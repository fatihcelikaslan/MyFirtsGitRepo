package bb;

import java.util.ArrayList;

public class TestB2 {

	public static void main(String[] args) {
	b2 bb = new b2();
	
	if(bb.sumIt(15,20)==35) {
		System.out.println("Pass");
	}else System.out.println("fail");
	if(bb.sumIt(2,5,8)==15) {
		System.out.println("Pass");
	}else System.out.println("Fail");
	
	int[] dd = {4,5,6,7};
	if(bb.sumIt(dd)==22) {
		System.out.println("Pass");
	}else System.out.println("Fail");
	
	ArrayList<Integer> ab = new ArrayList<>();
	ab.add(7);
//	ab.add(19);
//	ab.add(45);
	
	if(bb.sumIt(ab)==7) {
		System.out.println("Pass");
	}else System.out.println("Fail");
	

	}}
