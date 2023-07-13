package entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name="Temporary_emp")
@PrimaryKeyJoinColumn(name="id")
public class Temp_emp extends EmpAsg{

	@Column
	float extrapay;
	
	@Column
	float taxes;

	public Temp_emp() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Temp_emp(int id, String name, String email, String contactno, float basic) {
		super(id, name, email, contactno, basic);
		// TODO Auto-generated constructor stub
	}

	

	public Temp_emp(int id,float extrapay, float taxes) {
		super(id);
		this.extrapay = extrapay;
		this.taxes = taxes;
	}

	public float getExtrapay() {
		return extrapay;
	}

	public void setExtrapay(float extrapay) {
		this.extrapay = extrapay;
	}

	public float getTaxes() {
		return taxes;
	}

	public void setTaxes(float taxes) {
		this.taxes = taxes;
	}
	
	
	
	
}
