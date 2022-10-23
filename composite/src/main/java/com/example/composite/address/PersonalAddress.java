package com.example.composite.address;

public class PersonalAddress extends Address{
    public PersonalAddress(String address) {
        super(address);
    }

    @Override
    public void sendMessageToAddress() {
        String message = "message sent to personal address is " + address;
        System.out.println(message);
    }
}
