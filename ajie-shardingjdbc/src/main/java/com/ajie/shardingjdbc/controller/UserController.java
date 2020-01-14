package com.ajie.shardingjdbc.controller;

import com.ajie.shardingjdbc.bean.HappyBeanDetail;
import com.ajie.shardingjdbc.dao.HappyBeanDetailDao;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author: wyj
 * @date: 2020/1/9
 * @description:
 */
@RestController
@RequestMapping("/happyBean")
public class UserController {
    @Resource
    private HappyBeanDetailDao happyBeanDetailDao;

    @GetMapping("/save")
    public HappyBeanDetail saveHappyBean(@RequestParam(value = "id") Long id){
        //转换时间格式
        SimpleDateFormat simpleDate = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date nowdate = new Date();
        HappyBeanDetail b = new HappyBeanDetail();
        b.setChangeNum(2);
        b.setCreatedBy(232L);
        b.setCreatedOn(Timestamp.valueOf(simpleDate.format(nowdate)));
        b.setHappybeanId(33L);
        b.setOperationName("卡1西");
        b.setOperationType(1);
        b.setSign(1);
        b.setNum(100);
        b.setDeleted(false);
        b.setRequirement("冯绍峰");
        b.setModifiedBy(323L);
        b.setModifiedOn(Timestamp.valueOf(simpleDate.format(nowdate)));
        happyBeanDetailDao.insertBean(b);
        return b;

    }
}