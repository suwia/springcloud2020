package com.suwian.springcloud;

import com.suwian.springcloud.entities.Payment;
import com.suwian.springcloud.mapper.PaymentMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * @author : sirc_hzr
 * @version : 1.0
 * @date : 2020/4/18 13:27
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class PaymentTest {

    @Autowired
    private PaymentMapper paymentMapper;

    @Test
    public void testSelect() {
        List<Payment> payments = paymentMapper.selectList(null);
        System.out.println(payments);
    }

    @Test
    public void testInsert() {
        Payment test2 = new Payment("test2");
        int insert = paymentMapper.insert(test2);
        System.out.println(insert);
    }
}
