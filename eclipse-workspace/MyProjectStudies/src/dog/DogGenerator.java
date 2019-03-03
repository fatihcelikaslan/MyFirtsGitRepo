package dog;

public class DogGenerator {

	public static void main(String[] args) {
		String[]dogNames = {"ah", "cb", "frc", "dserd","ytrve"};
		int[] dogSizes = {19,42,43,14,5};
		
		Dog[] manyDogs = new Dog[5];
		for (int i = 0; i < manyDogs.length; i++) {
			manyDogs[i] = new Dog();
			manyDogs[i].name = dogNames[i];
			manyDogs[i].size = dogSizes[i];
		}
		for (Dog eachDog : manyDogs) {
			eachDog.bark();
			
		}

	}

}
