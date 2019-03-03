package ccc;

public class c55 {
	int i;

	public c55(int i) {
		this.i = i;
	}

	public String toString() {
		if (i == 0)
			return null;
		else
			return "" + i;
	}

	public static void main(String[] args) {
		c55 t1 = new c55(0);
		c55 t2 = new c55(2);
		System.out.println(t2);
		System.out.println("" + t1);
	}
}
