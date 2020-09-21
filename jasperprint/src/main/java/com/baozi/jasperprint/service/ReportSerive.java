package com.baozi.jasperprint.service;

import net.sf.jasperreports.engine.JasperPrint;
import java.util.List;



public interface ReportSerive {
    List getData();

    JasperPrint getJasperPrint();
}
