package com.example.mediator.services.support;

import com.example.mediator.services.Colleague;
import com.example.mediator.services.MachineMediator;

public class Button implements Colleague {

    private MachineMediator mediator;

    @Override
    public void setMediator(MachineMediator mediator) {
        this.mediator = mediator;
    }

    public void press() {
        System.out.println("Button pressed");
        mediator.start();
    }
}
