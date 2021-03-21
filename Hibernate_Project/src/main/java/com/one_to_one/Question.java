package com.one_to_one;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Question {

	@Id
	private int Question_id;
	
	@Column(name="Questions",length=500)
	private String quest;
	
	@OneToOne
	@JoinColumn(name="A_id")
	private Answer answer;
	
	
	public Answer getAnswer() {
		return answer;
	}

	public void setAnswer(Answer answer) {
		this.answer = answer;
	}
	

	public Question(int question_id, String quest) {
		super();
		Question_id = question_id;
		this.quest = quest;
	}

	public Question() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getQuestion_id() {
		return Question_id;
	}

	public void setQuestion_id(int question_id) {
		Question_id = question_id;
	}

	public String getQuest() {
		return quest;
	}

	public void setQuest(String quest) {
		this.quest = quest;
	}

	@Override
	public String toString() {
		return "Question [Question_id=" + Question_id + ", quest=" + quest + "]";
	}
	
	
	
}
