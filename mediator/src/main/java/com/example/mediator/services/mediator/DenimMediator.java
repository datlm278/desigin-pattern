package com.example.mediator.services.mediator;

import com.example.mediator.services.MachineMediator;
import com.example.mediator.services.support.*;

public class DenimMediator implements MachineMediator {

    private final Machine machine;
    private final Heater heater;
    private final Weighing weighing;
    private final Motor motor;
    private final Sensor sensor;
    private final SoilRemoval soilRemoval;
    private final Valve valve;

    public DenimMediator(Machine machine, Heater heater, Weighing weighing, Motor motor, Sensor sensor, SoilRemoval soilRemoval, Valve valve) {
        this.machine = machine;
        this.heater = heater;
        this.weighing = weighing;
        this.motor = motor;
        this.sensor = sensor;
        this.soilRemoval = soilRemoval;
        this.valve = valve;

        System.out.println("Setting up for DENIM program");
    }

    @Override
    public void start() {
        machine.start();
    }

    @Override
    public void wash() {
        motor.startMotor();
        motor.rotateDrum(1400);
        System.out.println("Adding detergent");
        soilRemoval.medium();
        System.out.println("Adding softener");
    }

    @Override
    public void open() {
        valve.open();
    }

    @Override
    public void closed() {
        valve.closed();
    }

    @Override
    public void on() {
        heater.on(30.0);
        weighing.on(8.5);
    }

    @Override
    public void off() {
        weighing.off();
        heater.off();
    }

    @Override
    public boolean checkTemperature(Double temp) {
        return sensor.checkTemperature(temp);
    }

    @Override
    public boolean checkWeight(Double weight) {
        return sensor.checkWeight(weight);
    }
}
