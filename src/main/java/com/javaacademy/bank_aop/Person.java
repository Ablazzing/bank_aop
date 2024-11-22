package com.javaacademy.bank_aop;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
public class Person {
    private BigDecimal salary;
    private int age;
}
