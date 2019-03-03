package aaaaa;

public class qa1 {

	public static void main(String[] args) {
		String h = "Tutoring";
		String temp = new StringBuilder(h).reverse().toString();
		System.out.println(temp);
		
		String reverse = "";
				for (int i = h.length()-1; i >=0 ; i--) {
					reverse+=h.charAt(i);}
	
	int g = 123456;
	String name1 = ""+g;
	String temp1 = new StringBuilder(name1).reverse().toString();
	System.out.println(temp1);
	
	String d = "Every cloud has a silver lining";
	StringBuilder sb = new StringBuilder();
	String words[] = d.split(" ");
	for (int i = words.length-1; i >=0 ; i--) {
		sb.append(words[i]).append(" ");
		
	}
	System.out.println(sb.toString().trim());
	
	
	
	}
}
