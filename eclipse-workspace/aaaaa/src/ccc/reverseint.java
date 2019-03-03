package ccc;

public class reverseint {
	public static int reverseInt(int i) {
		  if (i/10>=1) {
		    return Integer.parseInt(""+i%10+reverseInt(i/10));
		  }
		  return i%10;
		}

	public static void main(String[] args) {
			int g = 12345678;
			String d = ""+g;
			StringBuilder sb = new StringBuilder(d);
			System.out.println(sb.reverse());
			g = Integer.parseInt(d);
			System.out.println(g);
			System.out.println("************************");
			
			System.out.println(reverseInt(98765432));
			
	}

}
