package com.dsj.service;

public interface AnswerService {
	
	/**
	 * 获取学生答案与成绩与试卷号
	 * @param exam_id
	 * @param stu_id
	 * @return
	 */
	String queryStuAnsAndGraAndPap(int exam_id,int stu_id);
	
	/**
	 * 获取正确答案
	 * @param ques_id
	 * @return
	 */
	String queryRigAns(int ques_id);
	
	/**
	 * 获取所有的题目
	 * @param paper_id
	 * @return
	 */
	String queryquestions(int paper_id);
}
