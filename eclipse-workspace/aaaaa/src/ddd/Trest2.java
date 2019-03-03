package ddd;

public class Trest2 {
	 int x =0;
	  int y = 0;
	    //PASS BY VALUE
	    public static void tricky(Trest2 arg1, Trest2 arg2)
	    {
	      arg1.x = 100;
	      arg1.y = 100;
	      Trest2 temp = arg1;
	      arg1 = arg2;
	      arg2 = temp;
	    }
	  public static void main(String[] args) {
	    Trest2 ex1 = new Trest2();
	    Trest2 ex2 =  new Trest2();
	    System.out.println("X: " + ex1.x + " Y: " +ex1.y); 
	      System.out.println("X: " + ex2.x + " Y: " +ex2.y);
	      tricky(ex1, ex2);
	      System.out.println("X: " + ex1.x + " Y: " +ex1.y); 
	      System.out.println("X: " + ex2.x + " Y: " +ex2.y);

}}
