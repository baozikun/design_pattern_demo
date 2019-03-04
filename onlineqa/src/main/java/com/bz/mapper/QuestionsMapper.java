package com.bz.mapper;

import com.bz.pojo.Questions;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface QuestionsMapper {

  int add(Questions questions);


    List<Questions> query();

    Questions queryAnswers(@Param("id") Long id);

    Questions queryWithoutAnswers(@Param("id") Long id);

    int updateAnsCountPlusOne(@Param("qid") Long qid);


}
