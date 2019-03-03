package switchDemo; 

public class switchDemo {

	public static void main(String[] args) {
		int myBudget = 2;
		
		switch(myBudget) {
		case 1:
			System.out.println("I can buy a car");
			break;
		case 2:
			System.out.println("I can buy a motorbike");
			break;
		case 3:
			System.out.println("I can buy a bicycle");
			break;
			default:
				System.out.println("I need to get on a bus");
		}
		
		
	}

}
