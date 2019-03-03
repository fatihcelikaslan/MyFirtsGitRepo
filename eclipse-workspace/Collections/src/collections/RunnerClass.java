package collections;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class RunnerClass {

  public static void main(String[] args) {
    
     List<Student> people = new ArrayList<>();
     people.add(new Student(1,"Adam"));
     people.add(new Student(2,"Dave"));
     people.add(new Student(5,"Dave"));
     people.add(new Student(4,"Zain"));
     people.add(new Student(2,"Bob"));
  
  Comparator<Student> stCom =  new IdComparator();
  Collections.sort(people,stCom);
  System.out.println(people);
  
//  Comparator<Student> stRev = new ReversedNameComparator();
//  Collections.sort(people,stRev);
  System.out.println(people);
  // Task 2  
  // Create a class called ReversedNameComparator
  // and add your compare logic inside 
  // sort your list of Student 
    
    
  }
  
  
  
}