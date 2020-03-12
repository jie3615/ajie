package com.ajie.pay.unionpay.acp.sdk.controller;

import com.ajie.pay.unionpay.acp.sdk.service.PayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @author: wyj
 * @date: 2020/3/11
 * @description:
 */
@RestController
public class PayController {

    @Autowired
    PayService payService;
    @RequestMapping("/pay")
    public void pay(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        resp.setCharacterEncoding("utf-8");
        String pay = payService.pay(req, resp);
        PrintWriter out = resp.getWriter();
        out.print(pay);
        out.close();
//        return pay;
    }
    @RequestMapping("/refund")
    public void refund(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        resp.setCharacterEncoding("utf-8");
        String pay = payService.refound(req, resp);
        PrintWriter out = resp.getWriter();
        out.print(pay);
        out.close();
//        return pay;
    }

    @RequestMapping("/query")
    public void query(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        resp.setCharacterEncoding("utf-8");
        payService.query(req, resp);
    }
}