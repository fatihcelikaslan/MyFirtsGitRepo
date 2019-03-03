package bb;

// class b8 {
//}
 class StringWrapper {    
	 private String theVal;   
	 public StringWrapper(String str){ this.theVal = str; } } 
 public class b8{     public static void main(String[] args) {  
	 StringWrapper sw = new StringWrapper("How are you buddy?");        
	 StringBuilder sb = new StringBuilder("How are you?");       
	 System.out.println("Hello, "+sw);         System.out.println("Hello, "+sb); 
	 
	 String kio= sw.toString();
	 System.out.println(kio);
 
 } }  

