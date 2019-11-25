package com.ajie.pay.wx;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author: wyj
 * @date: 2019/11/20
 * @description:
 */
@Controller
public class WxPayController {

    @RequestMapping("/index")
    public String index() {
        return "index";
    }

    @RequestMapping("/pay")
    public String pay() {
        return "payment";
    }
}