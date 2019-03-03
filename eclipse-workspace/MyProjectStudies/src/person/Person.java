package person;

public class Person {
	String name;
	int age;
	char gender;
	int weight;
	
	public void swim() {
		System.out.println(name +" is swimming.");
	}
	public void fish() {
		System.out.println(name + " is catching big fishes");
	}
	public void drink() {
		if(gender == 'F') {
			System.out.println(name+" is drinking milk");
		}else if(gender =='M') {
			System.out.println(name+" is drinking coke");
		}else
			System.out.println("Invalid gender isn`t drinking anything");
	}
	public void fishType(String fish) {
		System.out.println(name+" is catching "+ fish);
	}
	public void Scale(int weight) {
		System.out.println(name + " caught a "+ weight+" Pounds fish.");
	}
	public void Prizes(int prize) {
		System.out.println("He earned "+prize*2+" thousand dollars");
	}
	public int PrizeAmount() {
		return 2*age;
	}
	

	
	
	
}
