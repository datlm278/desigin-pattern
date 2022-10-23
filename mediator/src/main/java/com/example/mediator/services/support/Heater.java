package com.example.mediator.services.support;

import com.example.mediator.services.Colleague;
import com.example.mediator.services.MachineMediator;

public class Heater implements Colleague {

    private MachineMediator mediator;

    @Override
    public void setMediator(MachineMediator mediator) {
        this.mediator = mediator;
    }

    public void on (double temp) {
        System.out.println("Heater is on ...");
        if (mediator.checkTemperature(temp)) {
            System.out.println("Temperature is set to " + temp);
        }
    }

    public void off () {
        System.out.println("Heater is off ...");
        mediator.wash();
    }
}
