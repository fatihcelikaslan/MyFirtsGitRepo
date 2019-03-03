package arrayList;

import java.util.ArrayList;

public class ArrayListPractice {

	public static void main(String[] args) {
		ArrayList<String> l1 = new ArrayList<String>();
		l1.add("John");
		l1.add("Alo");
		l1.add("Jehaon");
		l1.add("Mendy");

		System.out.println(l1.get(3));
		System.out.println(l1);

		for (int i = 0; i < l1.size(); i++) {
			System.out.print(l1.get(i) + " ");
		}
		System.out.println();
		for (String each : l1) {
			System.out.print(each + ",.");
		}
System.out.println();

		ArrayList<String> l2 = new ArrayList<String>(8);
		
		ArrayList<Integer> l3 = new ArrayList<>(7);
		l3.add(7);
		l3.add(9);
		l3.add(27);
		l3.add(21);
		System.out.println(l3);
		
		for (int i = 0; i < l3.size(); i++) {
			System.out.print(l3.get(i)+" ");
		}
		System.out.println();
		for (Integer each : l3) {
			System.out.print(each+".,. ");
			
		}
	}

}
