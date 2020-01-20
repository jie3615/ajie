package com.ajie.shardingjdbc.dao;

import com.ajie.shardingjdbc.bean.HappyBeanDetail;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author: wyj
 * @date: 2020/1/9
 * @description:
 */
@Mapper
@Component
public interface HappyBeanDetailDao {
    // 插入
    int insertBean(HappyBeanDetail happyBeanDetail);
    // 根据id列表查询
    List<HappyBeanDetail> listHappyBeanByIds(@Param("ids") List<Long> ids);

}
