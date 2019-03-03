package timefortherace;

import java.util.Arrays;

public class Car {
	String make;
	String model;
	int year;
	double currentSpeed;
	boolean isRunning;

	public void start() {
		System.out.println("Car is running");
		isRunning = true;
		}
	public void stop() {
		System.out.println("Car is not running");
		isRunning = false;
	}
	public void accelerate(int targetSpeed) {
		if(targetSpeed<currentSpeed) {
			System.out.println("You are faster than target speed");
			return;
		}
		
		while(currentSpeed<targetSpeed) {
			System.out.print(currentSpeed+",");
			currentSpeed++;
		}
		System.out.println();
	}
	public void slowDown(int targetSpeed) {
		if(targetSpeed>currentSpeed) {
			System.out.println("You are slower than target speed");
			return;
		}
		
		while(currentSpeed>targetSpeed) {
			System.out.print(currentSpeed+",");
			currentSpeed--;
		}
	}
	
	public String getCarInfo(String carInfo) {
		return "Make is: "+make+" Model is "+model+" Year is: "+year;
	}
	public void readDirection(String ab, String bc, String cd) {
		System.out.println("Turning to direction"+ ab);
		System.out.println("Turning to direction"+ bc);
		System.out.println("Turning to direction"+ cd);
	}
	public long getTotalDistance(long[] distanceArr) {
		long sum = 0;
		for (long eachDistance : distanceArr) {
			sum =+ eachDistance;
			
		}
		return sum;
	}
	public long getMaxDistance(long[] distanceArr) {
		long max = distanceArr[0];
		for (int i = 1; i < distanceArr.length; i++) {
			if(distanceArr[i]>max) {
				max=  distanceArr[i];
			}
		}
		
		return max;
	}
	public long[] removeEdgeDistance(long[] distanceArr) {
		long[] newArr =  new long[distanceArr.length-2];
		Arrays.sort(distanceArr);
		System.out.println(Arrays.toString(distanceArr));
		
		for (int i = 1; i < distanceArr.length-1; i++) {
		
			newArr[i-1] = distanceArr[i];
			
		}
		return newArr;
	}
	
		
		
		
		
	
		
		
		
	

}
