package dog;

public class DogAction {

	public static void main(String[] args) {
		Dog d1 = new Dog();
		Dog d2 = new Dog();
		Dog d3 = new Dog();
		
		d1.name = "Joe";
		d1.size = 20;
		d1.bark();
		System.out.println(d1.play("Sand"));
		
		d1.name = "Kurt";
		d1.size = 35;
		d1.bark();
		System.out.println(d1.play("Park"));
		d1.name = "Koehl";
		d1.size = 60;
		d1.bark();
		System.out.println(d1.play("Beach"));
	}

}
