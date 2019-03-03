package person;

public class PersonTester {

	public static void main(String[] args) {
		Person p1 = new Person();
		p1.name = "Ali";
		p1.age = 36;
		p1.gender = 'M';
		
		System.out.println("Our Person 1 is:"+ p1.name+ " He is "+p1.age+" years old.");
		p1.swim();
		p1.fish();
		p1.drink();
		p1.fishType("Labrax, sea bass");
		p1.Scale(36);
		p1.Prizes(36);
	
		

	}

}
