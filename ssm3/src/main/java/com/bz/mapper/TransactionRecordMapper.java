package com.bz.mapper;

import com.bz.dto.RecordDTO;
import com.bz.pojo.TransactionRecord;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TransactionRecordMapper {
    int insert(TransactionRecord transactionRecord);

    List<TransactionRecord> queryByCardNo(RecordDTO recordDTO);

}
