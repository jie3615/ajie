package com.ajie.pay.unionpay.acp.sdk.load;

import com.ajie.pay.unionpay.acp.sdk.SDKConfig;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * @author: wyj
 * @date: 2020/3/11
 * @description:
 */
@Component
public class AutoLoadRunner implements CommandLineRunner{

    @Override
    public void run(String... args) throws Exception {
        SDKConfig.getConfig().loadPropertiesFromSrc();
        System.out.println(">>>>>>>>>>>>服务启动，加载数据文件>>>>>>>>>");
    }
}