package com.bz.service.impl;

import com.bz.dto.RecordDTO;
import com.bz.mapper.TransactionRecordMapper;
import com.bz.pojo.TransactionRecord;
import com.bz.service.TransactionRecordService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("transactionRecordService")
public class TransactionRecordServiceImpl implements TransactionRecordService {
    @Autowired
    private TransactionRecordMapper transactionRecordMapper;
    @Override
    public PageInfo<TransactionRecord> queryByCardNo(RecordDTO recordDTO) {
        PageHelper.startPage(recordDTO.getPageNumber(),recordDTO.getPageSize());
        List<TransactionRecord> l = transactionRecordMapper.queryByCardNo(recordDTO);
        PageInfo<TransactionRecord> page = new PageInfo<>(l);
        return  page;
    }
}
