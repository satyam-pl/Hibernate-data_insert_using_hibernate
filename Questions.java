package com.tut2.ProjectWithMaven21;
import javax.persistence.*;
import java.util.*;
@Entity
public class Questions {
  @Id
  @Column(name="question_id")
	private int queId;
	private String question;
	
	
	@OneToMany
  private List<Answers> answer= new ArrayList<Answers>();
	
	
	public List<Answers> getAnswr() {
		return answer;
	}
	
	public void setAnswer(List<Answers> answer) {
		this.answer = answer;
	}

	public int getQueId() {
		return queId;
	}
	public void setQueId(int queId) {
		this.queId = queId;
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	
	}
	
	
	
}
