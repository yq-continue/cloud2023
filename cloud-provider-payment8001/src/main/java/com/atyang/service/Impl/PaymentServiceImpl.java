package com.atyang.service.Impl;

import com.atyang.dao.PaymentDao;
import com.atyang.entities.Payment;
import com.atyang.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author yang
 * @create 2023-05-05 22:21
 */
@Service
public class PaymentServiceImpl implements PaymentService {

    @Autowired
    private PaymentDao paymentDao;

    @Override
    public int create(Payment payment) {
        return paymentDao.create(payment);
    }

    @Override
    public Payment selectById(Long id) {
        return paymentDao.selectById(id);
    }
}
