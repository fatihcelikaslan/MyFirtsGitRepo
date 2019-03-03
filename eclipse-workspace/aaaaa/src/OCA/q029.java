package OCA;

import java.util.ArrayList;

public class q029 {
	String name;
	public q029(String name) {
		super();
		this.name = name;
	}

	public static void main(String[] args) {
		ArrayList ps = new ArrayList();
		q029 p2 = new q029("Mike");
		ps.add(p2);

		// insert code here
		int f = ps.indexOf(p2);

		if (f >= 0) {
			System.out.println("Mike Found");
		}
	}
}
