package ppp;

public class p82 {

	static int count = 0;
	int i = 0;

	public void changeCount() {
	while (i < 5) {
	i++;
	count++;
	}
	}
	public static void main(String[] args) {
		p82 check1 = new p82();
		p82 check2 = new p82();
	check1.changeCount();
	check2.changeCount();
	System.out.println(check1.count +" : "+ check2.count);
	}
	}