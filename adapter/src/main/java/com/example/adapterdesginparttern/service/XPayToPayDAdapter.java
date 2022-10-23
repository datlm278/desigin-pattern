package com.example.adapterdesginparttern.service;

import com.example.adapterdesginparttern.entity.PayD;
import com.example.adapterdesginparttern.entity.XPay;

public interface XPayToPayDAdapter {
    PayD setProperties(XPay xPay);
}
