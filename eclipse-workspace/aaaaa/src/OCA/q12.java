package OCA;

public class q12 {

	public static void main(String[] args) {

		String ta="A";
		ta=ta.concat("B");
		String tb="C";
		ta=ta.concat(tb);
		ta.replace('C', 'D'); //string is immutable
		ta=ta.concat(tb);
		System.out.println(ta);
	}

}
