package com.suwian.springcloud.service;


import com.suwian.springcloud.entities.Payment;

/**
 * @author : sirc_hzr
 * @version : 1.0
 * @date : 2020/4/18 13:31
 */
public interface PaymentService {
    public int create(Payment payment);

    public Payment getPaymentById(long id);
}
