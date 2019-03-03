package aaaaa;

public class Duplicate {

	public static void main(String[] args) {
		String [] h = {"a", "b", "c", "d", "e"};
		String [] k = {"s", "e", "d", "o", "p", "w"};
		
		String d = "";
		for (int i = 0; i < k.length; i++) {
			for (int j = 0; j < h.length; j++) {
				if(k[i].equals(h[j])) {
					d +=h[j];
					
				}
				
			}
			
			
		}
			
		System.out.print(d);
		
	}

}
