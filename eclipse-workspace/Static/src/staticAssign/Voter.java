package staticAssign;

public class Voter {
	
	 static int count;
	 private String name;
	 private int age;
	  int countOfGetNameCall;
	 
	 
	public Voter(String newName, int newAge) {
		this.name = newName;
		this.age = newAge;
		count++;
	}
	public String getName() {
		countOfGetNameCall++;
		return name;
		
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	 
	 
	
	
	

}
