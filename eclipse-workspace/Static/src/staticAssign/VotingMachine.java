package staticAssign;

public class VotingMachine {

	public static void main(String[] args) {
		Voter v1 = new Voter("Adam", 25);
		//Voter.count++;
		Voter v2 = new Voter("John", 29);
		//Voter.count++;
		System.out.println(v1.count);
		v1.getName();
		v2.getName();
		
		
		System.out.println(v1.countOfGetNameCall);
		
		
		

	}

}
