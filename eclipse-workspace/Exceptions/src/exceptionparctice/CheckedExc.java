package exceptionparctice;

public class CheckedExc {
	public static void playWithFire() throws Exception{
		
	}

	public static void main(String[] args) {
		
		try {
			playWithFire();
		}catch(Exception e ) {
			System.out.println("Exc caught");
		}

	}

}
