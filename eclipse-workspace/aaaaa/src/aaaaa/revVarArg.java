package aaaaa;

public class revVarArg {

	public static void main(String[] args) {
		
		revVarArg abc = new revVarArg();
		
		reversing(5,6,7,8,9,10);

	}
	public static void reversing(int... bjk) {
		String c = "";
		for(int i = bjk.length-1;i >=0;i--) {
			c+=bjk[i]+" ";
			
		}
		System.out.println(c);
	}

	
	
}
