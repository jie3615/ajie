package com.ajie.pay.unionpay.acp.sdk.controller;

import com.ajie.pay.unionpay.acp.sdk.service.PayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author: wyj
 * @date: 2020/3/11
 * @description:
 */
@Controller
@RequestMapping("/callback")
public class CallBackController {
    @Autowired
    PayService payService;

    @RequestMapping("/front")
    @ResponseBody
    public String front(HttpServletRequest req , HttpServletResponse resp) throws IOException, ServletException {
        String s = payService.frontRecive(req, resp);
        return "您已经支付成功了！";
    }

    @RequestMapping("/back")
    public String back(HttpServletRequest req , HttpServletResponse resp) throws IOException {
        String s = payService.backRecive(req, resp);
        return s;

    }

    @RequestMapping("/refundRecive")
    public String refundRecive(HttpServletRequest req , HttpServletResponse resp) throws IOException {
        String s = payService.refundRecive(req, resp);
        return "您已经退款成功了！";

    }
}