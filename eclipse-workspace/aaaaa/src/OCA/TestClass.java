package OCA;

public class TestClass {
	public static final int MIN = 5;
	public static void main (String[] args) {
	int x = args.length;
	if(checkLimit(x)) {		//line n1
		System.out.println("Java SE");
	}else {
		System.out.println("Java EE");
	}
}
public static boolean checkLimit(int x) {
	return (x >= MIN) ? true : false;
}
}
