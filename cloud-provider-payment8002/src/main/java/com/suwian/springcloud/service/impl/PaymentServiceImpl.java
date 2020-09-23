package com.suwian.springcloud.service.impl;

import com.suwian.springcloud.entities.Payment;
import com.suwian.springcloud.mapper.PaymentMapper;
import com.suwian.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author : sirc_hzr
 * @version : 1.0
 * @date : 2020/4/18 13:34
 */
@Service
@Slf4j
public class PaymentServiceImpl implements PaymentService {

    private final PaymentMapper paymentMapper;

    @Autowired
    public PaymentServiceImpl(PaymentMapper paymentMapper) {
        this.paymentMapper = paymentMapper;
    }


    @Override
    public int create(Payment payment) {
        return paymentMapper.insert(payment);
    }

    @Override
    public Payment getPaymentById(long id) {
        return paymentMapper.selectById(id);
    }
}
