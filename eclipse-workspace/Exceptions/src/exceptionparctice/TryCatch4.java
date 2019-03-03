package exceptionparctice;

public class TryCatch4 {

	  public static void main(String[] args) {

	    System.out.println("begining");
	  
	    
	    try {
	      
	      //throw new RuntimeException(); 
	      System.out.println("trying ");
	      throw new IndexOutOfBoundsException();  
	      
	      
	    } catch (Throwable e) {
	      
	      System.out.println("catch block ");
	      // swallowing an exception : IndexOutOfBoundsException
	      throw new RuntimeException(); 
	      
	    } finally {
	      
	      System.out.println("finally ");
	      // swallowing an exception
	      throw new NullPointerException(); 
	      //System.out.println("aaaa");
	      
	    }
	    //System.out.println(" End ");
	    

	    
	  }}