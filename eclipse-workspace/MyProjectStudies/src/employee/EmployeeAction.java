package employee;

public class EmployeeAction {

	public static void main(String[] args) {
		Employee e1 = new Employee();
		e1.setName("Ali");
		e1.setEmployeeId(676767L);
		e1.setSalary(7000);
		
		Employee e2 = new Employee();
		e2.setName("Veli");
		e2.setEmployeeId(67352673216767L);
		e2.setSalary(75000);
		
		Employee e3 = new Employee();
		e3.setName("Deli");
		e3.setEmployeeId(676767L);
		e3.setSalary(17000);
		
		System.out.println(e1.toString());
		System.out.println(e2.toString());
		System.out.println(e3.toString());

	}

}
