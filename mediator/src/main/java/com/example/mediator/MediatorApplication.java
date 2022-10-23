package com.example.mediator;

import com.example.mediator.services.MachineMediator;
import com.example.mediator.services.mediator.CottonMediator;
import com.example.mediator.services.mediator.DenimMediator;
import com.example.mediator.services.support.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MediatorApplication {

    public static void main(String[] args) {
        SpringApplication.run(MediatorApplication.class, args);

        MachineMediator mediator = null;
        Sensor sensor = new Sensor();
        SoilRemoval soilRemoval = new SoilRemoval();
        Motor motor = new Motor();
        Machine machine = new Machine();
        Heater heater = new Heater();
        Weighing weighing = new Weighing();
        Valve valve = new Valve();
        Button button = new Button();

        System.out.println("-----------------------------");

        mediator = new CottonMediator(machine, heater, weighing, motor, sensor, soilRemoval, valve);

        button.setMediator(mediator);
        machine.setMediator(mediator);
        heater.setMediator(mediator);
        weighing.setMediator(mediator);
        valve.setMediator(mediator);
        button.press();

        System.out.println("-----------------------------");

        mediator = new DenimMediator(machine, heater, weighing, motor, sensor, soilRemoval, valve);

        button.setMediator(mediator);
        machine.setMediator(mediator);
        heater.setMediator(mediator);
        weighing.setMediator(mediator);
        valve.setMediator(mediator);
        button.press();
    }

}
