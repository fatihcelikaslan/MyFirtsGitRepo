package collections;

import java.util.ArrayList;

public class CollectionPractice2 {

	public static void main(String[] args) {
		
		ArrayList<Integer> se = new ArrayList<>();
		se.add(6);
		se.add(8);
		se.add(9);
		se.add(1);
		se.add(67);
		se.remove(2);
		se.remove(0);
		se.remove(new Integer(1));
		System.out.println(se);

	}

}
