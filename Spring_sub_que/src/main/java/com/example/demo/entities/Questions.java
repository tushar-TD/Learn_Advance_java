package com.example.demo.entities;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GeneratorType;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name="questions")
public class Questions {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int qid;
	
	@Column
	private String que;
	@JsonIgnoreProperties("qustions")
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="sid")
	Subject subject;
	public Questions() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Questions(int qid, String que, Subject subject) {
		super();
		this.qid = qid;
		this.que = que;
		this.subject = subject;
	}
	public int getQid() {
		return qid;
	}
	public void setQid(int qid) {
		this.qid = qid;
	}
	public String getQue() {
		return que;
	}
	public void setQue(String que) {
		this.que = que;
	}
	public Subject getSubject() {
		return subject;
	}
	public void setSubject(Subject subject) {
		this.subject = subject;
	}
	
	
	
	
	
	
}
