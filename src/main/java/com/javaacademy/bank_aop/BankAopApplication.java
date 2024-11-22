package com.javaacademy.bank_aop;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.math.BigDecimal;

@SpringBootApplication
@Slf4j
public class BankAopApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(BankAopApplication.class, args);
		CreditService creditService = context.getBean(CreditService.class);
		creditService.takeOffer(new Person(BigDecimal.ZERO, 0));

	}

}
