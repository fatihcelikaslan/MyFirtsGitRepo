package collections;

import java.util.*;
import java.util.Map.Entry;

public class MapPractice3 {
	public static void main(String[] args) {
		Map<String, String> map = new HashMap<>();
		
		map.put("NY", "Ali");
		map.put("VA", "Veli");
		map.put("WA", "Deli");
		map.put("MA", "Veli");
		map.put("TX", "Moore");
		
		System.out.println(map.size());
		Set<Entry<String, String>> entries = map.entrySet();
		
		
			
		
	}

}
