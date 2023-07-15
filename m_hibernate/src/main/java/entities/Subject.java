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
@Table(name="Subject")
public class Subject {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int subjectid;
	@Column
	private String name;
	@Column
	private String desc;
	
	@OneToMany(mappedBy = "subject")
	@Cascade(value=CascadeType.ALL)
	Set<Questions> questions;

	public Subject() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Subject(int subjectid, String name, String desc, Set<Questions> questions) {
		super();
		this.subjectid = subjectid;
		this.name = name;
		this.desc = desc;
		this.questions = questions;
	}

	

	public Subject(int subjectid, String name, Set<Questions> questions) {
		super();
		this.subjectid = subjectid;
		this.name = name;
		this.questions = questions;
	}

	public int getSubjectid() {
		return subjectid;
	}

	public void setSubjectid(int subjectid) {
		this.subjectid = subjectid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public Set<Questions> getQuestions() {
		return questions;
	}

	public void setQuestions(Set<Questions> questions) {
		this.questions = questions;
	}
	
	
	
	
}
