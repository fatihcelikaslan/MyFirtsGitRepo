package collections;

import java.util.*;

public class MapPractice2 {

	public static void main(String[] args) {
		
		List<String> names = Arrays.asList("Ali", "Ali","Veli","Deli","Melly", "Veli","Kelly","Veli");
		
		Map< String, Integer> freMap = new HashMap<>();
		
		//SHORTER WAY	
//		for (String each : names) {
//			        freMap.put(each, freMap.containsKey(each)?freMap.get(each)+1:1);
//		}
//		System.out.println(freMap);
		//LONGER WAY
		for (String each : names) {
		    
		      if( ! freMap.containsKey(each)) {      
		        freMap.put(each, 1) ; 
		      } else {
		        int exitsingCount = freMap.get(each) ; 
		        freMap.put(each, exitsingCount+1) ;   
		      }
		    }
		
		System.out.println(freMap);
	}

	

  }
