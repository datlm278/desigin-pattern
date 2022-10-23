package com.example.mediator.services.support;

public class Sensor {
    public boolean checkTemperature (double temp) {
        System.out.printf("Temperature reached %.2f *C\n", temp);
        return true;
    }

    public boolean checkWeight (double weight) {
        System.out.printf("The weight of the clothes is %.2f kg\n", weight);
        return true;
    }
}
