package com.javaacademy.bank_aop;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Component
@RequiredArgsConstructor
@Slf4j
public class CreditService {
    private final CreditCalc calc;

    public BigDecimal takeOffer(Person person) {
        sayHelloClient();
        BigDecimal result = calc.calcMaxSum(person.getSalary(), person.getAge());
        log.info("Мы можем предложить кредит: {}", result);
        return result;
    }

    private void sayHelloClient() {
        log.info("Добро пожаловать в банк!");
    }
}
