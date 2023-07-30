package Encapsulation;

public class Employee {
	private int eid;
	private String ename;
	private String email;
	private double salary;
	
	
	//public getters and setters
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		if(eid>0) {
		this.eid = eid;
		}else {
			System.out.println("Please enter valid employee id");

		}
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	
}
