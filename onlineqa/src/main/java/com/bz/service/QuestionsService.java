package com.bz.service;

import com.bz.pojo.Questions;

import java.util.List;

public interface QuestionsService {
    List<Questions> queryAll();

    boolean add(Questions questions);

    Questions queryAnswes(Long id);
}
