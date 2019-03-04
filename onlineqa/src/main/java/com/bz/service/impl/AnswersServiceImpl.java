package com.bz.service.impl;

import com.bz.mapper.AnswersMapper;
import com.bz.mapper.QuestionsMapper;
import com.bz.pojo.Answers;
import com.bz.service.AnswersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service("answersService")
public class AnswersServiceImpl implements AnswersService {
    @Autowired
    private AnswersMapper answersMapper;
    @Autowired
    private QuestionsMapper questionsMapper;
    @Override
    public boolean add(Answers answers) {
        answers.setAnsDate(new Date());
        int row = answersMapper.add(answers);
        if(row==1){
            row = questionsMapper.updateAnsCountPlusOne(answers.getQid());
            return row == 1?true:false;
        }else {
            return false;
        }
    }
}
