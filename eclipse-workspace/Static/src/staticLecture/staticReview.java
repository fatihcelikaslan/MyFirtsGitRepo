package staticLecture;

public class staticReview {

	public static void main(String[] args) {
		//Static method can not have any instance members
		//Instance method can have instance members and static members
		
		
		Rocket r1 = new Rocket(100, "SpaceX", 24, false);
		Rocket r2 = new Rocket(100, "Apollo", 21, true);
		r1.launch();
		r2.launch();
		
		System.out.println(Rocket.counter);
		System.out.println(Rocket.launchPad);
		
		r1.launchPad = "Launchpad2";
		
		Rocket.capsulate();
		

	}

}
