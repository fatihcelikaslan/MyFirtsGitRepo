package aaaaa;
public class aa7 {
	
	static int x;
	StringBuilder sb = new StringBuilder();
	static StringBuilder sb2 = new StringBuilder();
	public aa7() {
		m1();
		m2();
	}
	public void m1() { x += 5;
	sb.append(x);}
	public void m2() {x += 10;
	sb.append(x);}
	
	public static void main(String[] args) {
		aa7 t1 = new aa7();
		aa7 t2 = new aa7();
		aa7 t3 = new aa7();
		String s = t2.sb + "-"+ t2.sb2;
		System.out.println(s);
	}
	

}
