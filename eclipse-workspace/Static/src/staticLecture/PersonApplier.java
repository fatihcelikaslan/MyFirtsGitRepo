package staticLecture;

public class PersonApplier {

	public static void main(String[] args) {
		Person p1 = new Person();
		p1.name = "Adam";
		
		
		Person.spicies = "Human";
		
		Person p2 = new Person();
		p2.name = "John";
		
		System.out.println(p1.name);
		System.out.println(p2.name);

		
		System.out.println(Person.spicies);
		
		
		System.out.println(p1.spicies);
		
		p1.spicies = "Humanoid";
		
		System.out.println(p1.spicies);
		
		
		
		
		
		
		
		
		
	}

}
