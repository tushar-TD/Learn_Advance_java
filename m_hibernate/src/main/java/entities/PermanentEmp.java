package entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name="permanent_emp")
@PrimaryKeyJoinColumn(name="id")
public class PermanentEmp extends EmpAsg {


	@Column
	float allowanace;
	
	@Column
	float bonus;
	
	@Column
	float deduction;

	

	public PermanentEmp() {
		super();
		// TODO Auto-generated constructor stub
	}

	

	public PermanentEmp(int id, String name, String email, String contactno, float basic, float allowanace, float bonus,
		float deduction) {
		super(id, name, email, contactno, basic);
		this.allowanace = allowanace;
		this.bonus = bonus;
		this.deduction = deduction;
	}
	
	
	
	

	public PermanentEmp(int id, float basic, float allowanace, float bonus, float deduction) {
		super(id, basic);
		this.allowanace = allowanace;
		this.bonus = bonus;
		this.deduction = deduction;
	}



	public float getAllowanace() {
		return allowanace;
	}

	public void setAllowanace(float allowanace) {
		this.allowanace = allowanace;
	}

	public float getBonus() {
		return bonus;
	}

	public void setBonus(float bonus) {
		this.bonus = bonus;
	}

	public float getDeduction() {
		return deduction;
	}

	public void setDeduction(float deduction) {
		this.deduction = deduction;
	}

	
	
	
	
	
	
}
