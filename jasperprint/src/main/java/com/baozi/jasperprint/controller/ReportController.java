package com.baozi.jasperprint.controller;


import javax.servlet.http.HttpServletResponse;

public interface ReportController {
    void print(HttpServletResponse response);
}
