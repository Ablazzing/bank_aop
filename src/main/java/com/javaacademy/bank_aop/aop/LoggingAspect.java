package com.javaacademy.bank_aop.aop;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
@Aspect
@Slf4j
public class LoggingAspect {

    @Pointcut(value = "execution(* com.javaacademy.bank_aop.*.*(..))")
    public void findAllInCalc() {
    }

    @Before("findAllInCalc()")
    public void logging(JoinPoint joinPoint) {
        log.info("Вызов {}", joinPoint.getSignature());
        if (true) {
            throw new RuntimeException("проблема!");
        }
        Object[] args = joinPoint.getArgs();
        log.info("аргументы {}", Arrays.toString(args));
    }
}
