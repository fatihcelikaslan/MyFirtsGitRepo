package OCA;

class Q075 {
	public void test() {
		System.out.println("Base: ");
	}
}

class DerivedA extends Q075 {
	public void test() {
		System.out.println("DerivedA: ");
	}
}

class DerivedB extends DerivedA {
	public void test() {
		System.out.println("DerivedB: ");
	}

	public static void main(String[] args) {

		Q075 b1 = new DerivedB();
		Q075 b2 = new DerivedA();
		Q075 b3 = new DerivedB();
		b1 = (Q075) b3;
		Q075 b4 = (DerivedA) b3;
		b1.test();
		b4.test();

	}
}
