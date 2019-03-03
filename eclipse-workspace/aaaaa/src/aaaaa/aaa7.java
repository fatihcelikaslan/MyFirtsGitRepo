package aaaaa;

public class aaa7 {

	 static int count;
	static int countOfGetNameCall;
	private String name;
	private int age;
	public String getName() {
		countOfGetNameCall++;
		return name;}
	public int getAge() {
		return age;}
	public aaa7(String name, int age) {
		this.name = name;
		this.age = age;
		count++;
		
	}
	
	public static void main(String[] args) {
		aaa7 v1 = new aaa7("Ali", 45);
		aaa7 v2 = new aaa7("hh", 23);
		aaa7 v3 = new aaa7("uiyi", 67);
		aaa7 v4 = new aaa7("piiu", 34);
		aaa7 v5 = new aaa7("987", 34);
		int a = count;
		int b = countOfGetNameCall;
		System.out.println(a);
		System.out.println(b);
	}

}
