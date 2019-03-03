package OCA;

public class Q051 {

	int num;

	public static void graceMarks(Q051 obj4) {
		obj4.num += 10;
	}

	public static void main(String[] args) {
		Q051 obj1 = new Q051();
		Q051 obj2 = obj1;
		Q051 obj3 = null;
		obj2.num = 60;
		graceMarks(obj2);
		//1 EA Q051 instance IS created in memory at runtime.
	}
}
