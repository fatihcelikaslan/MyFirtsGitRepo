package bb;

public class b6 {
//	String name;
//	 b6 obj = new b6();
//	 obj = null;

    public static Integer wiggler(Integer x){
       Integer y = x + 10;
       x++;
       System.out.println(x);
       return y;
    }

    public static void main(String[] args){
       Integer dataWrapper = new Integer(5);
       Integer value = wiggler(dataWrapper);
       System.out.println(dataWrapper+value);
       
       
       System.out.println("++++++++++ #11: +++++++++++++++++++++\n");
       
       String days[] ={"mon","tue","wed","thur","fri","sat","sun"}; 
       int i = 0;
       for (String d:days ) {
       i--;
       switch (d) {
       case "mon": --i; 
       case "wed": --i;
       break;
       case "sun": i++; break;
       case "thur": i++;
       break; }
       System.out.println(i); }
       int kou = 5;
       while(  kou<7) {
    	   System.out.println(kou++);
       }
       String f = "";
       f.concat("poooi");
     
       
       
       
       
       
       
       
    }
   
    
}


