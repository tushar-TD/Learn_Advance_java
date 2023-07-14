package entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;



@Entity
@Table(name="products")
public class Product {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int pid;
	@Column
	private String name;
	@Column
	private Float price;
//	@Column
//	private int catid;
	
	@ManyToOne
	@JoinColumn(name="cid")
	private Category catagory;
	public Product() {
		super();
	}
	public Product(String name, Float price, Category catagory) {
		super();
		this.name = name;
		this.price = price;
		//this.catid = catid;
		this.catagory = catagory;
	}
	
	public Product(String name, Float price) {
		super();
		this.name = name;
		this.price = price;
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Float getPrice() {
		return price;
	}
	public void setPrice(Float price) {
		this.price = price;
	}
//	public int getCatid() {
//		return catid;
//	}
//	public void setCatid(int catid) {
//		this.catid = catid;
//	}
	public Category getCatagory() {
		return catagory;
	}
	public void setCatagory(Category catagory) {
		this.catagory = catagory;
	}
	
	
}
