package OCA;

public class qq19 {

	public static void main(String[] args) {

		String[] strs = new String[2];
//		strs[0] = "jk";
//		strs[1] = "oopl";
		int idx = 0;
		for (String s : strs) {

			strs[idx].concat("element" + idx);
			idx++;
		}
		System.out.println(strs);

	}

}
