package com.bz.mapper;

import com.bz.pojo.Questions;

import java.util.List;

public interface QuestionsMapper {

  int add(Questions questions);


    List<Questions> query();
}
