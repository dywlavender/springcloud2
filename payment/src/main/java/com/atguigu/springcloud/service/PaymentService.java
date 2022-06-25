package com.atguigu.springcloud.service;

import com.atguigu.springcloud.entities.CommonResult;
import com.atguigu.springcloud.entities.Payment;
import org.springframework.stereotype.Service;

/**
 * @author dyw
 * @date 2022-03-02  22:04
 */

public interface PaymentService {
    public int create(Payment payment);
    public Payment getPaymentById(Long id);
}
