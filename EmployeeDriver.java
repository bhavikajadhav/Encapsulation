package Encapsulation;

public class EmployeeDriver {
	public static void main(String[] args) {
		Employee e1 = new Employee();
		
		e1.setEid(5);
		e1.setEname("Bhavika");
		e1.setEmail("xyz@gmail.com");
		e1.setSalary(650000.00);
		
		System.out.println(e1.getEid());
		System.out.println(e1.getEname());
		System.out.println(e1.getEmail());
		System.out.println(e1.getSalary());

	}
}
