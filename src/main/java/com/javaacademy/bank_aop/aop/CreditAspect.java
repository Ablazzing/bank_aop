package com.javaacademy.bank_aop.aop;

import com.javaacademy.bank_aop.Person;
import lombok.SneakyThrows;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Component
@Aspect
public class CreditAspect {

    @Pointcut(value = "execution(* com.javaacademy.bank_aop.CreditService.takeOffer(..))")
    public void findTakeOffer() {

    }

    @Around("findTakeOffer()")
    @SneakyThrows
    public Object changePerson(ProceedingJoinPoint joinPoint) {
        Person person = (Person) joinPoint.getArgs()[0];
        if (person.getAge() == 0 && person.getSalary().equals(BigDecimal.ZERO)) {
            person.setAge(20);
            person.setSalary(BigDecimal.valueOf(1_000_000));
        }
        return joinPoint.proceed(new Object[]{person});
    }
}
