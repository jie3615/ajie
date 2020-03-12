package com.ajie.pay.unionpay.acp.sdk.service;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author: wyj
 * @date: 2020/3/11
 * @description:
 */
public interface PayService {
    // 跳转支付
    String pay(HttpServletRequest req, HttpServletResponse resp);

    // 异步返回商户
    String backRecive(HttpServletRequest req, HttpServletResponse resp) throws IOException;

    // 同步返回商户
    String frontRecive(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException;

    //退款
    String refound(HttpServletRequest req, HttpServletResponse resp) throws IOException;

    // 退款通知
    String refundRecive(HttpServletRequest req, HttpServletResponse resp) throws IOException;

    /**
     * 交易状态查询
     * @param request
     * @param response
     */
    void query(HttpServletRequest request, HttpServletResponse response) throws IOException;

}
