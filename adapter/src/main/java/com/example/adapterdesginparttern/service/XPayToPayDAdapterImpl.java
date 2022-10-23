package com.example.adapterdesginparttern.service;

import com.example.adapterdesginparttern.entity.PayD;
import com.example.adapterdesginparttern.entity.XPay;
import org.springframework.stereotype.Service;

@Service
public class XPayToPayDAdapterImpl implements XPayToPayDAdapter {

    @Override
    public PayD setProperties(XPay xPay) {
        PayD payDResponse = new PayD();
        payDResponse.setCustomerCardNo(xPay.getCreditCardNo());
        payDResponse.setCardOwnerFullName(xPay.getMiddleName() + " " + xPay.getName());
        payDResponse.setCVVNo(Integer.valueOf(xPay.getCardCVVNo()));
        payDResponse.setCardExpMonthDate(xPay.getCardExpMonth() + "/" + xPay.getCardExpYear());
        payDResponse.setTotalAmount(xPay.getAmount());
        return payDResponse;
    }
}
