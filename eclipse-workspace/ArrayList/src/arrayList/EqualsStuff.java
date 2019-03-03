package arrayList;
public class EqualsStuff {
	public static void main(String[] args) {
		// equals
		// when declare strings like this, both are actaully
		// pointing to the same object
		String one = "a";
		String two = "a";
		// == work one way with string
		System.out.println(one == two);

		// == work another way with everything else
		// compare if they are the same object
		// two different object
		String a = new String("a");
		String b = new String("a");
		System.out.println(a == b);

		Bags mybag = new Bags();

		Bags your = new Bags();

//		System.out.println(mybag == your);
//		mybag = your;
//		System.out.println(mybag == your);
		System.out.println(mybag.equals(your));
			
		
	}
}







