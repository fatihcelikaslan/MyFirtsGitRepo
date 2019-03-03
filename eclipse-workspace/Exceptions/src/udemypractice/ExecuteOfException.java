package udemypractice;

public class ExecuteOfException {
	
	public static void controlYourBP(int bP) {
		if(bP>100) throw new FatihException("Invalid BP");
		else System.out.println("Bp is normal level");
		
	}
	
	public static void main(String[] args)  {
		
		try {
		controlYourBP(110);}
		catch(FatihException hj) {
			hj.printStackTrace();
		}
	}

}
