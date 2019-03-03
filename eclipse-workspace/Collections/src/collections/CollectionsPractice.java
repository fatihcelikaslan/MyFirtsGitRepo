package collections;

import java.util.ArrayList;
import java.util.Arrays;

public class CollectionsPractice {
	
	public static int[]  addElement(int[] originalArr, int newItem) {
		
		int [] newArr = new int [originalArr.length+1];
		
		for (int i = 0; i < originalArr.length; i++) {
			newArr[i] = originalArr[i];
		}
		newArr[newArr.length - 1] = newItem;
		return newArr;
		
	}
	public static void main(String[] args) {
		
	int[] myArr = {1,3,5,7,9};
	myArr = addElement(myArr, 100);
	
	System.out.println(Arrays.toString(myArr));
	
	
	
	
	}


}