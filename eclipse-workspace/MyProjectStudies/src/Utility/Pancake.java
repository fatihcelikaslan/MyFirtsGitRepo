package Utility;

public class Pancake {
	String cakeName;
	int weight;
	
	public void makingPancake() {
		System.out.println("We are making a pancake");
	}
	public void eatingPancake() {
		System.out.println("We are eating a pancake");
	}
	public void makeAndEatPancake() {
		makingPancake();
		eatingPancake();
		
		System.out.println("We are both making and eating pancake");
	}

}
