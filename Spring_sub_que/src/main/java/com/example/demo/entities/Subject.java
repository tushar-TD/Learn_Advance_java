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

import org.hibernate.annotations.GeneratorType;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name="subject")
public class Subject {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int sid;
	
	@Column
	private String name;
	
	@Column
	private String desc;
	
	@JsonIgnoreProperties("subject")
	@OneToMany(mappedBy = "subject",cascade = CascadeType.ALL)
	Set<Questions>Questions;

	public Subject() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Subject(int sid, String name, String desc, Set<com.example.demo.entities.Questions> questions) {
		super();
		this.sid = sid;
		this.name = name;
		this.desc = desc;
		Questions = questions;
	}

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
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
		return Questions;
	}

	public void setQuestions(Set<Questions> questions) {
		Questions = questions;
	}
	
	
}
