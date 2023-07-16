package beans;

public class User {
	private String name,email,contact;
	private Address address;
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(String name, String email, String contact,String city,String area,String pin) {
		super();
		this.name = name;
		this.email = email;
		this.contact = contact;
		this.address = new Address(city,area,pin);
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
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}

}
