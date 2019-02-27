package com.bz.service.impl;

import com.bz.mapper.QuestionsMapper;
import com.bz.pojo.Questions;
import com.bz.service.QuestionsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("questionsService")
public class QuestionsServiceImpl implements QuestionsService {
    @Autowired
    private QuestionsMapper questionsMapper;
    @Override
    public List<Questions> queryAll() {
        return questionsMapper.query();
    }
}
