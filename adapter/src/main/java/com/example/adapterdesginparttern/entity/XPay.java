package com.example.adapterdesginparttern.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class XPay {
    private String creditCardNo;
    private String name;
    private String middleName;
    private String cardExpMonth;
    private String cardExpYear;
    private Short cardCVVNo;
    private Double amount;
}
