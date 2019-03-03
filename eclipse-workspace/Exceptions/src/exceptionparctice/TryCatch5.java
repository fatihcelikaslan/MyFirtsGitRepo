package exceptionparctice;

public class TryCatch5 {

	  public static void main(String[] args) {//throws Exception {
	        
//	    try {
//	      playWithFire();
//	    } catch (Exception e) {
//	      // TODO Auto-generated catch block
//	      System.out.println("Fire Caught");
//	      //e.printStackTrace();
//	    }
	    System.out.println("abc");
	    try {
	      playWithBoth() ;
	    } catch (Exception e) {
	      // TODO Auto-generated catch block
	      System.out.println("AAAAA");
	    } 
	    //playWithFire();
	    //playWithWater();

	  }
	  
	  static void playWithBoth() throws Exception{
	    
	    playWithFire();
	    playWithWater();
	    
	  }
	  
	  
	  
	  static void playWithWater() throws RuntimeException{
	    
	    System.out.println("play with water ");
	    
	  }

	//  static void playWithFire() throws Exception {
	  static void playWithFire() throws Exception{
	    
	    System.out.println("play with fire");
	    
	    //try {
	      throw new Exception();
	    //} catch (Exception e) {
	    //  System.out.println("Exxxxxx fire");
	    //}
	    
	    
	  }
	  
	  
	  

	}
