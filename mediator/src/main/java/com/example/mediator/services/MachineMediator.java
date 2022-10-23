package com.example.mediator.services;

public interface MachineMediator {
    void start();
    void wash();
    void open();
    void closed();
    void on();
    void off();
    boolean checkTemperature(Double temp);
    boolean checkWeight(Double weight);
}
