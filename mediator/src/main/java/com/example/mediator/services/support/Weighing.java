package com.example.mediator.services.support;

import com.example.mediator.services.Colleague;
import com.example.mediator.services.MachineMediator;

public class Weighing implements Colleague {

    private MachineMediator mediator;

    @Override
    public void setMediator(MachineMediator mediator) {
        this.mediator = mediator;
    }

    public void on (double weight) {
        System.out.println("Weighing is on ...");
        if (mediator.checkWeight(weight)) {
            System.out.printf("The water level has been adjusted to %.2f kg\n", weight);
            mediator.off();
        }
    }

    public void off () {
        System.out.println("Weighing is off ...");
//        mediator.wash();
    }
}
