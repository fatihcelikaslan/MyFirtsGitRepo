package extendexample;

public class Vehicle {
	
	protected String make;
	 private String color;
	
//	public Vehicle();
	
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public void drive() {
		System.out.println("driving");
	}
	public void stop() {
		System.out.println("stopping");
	}
}
