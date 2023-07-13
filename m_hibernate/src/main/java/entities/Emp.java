package entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Table(name="emp")
@Inheritance(strategy=InheritanceType.JOINED)
public class Emp {
	
	@Id
	int eid;
	@Column
	String name;
	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Emp(int eid, String name) {
		super();
		this.eid = eid;
		this.name = name;
	}
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}
