package OCA;

public class qq64 {

	public static void main(String[] args) {

		String shirts[][] = new String[2][2];
		shirts[0][0] = "red";
		shirts[0][1] = "blue";
		shirts[1][0] = "small";
		shirts[1][1] = "medium";

		for (int index = 1; index < 2; ++index) {
			for (int idx = 1; idx < index; ++idx) {
				System.out.println(shirts[index][idx]);
			}
		}

		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {
				System.out.println(shirts[i][j]);
			}
		}

		for (String[] c : shirts) {
			for (String s : c) {
				System.out.println(s);
			}
		}

		for (int index = 0; index < 2;) {
			for (int idx = 0; idx < 2;) {
				System.out.println(shirts[index][idx]);
				idx++;
			}
			index++;
		}

	}
}
