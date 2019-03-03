package collections;

import java.util.*;

public class MapDay {

	public static void main(String[] args) {
		
		List<Long> price = new ArrayList<>();
		price.add( 56L);
		price.add( 76L);
		price.add((long) 89);
		price.add((long) 12);
		price.add((long) 27);
		price.add((long) 89);
		price.add((long)76);
		price.add((long) 73);
		price.add((long) 27);
		price.add((long) 12);
		price.add((long) 27);
		price.add((long) 89);
		price.add((long)76);
		
		System.out.println(price);
		System.out.println("***********");
		Set<Long> longSet = new HashSet<>(price);
		System.out.println(longSet);
		
		for (Long each : price) {
			longSet.add(each);
		}
		System.out.println(longSet);
		System.out.println("************");
		SortedSet<Long> sSet = new TreeSet<>(longSet);
		System.out.println(sSet);
		System.out.println(sSet.subSet(27L,76L)); // from 27 to 76, 27 included 76 excluded
		System.out.println(sSet.tailSet(27L)); // from 27 to the end
		System.out.println(sSet.headSet(76L)); // from 76 to the beginning
		
		SortedSet<Long> tail = sSet.tailSet(76L);
		System.out.println(tail);
		tail.remove(89L);
//		System.out.println(tail);
		
		
		
	}

}
