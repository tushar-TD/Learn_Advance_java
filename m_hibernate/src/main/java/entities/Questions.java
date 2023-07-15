package entities;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

public class Questions {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int qid;
	
	@Column
	private String text;
	@Column
	private String opt1;
	@Column
	private String opt2;
	@Column
	private String opt3;
	@Column
	private String opt4;
	@Column
	private String ans;
	
	@ManyToOne
	@JoinColumn(name="subjectid")
	Subject subject;

	public Questions() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Questions(int qid, String text, String opt1, String opt2, String opt3, String opt4, String ans,
			Subject subject) {
		super();
		this.qid = qid;
		this.text = text;
		this.opt1 = opt1;
		this.opt2 = opt2;
		this.opt3 = opt3;
		this.opt4 = opt4;
		this.ans = ans;
		this.subject = subject;
	}

	public int getQid() {
		return qid;
	}

	public void setQid(int qid) {
		this.qid = qid;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public String getOpt1() {
		return opt1;
	}

	public void setOpt1(String opt1) {
		this.opt1 = opt1;
	}

	public String getOpt2() {
		return opt2;
	}

	public void setOpt2(String opt2) {
		this.opt2 = opt2;
	}

	public String getOpt3() {
		return opt3;
	}

	public void setOpt3(String opt3) {
		this.opt3 = opt3;
	}

	public String getOpt4() {
		return opt4;
	}

	public void setOpt4(String opt4) {
		this.opt4 = opt4;
	}

	public String getAns() {
		return ans;
	}

	public void setAns(String ans) {
		this.ans = ans;
	}

	public Subject getSubject() {
		return subject;
	}

	public void setSubject(Subject subject) {
		this.subject = subject;
	}
	
	
	
	
	
}
