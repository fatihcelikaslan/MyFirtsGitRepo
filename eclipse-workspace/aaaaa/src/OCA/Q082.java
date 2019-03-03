package OCA;

public class Q082 {

	static int count = 0;
	int i = 0;

	public void changeCount() {
		while (i < 5) {
			i++;
			count++;
		}
	}

	public static void main(String[] args) {
		Q082 check1 = new Q082();
		Q082 check2 = new Q082();
		check1.changeCount();
		check2.changeCount();
		System.out.println(check1.count + " : " + check2.count);
	}
}
