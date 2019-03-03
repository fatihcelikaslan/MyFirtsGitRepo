package warmup;

import java.util.ArrayList;
import java.util.List;

public class WrapperExamples {
	public static void main(String[] args) {
		// Primitive types and Wrapper class...
		//String is not primitive type its object type.
		//String is Class! And "h" variable is our object.
		String h="hie";
		//Java is object program thats why we are converting Wrapper Classes
		//These are how to create a wrapper class
         Integer r = new Integer(10);
        // How to give a value to wrapper class
         Integer rr = 10;
          // Autoboxing and Unboxing
         //there are many ways to create our wrapper class object
         //1st creating by using New keyword
         Integer r1=new Integer(10);
         //2nd way by assigning direct value
         Integer r2=10;
         //3rd way creating by "valueOf"
         int f=33;
         Integer y=Integer.valueOf(f);
      
        // Examples using wrapper class with String and "parseOf"
         String u="1111";
       //String converted to wrapper class
         Integer vv=Integer.valueOf(u);
      // converting String to primitive type
         Integer vvv=Integer.parseInt(u);
         System.out.println(vv);
         System.out.println(vvv);
         // another examples using wrapper class with string
         String count="1234567";
         Integer v=Integer.valueOf(count);// String converted to wrapper class
         System.out.println(count);
      
         //What is Array?
         //1.We can Store multiple items in Array!
         //2.Array are fixed size!
         //3. You can't store mixed data types in Array and you have to use same primitives!
         //4. Duplicates are not allowed in Array!
         //5.It Keeps items in order, we can't change it!
         // examples:
         // if u don't give an items to Array it won't compile, cause Arrays are fixed size!
          // never leave empty: =new String[];
         String[] bb = new String[2];
         // the way how to initialize Array items
         String[] bb1= {"hi","Hello"};
         //or we can initialize this way too
           bb[0]="hi";
           bb[1]="Hello";
         System.out.println(bb[1]);
         
          //What is ArrayList? 
          //1. We can store multiple items in ArrayList!
          //2. ArrayList is not fixed size!
          //3. You can store mixed data types!
          //4. It allowed duplicates!
          //5. It keeps it orders in items but you can change it in ArrayList!
        // ArrayList can take boolean, integer, and String .....
         //examples:
         //if you want to restrict your ArrayList use diamond operators!
         // How to create ArrayLIst with String and initialize it and use methods!
          ArrayList <String> list=new ArrayList(2);
          list.add("Mike");
          list.add("Tyson");
          list.add(2,"Guli");// adding 'Guli' value to Array
          list.add(3,"Cybertek");// adding extra value to Array
          list.remove(1);// removes first index from item.
          list.remove("Guli");// it removes Guli from items
          list.contains("Cybertek");//this method checks if you have item of 'Cybertek'
          list.set(0,"Akbar");// it sets Mike to Akbar.
          list.set(1,"Murodil");// its sets Cybertek to Murodil
          boolean bk =list.isEmpty();
          System.out.println(list);
          System.out.println(list.indexOf("Akbar"));// it will print index:0
          System.out.println(list.indexOf("Murodil"));// it will print index: 1
          System.out.println(list.get(0));// printing exact value 'Mike'
          //System.out.println(list.get(15));//index out of bound exception!
          System.out.println(list.size());// printing the size of the items:4
          System.out.println(list.contains("Cybertek")); // prints true
          System.out.println(bk);// since out items is not empty it prints: false

          
         // How to create ArrayList with Integer and initialize it.
          //you can use same methods here too.
          ArrayList<Integer> lst= new ArrayList(1);
          lst.add(45);
          lst.add(55);
          lst.add(66);
          System.out.println(lst);//prints all Array values
          System.out.println(lst.get(0));// prints exact index: '45'
          System.out.println(lst.size());// printing size of the value:3
          // you can keep printing with any methods you want to practice
          
          //How create ArrayList with Boolean
          ArrayList<Boolean> ls=new ArrayList();
          ls.add(false);
          ls.add(true);
          System.out.println(ls);
          System.out.println(ls.get(1));// get first index:true
          System.out.println(ls.size());//printing size: 2
          boolean dt=ls.isEmpty();
          System.out.println(dt);// prints false because our list is not empty.
         // you can keep printing with any methods you want to practice
        
           //Looping ArrayList
          //for and for each loop
          //example with for each loop
      // You can't say String because ArrayList can store multiple items but if its mixed type you have to use Object instead of String
          for(Object names : list) {
          System.out.println(names);// it prints all the item String ArrayList.
          } 
          for(int num: lst) {
        	  System.out.println(num);// prints all numbers from ArrayList
          }
          // since we can store mixed data types we can put Integer or int here it dosn't matter.
          for (Integer i = 0; i <lst.size(); i++) {
		}
          System.out.println(lst);// prints all items from Integer ArrayList
          
          // Examples with "List"
          //you can use same methods same for and for each loop.
          List<String>list2=new ArrayList<>();

          list2.add("milk");
          list2.add("egg");
          list2.add("tomato");
          list2.add("bread");
          list2.add(2,"Cheese");// adding Cheese to list items
          System.out.println(list2);// printing all items in list.
          
          // using if statements
         boolean b= list2.contains("egg");
         if(list2.contains("egg")) {
         System.out.println("yes");
         }else {
        	 System.out.println("no");
         }
         list2.remove(3);
         System.out.println(list2);// it removed 'tomato'from items
          
         boolean d=list2.isEmpty();
         System.out.println(d);// since our list2 is not empty it returns false.
	}
}
