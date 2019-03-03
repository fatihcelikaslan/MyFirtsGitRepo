package OCA;

public class q031 {

	public static void main(String[] args) {

		StringBuilder sb = new StringBuilder("kaan");
		System.out.println(sb);
		
		// sb. deleteAll ();
		// sb. delete (0, sb. size () );
		sb.delete(0, sb.length());
		// sb. removeAll ();
		System.out.println(sb);
	}

}
