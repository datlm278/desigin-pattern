package com.example.mediator.services.support;

public class Motor {
    public void startMotor(){
        System.out.println("Start motor...");
    }

    public void rotateDrum(int rpm){
        System.out.printf("Rotating drum at %d rpm.\n", rpm);
    }
}
