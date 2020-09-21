package com.baozi.jasperprint.service;

import com.baozi.jasperprint.dao.ReportDao;
import com.baozi.jasperprint.util.CloseIoUtils;
import net.sf.jasperreports.engine.*;
import net.sf.jasperreports.engine.data.JRMapCollectionDataSource;
import net.sf.jasperreports.engine.util.JRLoader;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Service;
import java.io.File;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class ReportSeriveImpl implements ReportSerive {
    private static Map<String, Object> parametersMap = new HashMap<>();

    @Autowired
    private ReportDao reportDao;
    public List getData(){
        return reportDao.getData();
    }

    public JasperPrint getJasperPrint(){
        InputStream jasperStream = null;
        JasperPrint jasperPrint = null;
        //获取模板
        ClassPathResource resource = new ClassPathResource("jasper" + File.separator + "demo.jasper");
        //根据源数据类型使用JRDataSource的相应的子类创建数据源
        JRDataSource dataSource = new JRMapCollectionDataSource(getData());
        try {
            jasperStream = resource.getInputStream();
            JasperReport jasperReport = (JasperReport) JRLoader.loadObject(jasperStream);
            //三个参数分别为模板，parametersMap可以为数据树根节点添加额外参数，数据
            jasperPrint = JasperFillManager.fillReport(jasperReport,parametersMap,dataSource);
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            CloseIoUtils.closeAll(jasperStream);
        }
        return  jasperPrint;
    }
}
