package collections;
import java.util.*;
public class LoopingMap {

	public static void main(String[] args) {
			Map<String, String> jobMap = new HashMap<>();
			
			jobMap.put("SDET", "Vienna");
			jobMap.put("ManualTester", "Fairfax");
			jobMap.put("DBA", "Herndon");
			jobMap.put("ScrumMaster", "Reston");
			jobMap.put("ScrumMaster", "DC");
			jobMap.put("ProductOwner", "Arlington");
			jobMap.put("SDET", "Reston");
			
			System.out.println(jobMap);
			
			Set<String> keys = jobMap.keySet();
			for(String key:keys) {
				System.out.println(key);
			}
			System.out.println("******");
			Iterator<String> iter = keys.iterator();
			while(iter.hasNext()) {
				System.out.println(iter.next());
			}
			keys.remove("ProductOwner");
			System.out.println(jobMap);
//			System.out.println(iter.hasNext());
//			
//			System.out.println(keys);
//			
			Collection<String> allValues = jobMap.values();
			Iterator<String> it2 = allValues.iterator();
			while(it2.hasNext()) {
				System.out.println(it2.hasNext()+" ");
			}
			allValues.remove("Fairfax");
			System.out.println(jobMap);
			
	}

}
