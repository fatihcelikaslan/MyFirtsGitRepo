package ccc;

import java.util.function.Predicate;

class Employee {
	
	public  Employee() {}
	public Employee(int g) {}
	int age;
}

public class TestClass {
	 static String her;
	public static boolean validateEmployee(Employee e, Predicate<Employee> p) {
		return p.test(e);
	}

	public static void main(String[] args) {
		System.out.println(her);
		Employee e = new Employee();
//		System.out.println(validateEmployee(e, e -> e.age < 10000));
	}

}
