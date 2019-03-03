package protectedex;

import extendexample.Vehicle;

public class Plane extends Vehicle{
	//protected String is only visible in child class
	public void setMake(String planeMake) {
		make = planeMake;
		
	}
	public void printMake() {
		System.out.println(make);
	}

}
