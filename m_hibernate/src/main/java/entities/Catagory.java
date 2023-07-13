package entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="catagory")
public class Catagory {

	@Column
	String cname;
	
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY )
	int cid;
	
	@Column
	String desc;
}
