package com.bz.controller;

import com.bz.pojo.DevUser;
import com.bz.service.DevUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/dev")
public class DevUserController {
    @Autowired
    private DevUserService devUserService;
    @RequestMapping("/toLogin")
    public String toLogin(){
        return "dev/login";
    }
    @RequestMapping("/login")
    public String index(DevUser devUser, Model model, HttpSession session){
        devUser = devUserService.login(devUser);
        if(devUser != null){
            session.setAttribute("devUser",devUser);
            return "dev/index";
        }else {
            model.addAttribute("errMsg","登录失败");
            return "dev/login";
        }
    }
    @RequestMapping("/loginOut")
    public String loginOut(HttpSession session){
        session.removeAttribute("devUser");
        session.invalidate();
        return "redirect:/";
    }
}
