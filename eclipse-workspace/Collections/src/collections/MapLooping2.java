package collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapLooping2 {

  public static void main(String[] args) {

    Map<String, String> jobMap = new HashMap<>();

    jobMap.put("SDET", "Vienna");
    jobMap.put("MannualTester", "Fairfax");
    jobMap.put("DBA", "Herndon");
    jobMap.put("ScrumMaster", "Reston");
    jobMap.put("ProductOwner", "Fairfax");
    jobMap.put("ScrumMaster", "DC");

    Set<Entry<String, String>> entries = jobMap.entrySet();

    for (Entry<String, String> each : entries) {
      
      System.out.print( each.getKey() + "  " );
      System.out.println( each.getValue()  );
      
      if(each.getKey().equals("ProductOwner"))
            each.setValue("Tyson");
      
    }
    
    System.out.println(jobMap);

  }

}