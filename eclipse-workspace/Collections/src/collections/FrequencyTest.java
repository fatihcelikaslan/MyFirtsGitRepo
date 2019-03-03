package collections;

import java.util.*;

public class FrequencyTest {

	public static void main(String[] args) {
		String str = "SDFGHNKLKUYTRESADFGHJYTRDSADFGVBVCSD";
		
		Map< Character, Integer> freMap2 = new HashMap<>();
		
		for (int i = 0; i < str.length(); i++) {
			Character c = str.charAt(i);
			if(! freMap2.containsKey(c)) {
				freMap2.put(c, 1);
			} else {
				freMap2.put(c, freMap2.get(c)+1);
			}
		}
		System.out.println(freMap2);
	}

}
