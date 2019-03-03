package collections;

import java.util.Comparator;

public class KeyReverseComparator implements Comparator <Integer>{

	@Override
	public int compare(Integer o1, Integer o2) {
		// TODO Auto-generated method stub
		return Integer.compare(o2, o1);
	}

}
