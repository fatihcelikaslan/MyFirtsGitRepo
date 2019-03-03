package collections;

import java.util.*;
import java.util.Map.Entry;

public class SortedMapPractice implements Comparator<KeyReverseComparator> {

	public static void main(String[] args) {

		// HashMap<Integer, String > cityMap = new HashMap<>();
		Comparator<Integer> ci = new KeyReverseComparator();

		SortedMap<Integer, String> cityMap = new TreeMap<>(ci);

		cityMap.put(56, "ElDorado");
		cityMap.put(75, "Denver");
		cityMap.put(3, "Harrison");
		cityMap.put(7, "Somano");
		cityMap.put(35, "Kentucky");

		// Set<Integer> keyView = cityMap.keySet();
		// Collection<String> valueView = cityMap.values();
		// Set<Entry<Integer, String>> entryView = cityMap.entrySet();
		// for (Integer key : cityMap.keySet()) {
		// System.out.println("Map key ="+key);
		// }
		// for ( String each : cityMap.values()) {
		// System.out.println("MAp Value = "+each);
		// }
		// for ( Entry<Integer, String>eachEntry : cityMap.entrySet()) {
		// System.out.println(eachEntry.getKey()+ "--"+ eachEntry.getValue());
		// }

		// SortedMap<Integer, String> cityMap = new TreeMap<>();

	}


	@Override
	public int compare(KeyReverseComparator o1, KeyReverseComparator o2) {
		// TODO Auto-generated method stub
		return 0;
	}

}
