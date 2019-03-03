package ppp;

public class p17 {
	static int count = 5;
	public static void displayMsg() {
		count++;
		System.out.println("Welcome "+ "Visit Count: "+ count );
	
	}

	public static void main(String[] args) {
		p17.displayMsg();
		p17.displayMsg();

	}

}
