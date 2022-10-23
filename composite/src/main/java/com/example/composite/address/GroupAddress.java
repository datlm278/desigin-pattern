package com.example.composite.address;

import java.util.ArrayList;
import java.util.List;

public class GroupAddress extends Address implements AddressOperations {

    private final List<Address> lstPersonalAddress;

    public GroupAddress(String address) {
        super(address);
        this.lstPersonalAddress = new ArrayList<>();
    }

    @Override
    public void sendMessageToAddress() {

        System.out.println("message sent to group address is " + address);

        for (Address address : lstPersonalAddress) {
            address.sendMessageToAddress();
        }
    }

    @Override
    public void addPersonalAddress(Address address) {
        lstPersonalAddress.add(address);
    }

    @Override
    public void removePersonalAddress(Address address) {
        lstPersonalAddress.remove(address);
    }
}
