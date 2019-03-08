package com.bz.service;

import com.bz.dto.RecordDTO;
import com.bz.pojo.TransactionRecord;
import com.github.pagehelper.PageInfo;

import java.util.List;

public interface TransactionRecordService {
    PageInfo<TransactionRecord> queryByCardNo(RecordDTO recordDTO);
}
