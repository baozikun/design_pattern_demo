package com.bz.controller;

import com.bz.pojo.Questions;
import com.bz.service.QuestionsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
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
    @RequestMapping("get/answers/{id}")
    public String getAnswers(@PathVariable("id")Long id,Model model){
        Questions questions =questionsService.queryAnswes(id);
        model.addAttribute("questions",questions);
        return "findDetail";
    }
}
