package com.atyang.service;

import com.atyang.entities.Payment;

/**
 * @author yang
 * @create 2023-05-05 22:20
 */
public interface PaymentService {

    int create(Payment payment);

    Payment selectById(Long id);
}
