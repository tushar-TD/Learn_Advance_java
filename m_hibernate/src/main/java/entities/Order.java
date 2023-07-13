package entities;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

@Entity
@Table(name="orders")
public class Order {
	
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	int oid;
	
	@Column
	String cname;
	
	
	@OneToMany(mappedBy="order")//should be match with Order's order in orderitem
	@Cascade(value=CascadeType.ALL)
	Set<Orderitem> item;


	public Order() {
		super();
		// TODO Auto-generated constructor stub
	}

	


	public Order(String cname) {
		super();
		this.cname = cname;
	}




	public Order(String cname, Set<Orderitem> item) {
		super();
		this.cname = cname;
		for(Orderitem oi:item)
			oi.setOrder(this);
		this.item = item;
	}


	public int getOid() {
		return oid;
	}


	public void setOid(int oid) {
		this.oid = oid;
	}


	public String getCname() {
		return cname;
	}


	public void setCname(String cname) {
		this.cname = cname;
	}


	public Set<Orderitem> getItem() {
		return item;
	}


	public void setItem(Set<Orderitem> item) {
		for(Orderitem oi:item)
			oi.setOrder(this);
			
		this.item = item;
	}
	
	
	
	
	
	
}
