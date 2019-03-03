package bb;

public class b4 {
	static b4 ght;
	String[] arguments;
	
	public String name;
	public int age;
	
	public b4(String name, int age) {
		this.name = name;
		this.age = age;
	}
	

	public static void main(String[][] args) {
		
		b4[] ha = {
		new b4("A", 2),
		new b4("B", 3),
		new b4("C", 4),
		};
			
	System.out.println(ha);
		System.out.println(ha[1]);
		System.out.println(ha[1].age);

}
public static void main(String[] args) {
	long c = 2;
		String [][] anm = {args};
		b4[] ha = {
		new b4("A", 2),
		new b4("B", 3),
		new b4("C", 4),
		};
			
	System.out.println(ha);
		System.out.println(ha[1]);
		System.out.println(ha[1].age);

}}	

