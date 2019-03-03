//NOTES:
//	WE USE ABSTRACTION TO DESIGN OUR CODES MORE BENEFICIAL, we can not define  constructors in interface, 
//	WE CAN NOT DEFINE PRIVATE METHODS
//
//Basics of Java
//OOP:
//Encapsulation
//Inheritance
//Abstraction
//Polymorphism
//============
//Websites for basic programming practices:
//  codingbat.com
//  hackerrank.com
//  leetcode.com
//  CodeLab.com
//=====================
//Interview practice.
//------------------
//Google :  java core interview questions
//          java OOP interview questions
//Project, SDLC, Agile
//OCA , AWS 
//========================
//INTERFACES IN JAVA.
//------------------
//AWS: cloudguru
//     UDemy
//=====================
//     
//What is Abstraction?
//- Showing only functionality but hiding implementation
//- focusing on essential parts instead of implementation
//- Creating a general base class to serve as a template and no implementation from which other subclasses are derived
//How do you achieve abstraction in Java?
// 2 Ways to achieve abstraction:
//   --> Abstract classes
//   --> Interfaces
//Abstract class example:
//  
//  public abstract class Language {
//    public abstract void use();
//  }
//Analyze line 49:
//  1) add keyword abstract, it is making our class an abstract class
//  
//  2) Able to include abstract methods in Language class:
//  
//    public abstract void use();
//    
//  3) Cannot instantiate / create object of this class:
//    new Language();
//  
//How do you prevent a class from Instantiation(creating objects)?
//  1) Make your class abstract
//  2) Create private constructor  
//============================================
//Is multiple inheritance allowed in Java using classes or abstract classes?
//NO.
//To address this issue in our slide, we can use INTERFACES in Java.
//Multiple inheritance is allowed in Java using only interfaces.
//==============================================
//CONTRACT? 
//Interface Contract between a class and outside world.
//Any class that implements / inherits from an interface is responsible to 
//provide implementation for any abstract methods.
//==============================
//Interface is a special type in Java that is used to achieve abstraction.
//Before Java 8, Interfaces were pure abstraction, after java 8, we can also
//include some non-abstract methods.
//how to create: 
//public interface ScriptingLanguage {
//  
//}
//Before Java 8, we could only add abstract methods into Interfaces.
//it was pure abstraction 
//public interface ScriptingLanguage {
//  public abstract void code();
//  public abstract void compile();
//  public abstract void execute();
//}
//Starting from java 8, we can also add static and default methods, 
//so thats no more pure abstraction
//public interface ScriptingLanguage {
//  public abstract void code();
//  public abstract void compile();
//  public abstract void execute();
//  
//  public static void help(){
//    //print some documentation
//  }
//  
//  public default void interpret(){
//    //come code
//  }
//  
//}
//==========================
//A class can implement an interface using implements keyword.
//public class Ruby implements ScriptingLanguage, OOPLanguage{
//}
//Java allows multiple imlementation of interfaces but does not allow multiple
//inheritance of classes.
//We just separate interfaces by using comma.
//============================================
//Interface can also store constants.
//Interface can only contain public static final variables.
//Even if you do not mention those modifiers(keywords), all variables are
//automatically < public static final >
//public interface ScriptingLanguage {
//  
//  public static final boolean flexible = true;
//  public abstract void code();
//  public abstract void compile();
//  public abstract void execute();
//}
//=============================================
//Can we create object of interface?
//No, we cannot.
//List list = new ArrayList()<>;
//==============================================
//Constructor -> NO we cannot define constructors
//============================================
//public interface Teachable {
//  public static final boolean STUDY_HARD = true; 
//  
//  public abstract void canLean();
//  public abstract void doHomework();  
//  public default void readTopics(){
//  // code here
//    }  
//  public static int doResearch(){
//  // code here
//  }  
//}
//Difference between default and static methods.
//Static can be accessed using interface name:
//Teachable.deResearch();
//boolean b = Teachable.STUDY_HARD;
//public class Student implements Teachable{
//  //code
//}
//Student st = new Student();
//st.readTopics();
//=================================
//public class Student implements Teachable{
//  //code
//}
//Student.deResearch();
//===================================
//WE CAN DEFINE FOLLOWING IN AN INTERFACE:
//1) VARIABLES: PUBLIC STATIC FINAL
//2) METHODS: ABSTRACT
//      DEFAULT
//      STATIC
//3) CONSTRUCTORS: NOT ALLOWED
//----------------
//If an interface has a static method, that method can ONLY be accessed or used/called
//from Interface and NOT from IMPLEMENTING CONCRETE CLASS.
//===================================
//BREAK TILL 3:21 PM EST