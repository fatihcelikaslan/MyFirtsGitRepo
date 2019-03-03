package overloading;

public class OverLoad {

	public static void main(String[] args) {
		
		doSth(15L);
		doSth(new Long(76));
	}
	static void doSth(long l) {
		System.out.println("Primitive long");
	}
	static void doSth(Long l) {
		System.out.println("WRAPPER long");
	}
	
		

}
