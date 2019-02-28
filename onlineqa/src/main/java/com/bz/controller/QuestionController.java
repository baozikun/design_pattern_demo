package com.bz.controller;

import com.bz.pojo.Questions;
import com.bz.service.QuestionsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/question")
public class QuestionController {
    @Autowired
    private QuestionsService questionsService;
    @RequestMapping("/add")
    public String add(Questions questions){
       boolean addSuc = questionsService.add(questions);
        return "redirect:/";
    }
}
