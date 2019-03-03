package arrayVsArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Just {

	public static void main(String[] args) {
		List<String> names = new ArrayList<>();
		names.add("Aika");
		names.add("Beka");
		names.add("Iva");
		//names.add("Vika");
		names.remove(0);System.out.println(names);
		
		System.out.println(names.indexOf("Iva"));
		
		List<String> animals = Arrays.asList("Mouse", "Cat");
		System.out.println(animals);
		
		List<Integer> lucky = Arrays.asList(1, 7, 9, 19);
		System.out.println(lucky);
		
		List<List<Integer>> abv = Arrays.asList(lucky);
		System.out.println(abv);

	}

}
