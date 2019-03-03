package extendexample;

public class Garage {

	public static void main(String[] args) {
		Vehicle v1 = new Vehicle();
		v1.drive();
		v1.stop();
		
		System.out.println("***********");
		Car c1 = new Car();
		c1.getMake();
		c1.drive();
		c1.stop();
		System.out.println("************");
		Bus b1 = new Bus();
		b1.swim();
		b1.stop();
		b1.drive();
		
		
	}

}
