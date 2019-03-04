package com.bz.controller;

import com.bz.pojo.Answers;
import com.bz.service.AnswersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/answer")
public class AnswersController {
    @Autowired
    private AnswersService answersService;
    @RequestMapping("/add")
    public String add(Answers answers){
       boolean suc = answersService.add(answers);
        return "redirect:/";
    }
}
