package com.dsj.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dsj.mapper.AnswerMapper;
import com.dsj.service.AnswerService;

@Service
public class AnswerServiceImpl implements AnswerService {

	@Autowired
	AnswerMapper ansmapper;
	
	@Transactional(readOnly=true)
	public String queryStuAnsAndGraAndPap(int exam_id, int stu_id) {
		return ansmapper.queryStuAnsAndGraAndPap(exam_id, stu_id);
	}

	@Transactional(readOnly=true)
	public String queryRigAns(int ques_id) {
		return ansmapper.queryRigAns(ques_id);
	}

	public String queryquestions(int paper_id) {
		// TODO Auto-generated method stub
		return ansmapper.queryquestions(paper_id);
	}

}
