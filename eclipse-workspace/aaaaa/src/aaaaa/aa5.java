package aaaaa;

public class aa5 {

	public static void main(String[] args) {
		String word = "8909ABCD1234ABCD7890FGHT4567";
		StringBuilder ab = new StringBuilder( );
		
		for (int i = 0; i < word.length(); i++) {
			
			if(word.charAt(i)>='A' && word.charAt(i)<='M') {
				ab.append(word.charAt(i));
			}
		}
		
	System.out.println(ab.toString());
	System.out.println("************");
	String as = "";
	as.concat("3456");
	System.out.println(as.toString());
	int a = Math.min(9, 6);
	System.out.println(a);
	System.out.println("************");
	String s = "ONE"+1+2+"TWO";
	String r = 3+4+"ONE"+1+2+"TWO";
	System.out.println(s);
	System.out.println(r);
	
	int f = 3 & 2;
	System.out.println(f);
	int yt = Integer.MIN_VALUE;
	System.out.println(yt);
	int b = -yt;
	
	System.out.println(yt + " "+ b);
	
	}

}
