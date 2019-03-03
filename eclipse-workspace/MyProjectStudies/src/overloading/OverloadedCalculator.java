package overloading;

public class OverloadedCalculator {
	
	public int add(int a) {
		return a+a;}
	public void add(double d, float f) {
		System.out.println("Result is: "+ (d+f));
	}
	public int add(int[] k) {
		int sum= 0;
		for (int i = 0; i < k.length; i++) {
			sum+=k[i];}
		return sum;}
	
	public long add(long[] l) {
		long sum = 0;
		for (int i = 0; i < l.length; i++) {
			if(l[i]<20) return sum;
				sum+=l[i];}
		return sum;
	}
	
	
	
	public static void main(String[] args) {
	OverloadedCalculator c1 = new OverloadedCalculator();
	System.out.println(c1.add(76));
	c1.add(39.0, 76f);
	int[] h = {6,7,8};
	System.out.println(c1.add(h));
	long[] asd = {28, 99, 4, 8, 5, 9, 26};
	long lo = c1.add(asd);
	System.out.println(lo);
}	
	
}
