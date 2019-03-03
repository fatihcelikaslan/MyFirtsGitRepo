package OCA;

public class Q096 {
	
	public static void main(String[] args) {
		
		int x=100;
		
		int a=x++;
		
		int b=++x;
		
		int c=x++;
		
		boolean d = (a<b) ? (b<c) : (c<b);
//		int d = (a<b) ? (a<c) ? a : (b<c) ? b : c;
		
		System.out.println(d);
		
	}

}
