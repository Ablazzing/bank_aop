package com.javaacademy.bank_aop;

import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Component
public class CreditCalc {


    public BigDecimal calcMaxSum(BigDecimal salary, int age) {
        if (age < 18) {
            return BigDecimal.ZERO;
        } else if (age < 60) {
            return salary.multiply(BigDecimal.valueOf(10));
        } else {
            return salary.multiply(BigDecimal.valueOf(2));
        }
    }


}
