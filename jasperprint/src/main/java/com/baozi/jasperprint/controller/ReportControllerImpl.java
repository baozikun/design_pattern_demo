package com.baozi.jasperprint.controller;

import com.baozi.jasperprint.service.ReportSerive;
import com.baozi.jasperprint.util.CloseIoUtils;
import net.sf.jasperreports.engine.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import javax.servlet.http.HttpServletResponse;
import java.io.OutputStream;

@RestController
public class ReportControllerImpl implements ReportController {

    @Autowired
    private ReportSerive reportSerive;
    @GetMapping("/print")
    public void print(HttpServletResponse response) {
        //设置响应参数
        response.setContentType("application/pdf");
        response.setHeader("Content-Disposition", "inline;");
        OutputStream outputStream = null;
        try {
            outputStream = response.getOutputStream();
            //浏览器输出Pdf流
            JasperExportManager.exportReportToPdfStream(reportSerive.getJasperPrint(), outputStream);
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            CloseIoUtils.closeAll(outputStream);
        }
    }
}
