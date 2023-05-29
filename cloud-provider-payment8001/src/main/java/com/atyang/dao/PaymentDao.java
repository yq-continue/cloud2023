package com.atyang.dao;

import com.atyang.entities.CommonResult;
import com.atyang.entities.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * @author yang
 * @create 2023-05-05 22:03
 */
@Repository
public interface PaymentDao  {

    int create(Payment payment);

    Payment selectById(@Param("id") Long id);

}
