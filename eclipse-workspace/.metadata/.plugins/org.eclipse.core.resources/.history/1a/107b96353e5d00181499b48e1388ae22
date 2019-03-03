/**
 * Random Integer Generator
 */
package question;
import java.util.Random;

public class RandomNumber {
	/**
	 * The purpose of this class to use as utility to get random numbers within certain range
		TODO:
		1. Add a static method getRandomInteger:
		parameter: type Range
		return: random generated int value within range of min and max values of the Range object
		
		2. overload a static method getRandomInteger:
		parameter: type int
		return: random generated positive int value within range of 1 and the 
		value of parameter

	 */
	public static int getRandomInteger(Range r){
		Random random = new Random();
		int t = random.nextInt(r.getMax() - r.getMin() + 1);
		
		
		
		return (t + r.getMin());
	}
	/**
	 * 
	 * @param max: int value. R random int will be generated in range (1,max) 
	 * @return: a random int in range (1, max), inclusive 
	 */
	public static int getRandomInteger(int max){
		Range r = new Range(1,max);
		return getRandomInteger(r);
	}
	
	private RandomNumber(){
		System.out.println("DO NOT REMOVE THIS");
	}
	

}
