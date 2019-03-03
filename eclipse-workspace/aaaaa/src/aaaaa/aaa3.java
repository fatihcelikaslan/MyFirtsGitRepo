package aaaaa;

public class aaa3 {
	
	private static final int INT1 = 0;
	private static final int INT2 = 0;


	public aaa3(){
		System.out.println("No arg");}
	aaa3(String name){
		System.out.println("One  arg: "+ name);}
	 aaa3(String name, int year){
		System.out.println("Two arg: "+ name+" "+year);}
	 public void dene() {
		 System.out.println("deneme");}
	 public int mene(int abc) {
//		 System.out.println("bunu try: "+abc);
		 return abc;
	 }
	
	
	public static void main(String[] args) {
		aaa3 a1 = new aaa3();
		aaa3 a2 = new aaa3("Cenk");
		aaa3 a3 = new aaa3("Tosun", 1995);
		a3.dene();
//		int o = a3.mene(67);
//		System.out.println(o);
		a3.mene(99);
		String s = new String("a");
		

  for(int i=INT1; i<INT2; i++){   
	  System.out.println(i);     }  
  }
}
