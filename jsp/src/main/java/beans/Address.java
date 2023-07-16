package beans;

public class Address {
    private	String city,area,pin;

	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Address(String city, String area, String pin) {
		super();
		this.city = city;
		this.area = area;
		this.pin = pin;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getPin() {
		return pin;
	}

	public void setPin(String pin) {
		this.pin = pin;
	}
	
}
