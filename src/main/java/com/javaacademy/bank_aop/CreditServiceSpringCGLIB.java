package com.javaacademy.bank_aop;

import com.javaacademy.bank_aop.aop.CreditAspect;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;

import java.math.BigDecimal;
import java.util.Arrays;

/**
 * Какой бин CreditService находится в контексте.
 * По факту spring создает в runtime наследника CreditService, в который добавляется функционал.
 */
@Slf4j
public class CreditServiceSpringCGLIB extends CreditService {
    private CreditService creditService;
    @Autowired
    private CreditAspect creditAspect;

    public CreditServiceSpringCGLIB(CreditService creditService, CreditCalc calc) {
        super(calc);
    }

    @Override
    public BigDecimal takeOffer(Person person) {
        //creditAspect.changePerson(person);
        return super.takeOffer(person);
    }
}
