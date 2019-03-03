package ppp;

public class p89 {

	public static void main(String[] args) {
		String[] abc = { "A", "B", "C", "D" };
		for (int i = 0; i < abc.length; i++) {
			System.out.print(abc[i] + " ");
			if (abc[i].equals("C"))
				continue;
		}
		System.out.println("Work done");
//		break;
	}

}
