package OCA;

public class q79 {

	public static void main(String[] args) {

		int[] array = { 1, 2, 3, 4, 5 };

		for (int i : array) {
			if (i < 2) {
				continue;
			}
			System.out.println(i);
			if (i == 3) {
				continue;
			}
		}
	}

}