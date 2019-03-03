package extendexample;

public class Car extends Vehicle{

	public void swim() {
		System.out.println("Swimming");
		
		int k = 5;
		int y = 7;
		int z = 9;
		Integer m = null;
		
		k = new Integer(y) + new Integer(z);
		k = new Integer(y)+ z;
		
		m = new Integer (y) + new Integer(z);
			
	}

}
