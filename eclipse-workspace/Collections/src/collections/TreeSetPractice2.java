package collections;

import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetPractice2 {

	public static void main(String[] args) {
		SortedSet<String> sSet = new TreeSet<>();
		sSet.add("Ali");
		sSet.add("Velib");
		sSet.add("Gelly");
		sSet.add("Mellyo");
		sSet.add("Veli");
		sSet.add("Belly");
		sSet.add("Alix");
		sSet.add("Colly");
		System.out.println(sSet);
		System.out.println(sSet.tailSet("Colly"));
	}

}
class LastCharComparator implements Comparator<String>{

	@Override
	public int compare(String o1, String o2) {

		return o2.substring(o2.length()-1).compareTo(o1.substring(o1.length()-1));
		
	}
	
}
