package mycollectionpractice;

import java.util.*;

public class Map {
	public static void main(String[] args) {
		
		Integer[] intArr = {3,4,5,6,32,45,21,65,20,2,3,4,5,4,3,2,9};
		List<Integer> myList = Arrays.asList(intArr);
		
		String[] strArr = {"hyt", "bvc", "thv","abc", "kyt", "kyte", "cde", "kyt"};
		List<String> myStr = new ArrayList<>();
		List<String> myStr2 = Arrays.asList(strArr);
		myStr.add("hABC");
		myStr.add("cde");
		myStr.add("fde");
		myStr.add("asw");
		myStr.add("kjh");
		
		System.out.println(intArr.toString());
		System.out.println(myStr);
		System.out.println(myStr2);
		System.out.println("Second-----------");
		
		Set<Integer> abSet = new HashSet<>(myList);
		Set<String> cdSet = new HashSet<>();
		System.out.println(abSet);
		
		
		
		System.out.println("Third----------------");
		Set<Integer> myIntSet = new TreeSet<>(myList);
		Set<String> myStrSet = new TreeSet<>(myStr);
		Set<String> myStrSet2 = new TreeSet<>(myStr2);
		System.out.println(myIntSet);
		System.out.println(myStrSet);
		System.out.println(myStrSet2);
		System.out.println("Fourth--------------");
		System.out.println(myIntSet);
		
		
//		Map<Integer, String> myMap = new HashMap<>();
		
		
		
		
		
		
		
		
		
		
		
	}

}
