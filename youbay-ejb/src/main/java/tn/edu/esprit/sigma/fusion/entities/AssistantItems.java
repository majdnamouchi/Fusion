package tn.edu.esprit.sigma.fusion.entities;

import java.io.Serializable;
import java.lang.Integer;
import java.lang.String;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: AssistantItems
 *
 */
@Entity
@Table(name = "T_ASSISTANTITEMS")
public class AssistantItems implements Serializable {

	
	private Long assistantItemsId;
	private Integer questionDisplayPriority;
	private String questionText;
	private String negativeAnswer;
	private String affirmativeAnswer;
	private String negativeAnswerQuery;
	private String affirmativeAnswerQuery;
	private static final long serialVersionUID = 1L;

	public AssistantItems() {
		super();
	}   
	
	public AssistantItems(Integer questionDisplayPriority, String questionText,
			String negativeAnswer, String affirmativeAnswer,
			String negativeAnswerQuery, String affirmativeAnswerQuery) {
		super();
		this.questionDisplayPriority = questionDisplayPriority;
		this.questionText = questionText;
		this.negativeAnswer = negativeAnswer;
		this.affirmativeAnswer = affirmativeAnswer;
		this.negativeAnswerQuery = negativeAnswerQuery;
		this.affirmativeAnswerQuery = affirmativeAnswerQuery;
	}

	@Id   
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public Long getAssistantItemsId() {
		return this.assistantItemsId;
	}

	public void setAssistantItemsId(Long assistantItemsId) {
		this.assistantItemsId = assistantItemsId;
	}   
	public Integer getQuestionDisplayPriority() {
		return this.questionDisplayPriority;
	}

	public void setQuestionDisplayPriority(Integer questionDisplayPriority) {
		this.questionDisplayPriority = questionDisplayPriority;
	}
	@Column(length=35)
	public String getQuestionText() {
		return this.questionText;
	}

	public void setQuestionText(String questionText) {
		this.questionText = questionText;
	}   
	@Column(length=35)
	public String getNegativeAnswer() {
		return this.negativeAnswer;
	}

	public void setNegativeAnswer(String negativeAnswer) {
		this.negativeAnswer = negativeAnswer;
	}   
	@Column(length=35)
	public String getAffirmativeAnswer() {
		return this.affirmativeAnswer;
	}

	public void setAffirmativeAnswer(String affirmativeAnswer) {
		this.affirmativeAnswer = affirmativeAnswer;
	}   
	@Column(length=100)
	public String getNegativeAnswerQuery() {
		return this.negativeAnswerQuery;
	}

	public void setNegativeAnswerQuery(String negativeAnswerQuery) {
		this.negativeAnswerQuery = negativeAnswerQuery;
	}   
	@Column(length=100)
	public String getAffirmativeAnswerQuery() {
		return this.affirmativeAnswerQuery;
	}

	public void setAffirmativeAnswerQuery(String affirmativeAnswerQuery) {
		this.affirmativeAnswerQuery = affirmativeAnswerQuery;
	}
   
}
