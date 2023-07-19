package com.example.demo.entities;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
@Entity
@Table(name="category")
public class Category {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer cid;
	@Column
	private String cname;
	//cascade if we del from category all products under category get deleted
	//json Ignore properties is for not to fetch repertative data ex.inside product we have category and inside category we have product so the cycle should not get in continuos manner.
	@JsonIgnoreProperties("category")
	@OneToMany(mappedBy = "category",cascade=CascadeType.ALL)
	
	Set<Product> products;//pid,pname,category
	public Category() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Category(Integer cid, String cname, Set<Product> products) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.products = products;
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public Set<Product> getProducts() {
		return products;
	}
	public void setProducts(Set<Product> products) {
		this.products = products;
	}
	
	
}
