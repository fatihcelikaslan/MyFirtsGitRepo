package aaaaa;

class A {
	final int fi = 10;
}

public class fg45 extends A {

	int fi = 15;

	public static void main(String[] args) {
		fg45 b = new fg45();
		b.fi = 20;
		System.out.println(b.fi);
		System.out.println(((A) b).fi);
	}
}
