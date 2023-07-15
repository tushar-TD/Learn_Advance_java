package models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="emp")
public class Emp {

	@Id
	int EMPNO;
	@Column
	String ename;
	@Column
	int deptno;
	@Column
	float SAL;
	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Emp(int empid, String ename, int deptno, float salary) {
		super();
		this.EMPNO = empid;
		this.ename = ename;
		this.deptno = deptno;
		this.SAL = salary;
	}
	public int getEmpid() {
		return EMPNO;
	}
	public void setEmpid(int empid) {
		this.EMPNO = empid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public int getDeptno() {
		return deptno;
	}
	public void setDeptno(int deptno) {
		this.deptno = deptno;
	}
	public float getSalary() {
		return SAL;
	}
	public void setSalary(float salary) {
		this.SAL = salary;
	}
	
	
}
