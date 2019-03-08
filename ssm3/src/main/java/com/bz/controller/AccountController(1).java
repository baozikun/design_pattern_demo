package com.bz.controller;

import com.bz.constant.StatusCodeConstants;
import com.bz.pojo.Account;
import com.bz.service.AccountService;
import com.bz.service.TransactionRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;
import java.math.BigDecimal;
import java.util.Map;

@Controller
@RequestMapping("/account")
public class AccountController {

    @Autowired
    private AccountService accountService;
    @RequestMapping("/login")
    public String login(Account account, Model model, HttpSession session) {
        boolean existsCardNo = accountService.exists(account.getCardNo());
        if (existsCardNo) {
            account = accountService.login(account);
            //卡号密码登陆
            if (account == null) {
                //密码错误
                model.addAttribute("errorMsg", "密码错误");
                return "index";
            } else {
                //检测状态
                if (account.getStatus() == 0) {
                    //冻结
                    model.addAttribute("errorMsg", "账号被冻结");
                    return "index";
                }else{
                    //登录成功
                    session.setAttribute("account",account);
                    return "main";
                }
            }
        }else{
            //卡号不存在错误
            model.addAttribute("errorMsg", "卡号不存在");
            return "index";
        }
    }

    @RequestMapping("/loginOut")
    public String loginout(HttpSession session){
        session.removeAttribute("account");
        session.invalidate();
        return "redirect:/";
    }

    @RequestMapping("/balance/{cardNo}")
    public String queryBalance(@PathVariable("cardNo") String cardNo, Model model){
        double balance = accountService.queryBalance(cardNo);
        model.addAttribute("balance",balance);
        model.addAttribute("page","balance");
        return "main";
    }

    @RequestMapping("/transferTo")
    public String transferTo(Model model){
        model.addAttribute("page","transfer");
        return "main";
    }

    @RequestMapping("/transfer")
    public String transfer(@RequestParam("cardNo")String cardNo,@RequestParam("transactionAmount")Double transactionAmount, Model model, HttpSession session){
        Account sourceAccount = (Account) session.getAttribute("account");
        Map<String,Object> map = accountService.transfer(sourceAccount,cardNo,transactionAmount);
        int code = (int) map.get("code");
        String msg = (String) map.get("msg");
        model.addAttribute("code",code);
        model.addAttribute("msg",msg);
        model.addAttribute("page","transfer");
        return "main";
    }
}


