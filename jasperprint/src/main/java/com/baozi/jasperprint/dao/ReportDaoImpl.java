package com.baozi.jasperprint.dao;

import org.springframework.stereotype.Repository;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class ReportDaoImpl implements ReportDao {

    public List getData(){
        List<Map<String,Object>> list = new ArrayList<>();
        Map<String, Object> map = new HashMap<>();
        map.put("name","张三");
        map.put("sex","男");
        map.put("age","18");
        list.add(map);
        return list;
    }
}
