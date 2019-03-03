package ddd;

public class PassBy {
	  int num = 50;
	  
	  public static void main(String[] args) {
	  String str1 = new String("Hello ");
	  String str2 = str1;
//	  System.out.println(str1);
//	  System.out.println(str2);
	  str1=str1+"World";
	  System.out.println(str1);
	  System.out.println(str2);


	  }
	  
	

}
