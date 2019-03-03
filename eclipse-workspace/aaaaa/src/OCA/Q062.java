package OCA;

public class Q062 {

	public static void main(String[] args) {

		int num[][] = new int[1][3];
		for (int i = 0; i < num.length; i++) {
			for (int j = 0; j < num[i].length; j++) {
				num[i][j] = 10;
			}
		}
		System.out.println(num[0][0]);
		System.out.println(num[0][1]);
		System.out.println(num[0][2]);
		//System.out.println(num[1][0]);
		//System.out.println(num[1][1]);
		//System.out.println(num[1][2]);
	
	}
}