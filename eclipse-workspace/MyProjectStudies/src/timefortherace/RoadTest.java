package timefortherace;

import java.util.Arrays;

public class RoadTest {
	public static void main(String[] args) {
		Car c1 = new Car();
		c1.make = "Toyota";
		c1.model = "Yaris";
		c1.year = 2017;
		c1.currentSpeed = 15;
		c1.isRunning = true;
		
//		c1.accelerate(100);
//		c1.slowDown(25);
		
		long[] arr = {1,2,3,4,555,666,7,78,1};
		long[]afterRemove = c1.removeEdgeDistance(arr);
		String str = Arrays.toString(afterRemove);
		System.out.println(str);
		
		
		
		
		
		
		
		
		
	}

}
