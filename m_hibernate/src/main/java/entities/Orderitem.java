package entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.ManyToAny;

@Entity 
@Table(name="Orderitems")
public class Orderitem {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int oiid;
	
	@Column
	int pid;
	
	@Column
	int qty;
	
	@ManyToOne
	@JoinColumn(name="oid")
	Order order;

	public Orderitem() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	public Orderitem(int pid, int qty) {
		super();
		this.pid = pid;
		this.qty = qty;
	}


	public Orderitem(int pid, int qty, Order order) {
		super();
		this.pid = pid;
		this.qty = qty;
		this.order = order;
	}

	public int getOiid() {
		return oiid;
	}

	public void setOiid(int oiid) {
		this.oiid = oiid;
	}

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}
	
	
	
	
}
