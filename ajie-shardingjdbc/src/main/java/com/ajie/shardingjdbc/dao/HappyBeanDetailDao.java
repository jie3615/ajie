package com.ajie.shardingjdbc.dao;

import com.ajie.shardingjdbc.bean.HappyBeanDetail;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

/**
 * @author: wyj
 * @date: 2020/1/9
 * @description:
 */
@Mapper
@Component
public interface HappyBeanDetailDao {
    int insertBean(HappyBeanDetail happyBeanDetail);
}
