package beans;

import java.util.List;

public class Emp {

	int empid;
	Name name;
	float salary;
	Address address;
	Dept dept;
	List<String> emails;
	
	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Emp(int empid, Name name, float salary, Address address, Dept dept, List<String> emails) {
		super();
		this.empid = empid;
		this.name = name;
		this.salary = salary;
		this.address = address;
		this.dept = dept;
		this.emails = emails;
	}

	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public Name getName() {
		return name;
	}

	public void setName(Name name) {
		this.name = name;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Dept getDept() {
		return dept;
	}

	public void setDept(Dept dept) {
		this.dept = dept;
	}

	public List<String> getEmails() {
		return emails;
	}

	public void setEmails(List<String> emails) {
		this.emails = emails;
	}

	@Override
	public String toString() {
		return "Emp [empid=" + empid + ", name=" + name + ", salary=" + salary + ", address=" + address + ", dept="
				+ dept + ", emails=" + emails + "]";
	}
	
	

	
	
	
}
