package entities;

public class Student {

	private String name;
	private String email;
	private String contact;
	private int sem1;
	private int sem2;
	private int sem3;
	private int sem4;
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(String name, String email, String contact, int sem1, int sem2, int sem3, int sem4) {
		super();
		this.name = name;
		this.email = email;
		this.contact = contact;
		this.sem1 = sem1;
		this.sem2 = sem2;
		this.sem3 = sem3;
		this.sem4 = sem4;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public int getSem1() {
		return sem1;
	}

	public void setSem1(int sem1) {
		this.sem1 = sem1;
	}

	public int getSem2() {
		return sem2;
	}

	public void setSem2(int sem2) {
		this.sem2 = sem2;
	}

	public int getSem3() {
		return sem3;
	}

	public void setSem3(int sem3) {
		this.sem3 = sem3;
	}

	public int getSem4() {
		return sem4;
	}

	public void setSem4(int sem4) {
		this.sem4 = sem4;
	}
	
	
	
}
