package collections;

import java.util.*;

public class MapPractice {

	public static void main(String[] args) {
		
		
		//Adding items to a map
		Map<Double, String> map = new HashMap<>();
		
		map.put(3.5, "Ali");
		map.put(4.25, "Veli");
		map.put(6.75, "Deli");
		map.put(4.25, "Veli");
		map.put(2.50, "Moore");
		map.put(5.75, "Ali");
		map.put(4.25, "Velittin"); //Takes the last duplicate
		
		
		//getting items by key
		
		System.out.println(map.get(2.50));
		System.out.println(map.get(4.44));
		System.out.println(map.containsKey(2.50));
		System.out.println(map.containsValue("Ali"));
		
		System.out.println("Counting map items: map.size--> "+ map.size());
		System.out.println("Is map empty or not?--> "+ map.isEmpty());
		
		
		System.out.println("**********");
		System.out.println(map);
		map.remove(4.25);
		System.out.println(map);
		map.remove(5.75, "Ali");
		System.out.println();
		System.out.println(map);
		
		System.out.println(map.replace(6.75, "Lokman"));
		System.out.println(map);
		map.replace(3.5, "Ali", "Can");
		System.out.println(map);
		map.replace(25.5, "Samt");
		System.out.println(map);
		System.out.println("<<<<<<<<>>>>>>>>>");
		
		String def = map.getOrDefault(17.50, "Default Name");
		String def2 = map.getOrDefault(3.5, "Can");
		System.out.println(def);
		System.out.println(def2);
		
		// Adding an item while checking the key exists or not
		if(!map.containsKey(4.5))
		map.put(4.5, "SOmething Else");
		// the same
		map.putIfAbsent(8.5, "Gyuanna Else");
		System.out.println("-------------");
		System.out.println(map);
	}

}
