package com.bz.controller;

import com.bz.pojo.Questions;
import com.bz.service.QuestionsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class indexController {
    @Autowired
    private QuestionsService questionsService;
    @RequestMapping("/")
    public String index(Model model){
       List<Questions> l = questionsService.queryAll();
       model.addAttribute("questions",l);
        return "main";
    }
}
