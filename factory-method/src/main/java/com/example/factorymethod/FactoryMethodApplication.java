package com.example.factorymethod;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FactoryMethodApplication {

    public static void main(String[] args) {
        SpringApplication.run(FactoryMethodApplication.class, args);

        Report report = ReportFactory.getReport(ReportType.MULTIPLE_CHOICE);
        System.out.println(report.getResult());
    }

}
