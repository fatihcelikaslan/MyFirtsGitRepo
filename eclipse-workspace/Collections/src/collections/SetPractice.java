package collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetPractice {
	public static void main(String[] args) {
		
	
	
	Set<Integer> numSets = new HashSet<>();
	
	numSets.add(232);
	numSets.add(676);
	numSets.add(676);
	numSets.add(833);
	numSets.add(987);
	
//	for (Integer each : numSets) {
//		System.out.println(each);
//	}
	
	Iterator<Integer> setIter = numSets.iterator();
	
	System.out.println(numSets.iterator());
	setIter.hasNext();
	setIter.next();
	setIter.next();
	setIter.next();
	
	System.out.println(setIter);
	
//	System.out.println(numSets);

}
}