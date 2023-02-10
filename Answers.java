package com.tut2.ProjectWithMaven21;

import javax.persistence.*;

@Entity
public class Answers {

	@Id
	@Column(name="ans_colmn")
	private int anserId;
	private String answer;
	
	
	
	public int getAnserId() {
		return anserId;
	}
	public void setAnserId(int anserId) {
		this.anserId = anserId;
	}
	public String getAnswer() {
		return answer;
	}
	public void setAnswer(String answer) {
		this.answer = answer;
	}
	 
}
