package entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Table(name="empasg")
@Inheritance(strategy=InheritanceType.JOINED)

public class EmpAsg {

	@Id
	int id;
	
	@Column
	String name;
	
	@Column
	String email;
	
	@Column
	String contactno;
	
	@Column
	float basic;
	
	

	public EmpAsg(int id, String name, String email, String contactno, float basic) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.contactno = contactno;
		this.basic = basic;
	}

	public EmpAsg(int id, float basic) {
		super();
		this.id = id;
		this.basic = basic;
	}
	
	
	
	public EmpAsg(int id) {
		super();
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public String getContactno() {
		return contactno;
	}

	public void setContactno(String contactno) {
		this.contactno = contactno;
	}

	public float getBasic() {
		return basic;
	}

	public void setBasic(float basic) {
		this.basic = basic;
	}

	public EmpAsg() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
