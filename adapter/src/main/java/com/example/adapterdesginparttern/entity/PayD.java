package com.example.adapterdesginparttern.entity;

import lombok.Data;

@Data
public class PayD {
    private String customerCardNo;
    private String cardOwnerFullName;
    private String cardExpMonthDate;
    private Integer CVVNo;
    private Double totalAmount;
}
