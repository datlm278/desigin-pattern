package com.example.adapterdesginparttern.controller;

import com.example.adapterdesginparttern.entity.PayD;
import com.example.adapterdesginparttern.entity.XPay;
import com.example.adapterdesginparttern.service.XPayToPayDAdapter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/adapter")
public class XPayToPayDAdapterController {

    @Autowired
    private XPayToPayDAdapter xPayToPayDAdapter;

    @PostMapping (value = "/xpay-to-payd")
    public ResponseEntity<PayD> XPayToPayDAdapter (@RequestBody XPay xPay) {
        return ResponseEntity.ok().body(xPayToPayDAdapter.setProperties(xPay));
    }

}
