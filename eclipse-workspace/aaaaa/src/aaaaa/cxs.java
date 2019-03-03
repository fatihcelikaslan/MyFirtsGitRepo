package aaaaa;

public class cxs {

	public static void main(String[] args) {
		
		String str = "Hello World";
		String str1 = str.substring(0,2)+"r"+str.substring(3);
		System.out.println("Method 1: "+str1);
		
		String str2 = "Hello World";
		StringBuilder sb = new StringBuilder();
		String sba = str2.replace(str2.charAt(2), 'r');
		System.out.println("Method 2 :"+sba);
		
		//convert(4321) -> print "four thousand three hundred and twenty one"
		int i = 4321;		
		
	}

}
