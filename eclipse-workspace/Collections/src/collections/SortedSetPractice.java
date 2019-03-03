package collections;

import java.util.SortedSet;
import java.util.TreeSet;

import com.sun.org.apache.bcel.internal.generic.NEWARRAY;

public class SortedSetPractice {

	public static void main(String[] args) {
		
		SortedSet<Integer> sSet = new TreeSet<>();
		sSet.add(122);
		sSet.add(1232);
		sSet.add(423);
		sSet.add(122);
		sSet.add(433);
		sSet.add(433);
		
		System.out.println(sSet);
		System.out.println(sSet.tailSet(400));
		System.out.println(sSet.toString());
		
		SortedSet<String> sSet1 = new TreeSet<>();
		sSet1.add("Abc");
		sSet1.add("Mnh");
		sSet1.add("kjh");
		sSet1.add("hjkk");
		sSet1.add("bnmkj");
		System.out.println(sSet1);
		System.out.println(sSet1.tailSet("c"));
		System.out.println(sSet1.headSet("z"));
		System.out.println(sSet1.comparator());
		
		
		
	}

}
