package collections;

import java.util.*;

public class ComparingObjects {

	public static void main(String[] args) {
		
//		List<String> names = Arrays.asList("Ali", "Ali","Veli","Deli","Melly", "Veli","Kelly","Veli");
//		
//		Collections.sort(names);
//		System.out.println(names);
		System.out.println(new Person("Adam", 22));
		
		List<Person> people = new ArrayList<>();
		people.add(new Person("Ali", 25));
		people.add(new Person("Veli", 32));
		people.add(new Person("Deli", 45));
		people.add(new Person("Deli", 26));
		people.add(new Person("Melly", 19));
		
		Collections.sort(people);
		
		System.out.println(people);
		
		
		

		
		
	}

}
