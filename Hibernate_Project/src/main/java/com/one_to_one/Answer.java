package com.one_to_one;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Answer {
	@Id
	private int Answer_id;
	
	@Column(length=500)
	private String answers;

	public Answer(int answer_id, String answers) {
		super();
		Answer_id = answer_id;
		this.answers = answers;
	}

	public Answer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getAnswer_id() {
		return Answer_id;
	}

	public void setAnswer_id(int answer_id) {
		Answer_id = answer_id;
	}

	public String getAnswers() {
		return answers;
	}

	public void setAnswers(String answers) {
		this.answers = answers;
	}

	@Override
	public String toString() {
		return "Answer [Answer_id=" + Answer_id + ", answers=" + answers + "]";
	}
	
	

}
