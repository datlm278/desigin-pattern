package com.example.chainofresponsibility;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ChainOfResponsibilityApplication {

    public static void main(String[] args) {
        SpringApplication.run(ChainOfResponsibilityApplication.class, args);

        RequestWorkFlow.getApprover().approveRequest(new Request(2L));
        System.out.println("-----");
        RequestWorkFlow.getApprover().approveRequest(new Request(6L));
        System.out.println("-----");
        RequestWorkFlow.getApprover().approveRequest(new Request(10L));
    }
}
