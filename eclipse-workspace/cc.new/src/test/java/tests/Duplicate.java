package tests;

import java.util.HashSet;
import java.util.Set;

public class Duplicate {

	public static void main(String[] args) {

		int[] intArr = { 22, 23, 24, 25 };

		System.out.println(duplicates(intArr));
	}

	static boolean duplicates(final int[] zipcodelist) {
		Set<Integer> lump = new HashSet<Integer>();
		for (int i : zipcodelist) {
			if (lump.contains(i))
				return true;
			lump.add(i);
		}
		return false;
	}

}