package com.bz.controller;

import com.bz.dto.RecordDTO;
import com.bz.pojo.TransactionRecord;
import com.bz.service.TransactionRecordService;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/transactionRecord")
public class TransactionRecordController {
    @Autowired
    private TransactionRecordService transactionRecordService;

    @RequestMapping("/query")
    public String queryAllByTime(RecordDTO recordDTO, Model model){
        //查询所有交易记录
        PageInfo<TransactionRecord> page = transactionRecordService.queryByCardNo(recordDTO);
        model.addAttribute("page","record");
        model.addAttribute("pageInfo",page);
        return "main";
    }
    @RequestMapping("/index")
    public String index(Model model){
        model.addAttribute("page","record");
        return "main";
    }
}
