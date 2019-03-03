package udemypractice;
public class TryCatchBlock {

	public static void main(String[] args) {
		
		try {
			
			String df = "AC";
			System.out.println(df.hashCode());
			
			int hj = 5 / 5;
			System.out.println(hj);
			
			int[] op = {1,2,3,4,5};
			System.out.println(op[3]);
			
			String h = "kjhghgf";
			System.out.println(h.length());
		}
		catch(ArithmeticException yt) {
			int hj = 9;
			System.out.println("Arithmetic exc found");
			System.out.println("New value will be "+ hj);
			System.out.println("Arithmetic exc found");
		}
		catch(ArrayIndexOutOfBoundsException  e) {
			System.out.println("My new exception");
		}
		catch(Exception r) {
			System.out.println("An exception occured");
		}
		finally {
			System.out.println("This is finally block");
			int g = 9;
			System.out.println(g);
		}
		
		System.out.println("Ordinary exc");
		
		
//	int a = 2 / 0; // runtime exc.
	
//	int[]as = {1,2,3,4,5};
//	System.out.println(as[7]);
//	System.out.println("here is working");
	
	}

}
