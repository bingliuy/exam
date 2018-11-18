
package com.dsj.pojo;


public class QuestionPool
{
	private int questionId;
	private String questionContent;
	private String optionA;
	private String optionB;
	private String optionC;
	private String optionD;
	private String optionE;
	private String optionF;
	private String rightAnswer;
	private Double questionValue;
	private String questionType;

	public QuestionPool()
	{
		super();
	}

	public QuestionPool(int questionId, String questionContent, String optionA, String optionB, String optionC,
			String optionD, String optionE, String optionF, String rightAnswer, Double questionValue,
			String questionType)
	{
		super();
		this.questionId = questionId;
		this.questionContent = questionContent;
		this.optionA = optionA;
		this.optionB = optionB;
		this.optionC = optionC;
		this.optionD = optionD;
		this.optionE = optionE;
		this.optionF = optionF;
		this.rightAnswer = rightAnswer;
		this.questionValue = questionValue;
		this.questionType = questionType;
	}

	public int getQuestionId()
	{
		return questionId;
	}

	public void setQuestionId(int questionId)
	{
		this.questionId = questionId;
	}

	public String getQuestionContent()
	{
		return questionContent;
	}

	public void setQuestionContent(String questionContent)
	{
		this.questionContent = questionContent;
	}

	public String getOptionA()
	{
		return optionA;
	}

	public void setOptionA(String optionA)
	{
		this.optionA = optionA;
	}

	public String getOptionB()
	{
		return optionB;
	}

	public void setOptionB(String optionB)
	{
		this.optionB = optionB;
	}

	public String getOptionC()
	{
		return optionC;
	}

	public void setOptionC(String optionC)
	{
		this.optionC = optionC;
	}

	public String getOptionD()
	{
		return optionD;
	}

	public void setOptionD(String optionD)
	{
		this.optionD = optionD;
	}

	public String getOptionE()
	{
		return optionE;
	}

	public void setOptionE(String optionE)
	{
		this.optionE = optionE;
	}

	public String getOptionF()
	{
		return optionF;
	}

	public void setOptionF(String optionF)
	{
		this.optionF = optionF;
	}

	public String getRightAnswer()
	{
		return rightAnswer;
	}

	public void setRightAnswer(String rightAnswer)
	{
		this.rightAnswer = rightAnswer;
	}

	public Double getQuestionValue()
	{
		return questionValue;
	}

	public void setQuestionValue(Double questionValue)
	{
		this.questionValue = questionValue;
	}

	public String getQuestionType()
	{
		return questionType;
	}

	public void setQuestionType(String questionType)
	{
		this.questionType = questionType;
	}

	@Override
	public String toString()
	{
		return "QuestionPool [questionId=" + questionId + ", questionContent=" + questionContent + ", optionA="
				+ optionA + ", optionB=" + optionB + ", optionC=" + optionC + ", optionD=" + optionD + ", optionE="
				+ optionE + ", optionF=" + optionF + ", rightAnswer=" + rightAnswer + ", questionValue=" + questionValue
				+ ", questionType=" + questionType + "]";
	}

}

