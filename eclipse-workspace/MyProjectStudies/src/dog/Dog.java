package dog;

public class Dog {
	String name;
	int size;
	
	public void bark() {
		if(size>20) {
			System.out.println(name + " Woof Woof");
		}else if(size>10 ) {
			System.out.println(name +" Ruuf Ruuf");
		}else {
			System.out.println(name +" No Barking today");
		}
	}
	public int play(String location) {
		if(location.equalsIgnoreCase("Park")){
			return 1;
		}else
			return 0;
		
	}
}
