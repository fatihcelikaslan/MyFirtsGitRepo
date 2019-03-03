package OCA;

public class Q086 {
	
	public static void main(String[] args) {
		
	}

	int ns;
	static int s;

	Q086(int ns) {
		if (s < ns) {
			s = ns;
			this.ns = ns;
		}
	}

	void doPrint() {
		System.out.println(ns + s);
	}
}
class TestA {
	public static void main(String[] args) {
		Q086 ref1 = new Q086(50);
		Q086 ref2 = new Q086(125);
		Q086 ref3 = new Q086(100);
		ref1.doPrint();
		ref2.doPrint();
		ref3.doPrint();
		
	}
}
