package FishExample;

public class Fishing {
	String poolName;
	String color;
	int sizeCm;
	double weight;
	boolean isSwimming;
	
	public void swimming() {
		System.out.println("Fish is swimming, so it`s alive");
		isSwimming = true;
	}
	public void notSwimming() {
		System.out.println("Fish is not swimming, it`s dead");
		isSwimming = false;
	}
	
	
	

}
