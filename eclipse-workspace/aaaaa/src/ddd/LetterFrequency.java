package ddd;

public class LetterFrequency {

	public static void main(String[] args) {
		String[] str = {"cat", "dog ", "rabbit", "snake", "horse", "aaa"};
		int[] fr= new int[26];
		int k = 0;
		for (int i = 0; i < str.length; i++) { 
			str[i]=str[i].toLowerCase();
			for (int j = 0; j < str[i].length(); j++) {
				k=0;
				for(char ch = 'a';ch<='z';ch++) {
					if(ch==str[i].charAt(j)) 
						fr[k]++;
						k++;
					
				}
				
			}
		}
		char a = 97;
		for (int i = 0; i < fr.length; i++) {
			System.out.print((char)(a+i)+" "+fr[i]+",");
		}
		
	}

}
