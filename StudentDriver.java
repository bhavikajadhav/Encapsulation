package Encapsulation;

public class StudentDriver {
	public static void main(String[] args) {
		Student s1 = new Student();
		
		s1.setId(2);
		s1.setName("Bhavika");
		s1.setEmail("xyz@gmail.com");
		s1.setContact_no(372891983);
		
		System.out.println(s1.getId());
		System.out.println(s1.getName());
		System.out.println(s1.getEmail());
		System.out.println(s1.getContact_no());


	}

}
