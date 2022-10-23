package com.example.composite.address;

import java.util.List;

public abstract class Address {
    protected String address;

    public Address(String address) {
        this.address = address;
    }

    public abstract void sendMessageToAddress();
}
