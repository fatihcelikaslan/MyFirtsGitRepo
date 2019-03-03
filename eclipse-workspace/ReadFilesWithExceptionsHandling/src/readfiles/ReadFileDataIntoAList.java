package readfiles;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;



public class ReadFileDataIntoAList {
	public static void main(String[] args) {
	
		List<Integer> n1 = new ArrayList<>();
	try (FileReader fr = new FileReader("Numbers.txt"); 
			 BufferedReader br = new BufferedReader(fr);) 
		{
			String value;
			while ((value = br.readLine()) != null) {
				n1.add(Integer.valueOf(value));
				System.out.print(value);
			}
			
		} catch (FileNotFoundException ed) {
			ed.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	System.out.println();
	System.out.println(n1.size());
	int sum = 0;
	for(Integer number: n1) {
		sum+=number;
	}
	System.out.println(sum);
	
	int max = n1.get(0);
	for (int i = 0; i < n1.size(); i++) {
		if(n1.get(i)>max) {
			max = n1.get(i);
		System.out.println("MAx with for each loop"+max);
	}
	
	}
	Collections.sort(n1);
	System.out.println( "MAx with sort loop"+n1.get(n1.size()-1));
	
	System.out.println("Collection.max"+ Collections.max(n1));
	
	List<Integer> newList = new ArrayList<>();
	int duplicates = 0;
	for(Integer number: n1) {
		if(!newList.contains(number)) {
			newList.add(number);
		}else duplicates++;
	}
	System.out.println("Count of unique nums: "+newList.size());
	System.out.println(newList.toString());
	System.out.println("Duplicates: "+ duplicates);
	System.out.println(checkForDuplicates1(n1));
	System.out.println(secondLargest(n1));
	
	 
	}
	
	public static boolean checkForDuplicates1(List<Integer> n1) {
		  for (int i = 0; i < n1.size(); i++) {
		    for (int j = i; j < n1.size()-i-1; j++) {
		    if(n1.get(i)==n1.get(i+j+1)) {
		      return true;}
		    }
		  }
		  return false;
		}
	
	public static int secondLargest(List<Integer> n1) {
		  int max=0, max2=0;
		  for (Integer integer : n1) {
		    if(integer>max) {max2= max;max = integer;}
		    else if(integer>max2) {max2 = integer;}
		  }
		  return max2;
		}
	
	
	}


