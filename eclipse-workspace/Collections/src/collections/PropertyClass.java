package collections;

import java.util.*;
import java.util.Map.Entry;

public class PropertyClass {

	public static void main(String[] args) {
		
		/*Hashmap can have 1 null key and many null value
		*HashTable can not have any null key and null value
		*HashMap is not scynchronized / Hashtable is
		*
		*
		*/
		
		Properties pro = new Properties();
		
		pro.setProperty("VA", "Arlington");
		pro.setProperty("MA", "Boston");
		pro.setProperty("NJ", "Trenton");
		pro.setProperty("CA", "Vista");
		pro.setProperty("NH", "Manchester");
		pro.setProperty("CO", "Denver");
		pro.setProperty("NJ", "Trenton");
		pro.setProperty("CA", "Vista");
		
		
		System.out.println(pro);
		System.out.println(pro.getProperty("CA"));
		
		Set<Entry<Object, Object>> myEntry = pro.entrySet();
		for(Entry<Object, Object> each : myEntry) {
			System.out.println(each);
			System.out.println(each.getValue());
			System.out.println(each.getKey());
				
				
			}
			
		
	}

}
