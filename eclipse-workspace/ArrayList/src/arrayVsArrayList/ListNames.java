package arrayVsArrayList;

import java.util.*;

public class ListNames {
	public static void manin(String[] args) {
		List<String> names = new ArrayList<>();
		names.add("Aika");
		names.add("Beka");
		names.add("Iva");
		//names.add("Vika");
		names.remove(0);
		
//		String[] namesArray = new String[names.size()];
//		namesArray = names.toArray(namesArray);
//		namesArray[4] = "Becky";
//		System.out.println();
		
		Collections.reverse(names);
		System.out.println(names);
		
		String[] fruits = new String[3];
		fruits[0] = "Apple";
		fruits[1] = "Orange";
		fruits[2] = "Pear";
		
		List<String> listFruits = Arrays.asList(fruits);
		System.out.println(listFruits);
		
		
		List<String> animals = Arrays.asList("Tiger","Lion");
		System.out.println(animals);
		
		
	}
}
