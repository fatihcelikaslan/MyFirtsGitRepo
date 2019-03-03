package collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class IteratorPractice {

	public static void main(String[] args) {
			Collection<Integer> items = new ArrayList<>();
			items.add(7);
			items.add(3);
			items.add(92);
			items.add(64);
			items.add(243);
			
			Object o;
			
			Iterator<Integer> iter = items.iterator();
			System.out.println(iter.hasNext());
			System.out.println(iter.next());
			System.out.println(iter.next());
			
			iter.remove();
			System.out.println(items);
			
			
//			System.out.println(iter.next());
//			System.out.println(iter.next());
//			System.out.println(iter.next());
//			System.out.println(iter.hasNext());
	}

}
